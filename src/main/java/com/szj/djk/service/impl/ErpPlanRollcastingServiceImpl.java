package com.szj.djk.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.szj.djk.common.CustomException;
import com.szj.djk.entity.*;
import com.szj.djk.mapper.ErpPlanRollcastingMapper;
import com.szj.djk.service.*;
import com.szj.djk.vo.ProcessMonitor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* @author Admin
* @description 针对表【erp_plan_rollcasting(铸轧生产计划表)】的数据库操作Service实现
* @createDate 2023-03-25 13:22:39
*/
@Slf4j
@DS("slave")
@Service
public class ErpPlanRollcastingServiceImpl extends ServiceImpl<ErpPlanRollcastingMapper, ErpPlanRollcasting>
    implements ErpPlanRollcastingService{

    @Resource
    private ErpPlanRollcastingMapper erpPlanRollcastingMapper;
    @Resource
    private ErpCastingCheckRecordService erpCastingCheckRecordService;
    @Resource
    private LmdpCastProduceService lmdpCastProduceService;
    @Resource
    private LmdpCastSmeltHoldService lmdpCastSmeltHoldService;
    @Resource
    private LmdpCastHoldingFurnaceService lmdpCastHoldingFurnaceService;
    @Resource
    private LmdpCastReelStoreRecordService lmdpCastReelStoreRecordService;
    @Resource
    private LmdpQcCastReelService lmdpQcCastReelService;
    @Resource
    private ErpPlanColdreductionstripService erpPlanColdreductionstripService;
    @Resource
    private LmdpColdRecordService lmdpColdRecordService;
    @Resource
    private LmdpColdFurnaceRecordService lmdpColdFurnaceRecordService;
    @Resource
    private LmdpColdRereelerRecordService lmdpColdRereelerRecordService;
    @Resource
    private LmdpColdStoreRecordService  lmdpColdStoreRecordService;
    @Resource
    private LmdpQcColdInspectService lmdpQcColdInspectService;
    @Resource
    private LmdpQcColdReelReportService lmdpQcColdReelReportService;
    @Resource
    private LmdpQcComplaintDetailService lmdpQcComplaintDetailService;

    @Override
    public ProcessMonitor getProcessMonitor(String number, String type) {
        String smeltTime = getSmeltTime(number, type);
        ProcessMonitor processMonitor = new ProcessMonitor();
        try {
            LmdpCastSmeltHold lmdpCastSmeltHold = getLmdpCastSmeltHold(smeltTime);
            processMonitor.setLmdpCastSmeltHold(lmdpCastSmeltHold);

            ErpPlanRollcasting erpPlanRollcasting = getErpPlanRollcasting(lmdpCastSmeltHold.getPlanId());
            processMonitor.setErpPlanRollcasting(erpPlanRollcasting);

            LmdpCastHoldingFurnace lmdpCastHoldingFurnace = getLmdpCastHoldingFurnace(smeltTime);
            processMonitor.setLmdpCastHoldingFurnace(lmdpCastHoldingFurnace);

            LmdpCastProduce lmdpCastProduce = getLmdpCastProduce(smeltTime);
            processMonitor.setLmdpCastProduce(lmdpCastProduce);

            String reelNum = lmdpCastProduce.getReelNum();
            LmdpCastReelStoreRecord lmdpCastReelStoreRecord = getLmdpCastReelStoreRecord(reelNum);
            processMonitor.setLmdpCastReelStoreRecord(lmdpCastReelStoreRecord);

            LmdpQcCastReel lmdpQcCastReel = getLmdpQcCastReel(reelNum);
            processMonitor.setLmdpQcCastReel(lmdpQcCastReel);

            ErpPlanColdreductionstrip erpPlanColdreductionstrip = getErpPlanColdreductionstrip(reelNum);
            processMonitor.setErpPlanColdreductionstrip(erpPlanColdreductionstrip);

            LmdpColdRecord lmdpColdRecord = getLmdpColdRecord(reelNum);
            processMonitor.setLmdpColdRecord(lmdpColdRecord);

            LmdpColdFurnaceRecord lmdpColdFurnaceRecord = getLmdpColdFurnaceRecord(reelNum);
            processMonitor.setLmdpColdFurnaceRecord(lmdpColdFurnaceRecord);

            LmdpColdRereelerRecord lmdpColdRereelerRecord = getLmdpColdRereelerRecord(reelNum);
            processMonitor.setLmdpColdRereelerRecord(lmdpColdRereelerRecord);

            LmdpColdStoreRecord lmdpColdStoreRecord = getLmdpColdStoreRecord(reelNum);
            processMonitor.setLmdpColdStoreRecord(lmdpColdStoreRecord);

            LmdpQcColdInspect lmdpQcColdInspect = getLmdpQcColdInspect(reelNum);
            processMonitor.setLmdpQcColdInspect(lmdpQcColdInspect);

            LmdpQcColdReelReport lmdpQcColdReelReport = getLmdpQcColdReelReport(reelNum);
            processMonitor.setLmdpQcColdReelReport(lmdpQcColdReelReport);

            LmdpQcComplaintDetail lmdpQcComplaintDetail = getLmdpQcComplaintDetail(reelNum);
            processMonitor.setLmdpQcComplaintDetail(lmdpQcComplaintDetail);
        } catch (CustomException e) {
            log.error(e.getMessage());
            return processMonitor;
        }

        return processMonitor;
    }

    /**
     * 无论输入什么输出熔次号
     */
    private String getSmeltTime(String number, String type)  throws CustomException{
        LambdaQueryWrapper<LmdpCastProduce> queryWrapper = new LambdaQueryWrapper<>();
        if ("1".equals(type)){
            return number;
        }else if ("2".equals(type)){
            queryWrapper.eq(LmdpCastProduce::getReelNum, number);
        }else if ("3".equals(type)){
            String reelNum = erpCastingCheckRecordService.getReelNum(number);
            queryWrapper.eq(LmdpCastProduce::getReelNum, reelNum);
        }
        List<LmdpCastProduce> list = lmdpCastProduceService.list(queryWrapper);
        if (list.size() != 0 && list != null){
            return list.get(0).getSmeltTimes();
        }
        throw new CustomException("未找熔次号");
    }
    /**
     * 根据铸轧卷号获取冷轧计划标号
     */
    private String getLZPlanId(String reelNum)  throws CustomException{
        LambdaQueryWrapper<LmdpCastProduce> queryWrapper = new LambdaQueryWrapper<LmdpCastProduce>();
        String planId = "";
        queryWrapper.eq(LmdpCastProduce::getReelNum, reelNum);
        List<LmdpCastProduce> list = lmdpCastProduceService.list(queryWrapper);
        if (list.size() != 0 && list != null){
            return list.get(0).getPlanId();
        }
        throw new CustomException("未找到冷轧计划标号");
    }
    /**
     * 根据铸轧卷号获取冷轧卷号
     */
    private String getBatchNum(String reelNum){
        return reelNum.substring(0, 8);
    }

    /**
     * 获取铸轧生产计划表
     */
    private ErpPlanRollcasting getErpPlanRollcasting(String planId)  throws CustomException{
        LambdaQueryWrapper<ErpPlanRollcasting> queryWrapper = new LambdaQueryWrapper<ErpPlanRollcasting>();
        queryWrapper.eq(ErpPlanRollcasting::getProduceId, planId);
        List<ErpPlanRollcasting> list = erpPlanRollcastingMapper.selectList(queryWrapper);
        if (list.size() != 0 && list != null){
            return list.get(0);
        }
        throw new CustomException("未找铸轧计划表");
    }
    /**
     * 获取熔炼工序
     */
    private LmdpCastSmeltHold getLmdpCastSmeltHold(String smeltTimes) throws CustomException{
        LambdaQueryWrapper<LmdpCastSmeltHold> queryWrapper = new LambdaQueryWrapper<LmdpCastSmeltHold>();
        queryWrapper.eq(LmdpCastSmeltHold::getSmeltTimes, smeltTimes);
        List<LmdpCastSmeltHold> list = lmdpCastSmeltHoldService.list(queryWrapper);
        if (list.size() != 0 && list != null){
            return list.get(0);
        }
        throw new CustomException("未找到熔炼工序");
    }
    /**
     * 获取保温工序
     */
    private LmdpCastHoldingFurnace getLmdpCastHoldingFurnace(String smeltTimes)  throws CustomException{
        LambdaQueryWrapper<LmdpCastHoldingFurnace> queryWrapper = new LambdaQueryWrapper<LmdpCastHoldingFurnace>();
        queryWrapper.eq(LmdpCastHoldingFurnace::getSmeltTimes, smeltTimes);
        List<LmdpCastHoldingFurnace> list = lmdpCastHoldingFurnaceService.list(queryWrapper);
        if (list.size() != 0 && list != null) {
            return list.get(0);
        }
        throw new CustomException("未找到保温工序");
    }

    /**
     * 获取铸轧工序
     */
    private LmdpCastProduce getLmdpCastProduce(String smeltTimes) throws CustomException {
        LambdaQueryWrapper<LmdpCastProduce> queryWrapper = new LambdaQueryWrapper<LmdpCastProduce>();
        queryWrapper.eq(LmdpCastProduce::getSmeltTimes, smeltTimes);
        List<LmdpCastProduce> list = lmdpCastProduceService.list(queryWrapper);
        if (list.size() != 0 && list != null) {
            return list.get(0);
        }
        throw new CustomException("未找到铸轧工序");
    }
    /**
     * 获取铸轧出入库记录
     */
    private LmdpCastReelStoreRecord getLmdpCastReelStoreRecord(String reelNum)  throws CustomException{
        LambdaQueryWrapper<LmdpCastReelStoreRecord> queryWrapper = new LambdaQueryWrapper<LmdpCastReelStoreRecord>();
        queryWrapper.eq(LmdpCastReelStoreRecord::getReelNum, reelNum);
        List<LmdpCastReelStoreRecord> list = lmdpCastReelStoreRecordService.list(queryWrapper);
        if (list.size() != 0 && list != null) {
            return list.get(0);
        }
        throw new CustomException("未找到铸轧出入库记录");
    }
    /**
     * 铸轧卷质检报告
     */
    private LmdpQcCastReel getLmdpQcCastReel(String reelNum)  throws CustomException{
        LambdaQueryWrapper<LmdpQcCastReel> queryWrapper = new LambdaQueryWrapper<LmdpQcCastReel>();
        queryWrapper.eq(LmdpQcCastReel::getReelNum, reelNum);
        List<LmdpQcCastReel> list = lmdpQcCastReelService.list(queryWrapper);
        if (list.size() != 0 && list != null) {
            return list.get(0);
        }
        throw new CustomException("未找到铸轧卷质检报告");
    }
    /**
     * 查询冷轧计划表
     */
    private ErpPlanColdreductionstrip getErpPlanColdreductionstrip(String reelNum) throws CustomException{
        String batchNum = getBatchNum(reelNum);
        LambdaQueryWrapper<ErpPlanColdreductionstrip> queryWrapper = new LambdaQueryWrapper<ErpPlanColdreductionstrip>();
        queryWrapper.eq(ErpPlanColdreductionstrip::getColdreductionstripNum, batchNum);
        List<ErpPlanColdreductionstrip> list = erpPlanColdreductionstripService.list(queryWrapper);
        if (list.size() != 0 && list != null){
            return list.get(0);
        }
        throw new CustomException("未找到冷轧计划表");
    }

    /**
     * 冷轧工序
     */
    private LmdpColdRecord getLmdpColdRecord(String reelNum) throws CustomException{
        String batchNum = getBatchNum(reelNum);
        LambdaQueryWrapper<LmdpColdRecord> queryWrapper = new LambdaQueryWrapper<LmdpColdRecord>();
        queryWrapper.eq(LmdpColdRecord::getBatchNum, batchNum);
        List<LmdpColdRecord> list = lmdpColdRecordService.list(queryWrapper);
        if (list.size() != 0 && list != null){
            return list.get(0);
        }
        throw new CustomException("未找到冷轧工序");
    }

    /**
     * 退火工序
     */
    private LmdpColdFurnaceRecord getLmdpColdFurnaceRecord(String reelNum) throws CustomException{
        String batchNum = getBatchNum(reelNum);
        LambdaQueryWrapper<LmdpColdFurnaceRecord> queryWrapper = new LambdaQueryWrapper<LmdpColdFurnaceRecord>();
        queryWrapper.eq(LmdpColdFurnaceRecord::getBatchNum, batchNum);
        List<LmdpColdFurnaceRecord> list = lmdpColdFurnaceRecordService.list(queryWrapper);
        if (list.size() != 0 && list != null){
            return list.get(0);
        }
        throw new CustomException("未找到退火工序");
    }
    /**
     * 重卷工序
     */
    private LmdpColdRereelerRecord getLmdpColdRereelerRecord(String reelNum) throws CustomException{
        String batchNum = getBatchNum(reelNum);
        LambdaQueryWrapper<LmdpColdRereelerRecord> queryWrapper = new LambdaQueryWrapper<LmdpColdRereelerRecord>();
        queryWrapper.eq(LmdpColdRereelerRecord::getBatchNum, batchNum);
        List<LmdpColdRereelerRecord> list = lmdpColdRereelerRecordService.list(queryWrapper);
        if (list.size() != 0 && list != null){
            return list.get(0);
        }
        throw new CustomException("未找到重卷工序");
    }
    /**
     * 冷轧入库
     */
    private LmdpColdStoreRecord getLmdpColdStoreRecord(String reelNum) throws CustomException{
        String batchNum = getBatchNum(reelNum);
        LambdaQueryWrapper<LmdpColdStoreRecord> queryWrapper = new LambdaQueryWrapper<LmdpColdStoreRecord>();
        queryWrapper.eq(LmdpColdStoreRecord::getReelNum, batchNum);
        List<LmdpColdStoreRecord> list = lmdpColdStoreRecordService.list(queryWrapper);
        if (list.size() != 0 && list != null){
            return list.get(0);
        }
        throw new CustomException("未找到冷轧入库");
    }
    /**
     * 冷轧工序质检
     */
    private LmdpQcColdInspect getLmdpQcColdInspect(String reelNum) throws CustomException{
        String batchNum = getBatchNum(reelNum);
        LambdaQueryWrapper<LmdpQcColdInspect> queryWrapper = new LambdaQueryWrapper<LmdpQcColdInspect>();
        queryWrapper.eq(LmdpQcColdInspect::getBatchNum, batchNum);
        List<LmdpQcColdInspect> list = lmdpQcColdInspectService.list(queryWrapper);
        if (list.size() != 0 && list != null){
            return list.get(0);
        }
        throw new CustomException("未找到冷轧工序质检");
    }
    /**
     * 冷轧质检报告
     */
    private LmdpQcColdReelReport getLmdpQcColdReelReport(String reelNum) throws CustomException{
        String batchNum = getBatchNum(reelNum);
        LambdaQueryWrapper<LmdpQcColdReelReport> queryWrapper = new LambdaQueryWrapper<LmdpQcColdReelReport>();
        queryWrapper.eq(LmdpQcColdReelReport::getBatchNum, batchNum);
        List<LmdpQcColdReelReport> list = lmdpQcColdReelReportService.list(queryWrapper);
        if (list.size() != 0 && list != null){
            return list.get(0);
        }
        throw new CustomException("未找到冷轧质检报告");
    }
    /**
     * 投诉处理
     */
    private LmdpQcComplaintDetail getLmdpQcComplaintDetail(String reelNum) throws CustomException{
        String batchNum = getBatchNum(reelNum);
        LambdaQueryWrapper<LmdpQcComplaintDetail> queryWrapper = new LambdaQueryWrapper<LmdpQcComplaintDetail>();
        queryWrapper.eq(LmdpQcComplaintDetail::getBatchNum, batchNum);
        List<LmdpQcComplaintDetail> list = lmdpQcComplaintDetailService.list(queryWrapper);
        if (list.size() != 0 && list != null){
            return list.get(0);
        }
        throw new CustomException("未找到投诉处理");
    }
}




