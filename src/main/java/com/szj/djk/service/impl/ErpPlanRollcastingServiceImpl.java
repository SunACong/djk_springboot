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
import java.util.HashMap;
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
    public ProcessMonitor getProcessMonitor(String number, Integer type) {
        ProcessMonitor processMonitor = new ProcessMonitor();
        Boolean[] status = {false, false, false, false, false, false, false, false, false, false, false, false, false};
        processMonitor.setLength(null);
        HashMap<String, String> map = new HashMap<String, String>();
        try {
            // 获取熔次号 铸轧卷号 冷轧卷号
            getSmeltTime(number, type);

            // 获取熔炼工序 熔次号
            LmdpCastSmeltHold lmdpCastSmeltHold = getLmdpCastSmeltHold(smeltTime);
            if (lmdpCastSmeltHold != null){
                status[1] = true;
                processMonitor.setLength(1);
                processMonitor.setStatus(status);
            }
            processMonitor.setLmdpCastSmeltHold(lmdpCastSmeltHold);

            // 铸轧生产计划 lmdpCastSmeltHold.getPlanId()铸轧计划ID
            ErpPlanRollcasting erpPlanRollcasting = getErpPlanRollcasting(lmdpCastSmeltHold.getPlanId());
            if (erpPlanRollcasting != null){
                status[0] = true;
                processMonitor.setLength(2);
                processMonitor.setStatus(status);
            }
            processMonitor.setErpPlanRollcasting(erpPlanRollcasting);

            // 保温工序 熔次号
            LmdpCastHoldingFurnace lmdpCastHoldingFurnace = getLmdpCastHoldingFurnace(smeltTime);
            if (lmdpCastHoldingFurnace != null){
                status[2] = true;
                processMonitor.setLength(3);
                processMonitor.setStatus(status);
            }
            processMonitor.setLmdpCastHoldingFurnace(lmdpCastHoldingFurnace);

            if (type == 0){
                return processMonitor;
            }

            // 铸轧工序 铸轧卷号
            LmdpCastProduce lmdpCastProduce = getLmdpCastProduce(reelNum);
            if (lmdpCastProduce != null){
                status[3] = true;
                processMonitor.setLength(4);
                processMonitor.setStatus(status);
            }
            processMonitor.setLmdpCastProduce(lmdpCastProduce);

            // 铸轧质检 铸轧卷号
            LmdpQcCastReel lmdpQcCastReel = getLmdpQcCastReel(reelNum);
            if (lmdpQcCastReel != null){
                status[4] = true;
                processMonitor.setLength(5);
                processMonitor.setStatus(status);
            }
            processMonitor.setLmdpQcCastReel(lmdpQcCastReel);

            LmdpCastReelStoreRecord lmdpCastReelStoreRecord = getLmdpCastReelStoreRecord(reelNum);//铸轧出入库
            if (lmdpCastReelStoreRecord != null){
                status[5] = true;
                processMonitor.setLength(6);
                processMonitor.setStatus(status);
            }
            processMonitor.setLmdpCastReelStoreRecord(lmdpCastReelStoreRecord);

            if (type == 1){
                return processMonitor;
            }

            // 冷轧计划通过铸轧卷号获取
            ErpPlanColdreductionstrip erpPlanColdreductionstrip = getErpPlanColdreductionstrip(reelNum);
            if (erpPlanColdreductionstrip != null){
                status[6] = true;
                processMonitor.setLength(7);
                processMonitor.setStatus(status);
            }
            processMonitor.setErpPlanColdreductionstrip(erpPlanColdreductionstrip);//冷轧计划

            LmdpColdRecord lmdpColdRecord = getLmdpColdRecord(batchNum);
            if (lmdpColdRecord != null){
                status[7] = true;
                processMonitor.setLength(8);
                processMonitor.setStatus(status);
            }
            processMonitor.setLmdpColdRecord(lmdpColdRecord);

            LmdpColdFurnaceRecord lmdpColdFurnaceRecord = getLmdpColdFurnaceRecord(batchNum);
            if (lmdpColdFurnaceRecord != null){
                status[8] = true;
                processMonitor.setLength(9);
                processMonitor.setStatus(status);
            }
            processMonitor.setLmdpColdFurnaceRecord(lmdpColdFurnaceRecord);//退火工序

            LmdpColdRereelerRecord lmdpColdRereelerRecord = getLmdpColdRereelerRecord(batchNum);
            if (lmdpColdRereelerRecord != null){
                status[9] = true;
                processMonitor.setLength(10);
                processMonitor.setStatus(status);
            }
            processMonitor.setLmdpColdRereelerRecord(lmdpColdRereelerRecord);//重卷工序

            LmdpQcColdReelReport lmdpQcColdReelReport = getLmdpQcColdReelReport(batchNum);
            if (lmdpQcColdReelReport != null){
                status[10] = true;
                processMonitor.setLength(11);
                processMonitor.setStatus(status);
            }
            processMonitor.setLmdpQcColdReelReport(lmdpQcColdReelReport);//冷轧质检

//            LmdpQcColdInspect lmdpQcColdInspect = getLmdpQcColdInspect(batchNum);
//            if (lmdpQcColdInspect != null){
//                status[10] = true;
//                processMonitor.setLength(11);
//                processMonitor.setStatus(status);
//            }
//            processMonitor.setLmdpQcColdInspect(lmdpQcColdInspect);//冷轧工序质量巡检

            LmdpColdStoreRecord lmdpColdStoreRecord = getLmdpColdStoreRecord(batchNum);
            if (lmdpColdStoreRecord != null){
                status[11] = true;
                processMonitor.setLength(12);
                processMonitor.setStatus(status);
            }
            processMonitor.setLmdpColdStoreRecord(lmdpColdStoreRecord);//冷轧出入库

//            LmdpQcColdReelReport lmdpQcColdReelReport = getLmdpQcColdReelReport(batchNum);
//            processMonitor.setLmdpQcColdReelReport(lmdpQcColdReelReport);//冷轧质检

            LmdpQcComplaintDetail lmdpQcComplaintDetail = getLmdpQcComplaintDetail(batchNum);
            if (lmdpQcComplaintDetail != null){
                status[12] = true;
                processMonitor.setLength(13);
                processMonitor.setStatus(status);
            }
            processMonitor.setLmdpQcComplaintDetail(lmdpQcComplaintDetail);//投诉及处理信息


        } catch (CustomException e) {
            log.error(e.getMessage());
            return processMonitor;
        }
        return processMonitor;
    }

    // 熔次号
    private String smeltTime;
    // 铸轧卷号
    private String reelNum;
    // 冷轧卷号
    private String batchNum;

    /**
     * 无论输入什么输出熔次号
     */
    private void getSmeltTime(String number, Integer type)  throws CustomException{
        LambdaQueryWrapper<LmdpCastProduce> queryWrapper = new LambdaQueryWrapper<>();
        if (type == 0){
            smeltTime = number;
            reelNum = null;
            batchNum = null;
        }else if (type == 1){
            reelNum = number;
            queryWrapper.eq(LmdpCastProduce::getReelNum, number);
            List<LmdpCastProduce> list = lmdpCastProduceService.list(queryWrapper);
            if (list.size() != 0){
                smeltTime = list.get(0).getSmeltTimes();
            }
            batchNum = null;
        }else if (type == 2){
            batchNum = number;
            String reelNum1 = erpCastingCheckRecordService.getReelNum(number.substring(0, 8));
            reelNum = reelNum1;
            queryWrapper.eq(LmdpCastProduce::getReelNum, reelNum);
            List<LmdpCastProduce> list = lmdpCastProduceService.list(queryWrapper);
            if (list.size() != 0){
                smeltTime = list.get(0).getSmeltTimes();
            }
        }
        System.out.println("熔次号:"+smeltTime+","+"铸轧卷号:"+reelNum+","+"冷轧卷号:"+batchNum);
    }

    /**
     * 根据铸轧卷号获取冷轧计划标号
     */
    private String getLZPlanId(String reelNum)  throws CustomException {
        LambdaQueryWrapper<LmdpCastProduce> queryWrapper = new LambdaQueryWrapper<LmdpCastProduce>();
        String planId = "";
        queryWrapper.eq(LmdpCastProduce::getReelNum, reelNum);
        List<LmdpCastProduce> list = lmdpCastProduceService.list(queryWrapper);
        if (list.size() != 0) {
            return list.get(0).getPlanId();
        }
        log.info("未找到冷轧计划标号");
        return null;
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
        if (list.size() != 0){
            return list.get(0);
        }
        log.info("未找铸轧计划表");
        return null;
    }

    /**
     * 获取熔炼工序
     */
    private LmdpCastSmeltHold getLmdpCastSmeltHold(String smeltTimes) throws CustomException{
        LambdaQueryWrapper<LmdpCastSmeltHold> queryWrapper = new LambdaQueryWrapper<LmdpCastSmeltHold>();
        queryWrapper.eq(LmdpCastSmeltHold::getSmeltTimes, smeltTimes);
        List<LmdpCastSmeltHold> list = lmdpCastSmeltHoldService.list(queryWrapper);
        if (list.size() != 0){
            return list.get(0);
        }
        log.info("未找到熔炼工序");
        return null;
    }
    /**
     * 获取保温工序
     */
    private LmdpCastHoldingFurnace getLmdpCastHoldingFurnace(String smeltTimes)  throws CustomException{
        LambdaQueryWrapper<LmdpCastHoldingFurnace> queryWrapper = new LambdaQueryWrapper<LmdpCastHoldingFurnace>();
        queryWrapper.eq(LmdpCastHoldingFurnace::getSmeltTimes, smeltTimes);
        List<LmdpCastHoldingFurnace> list = lmdpCastHoldingFurnaceService.list(queryWrapper);
        if (list.size() != 0) {
            return list.get(0);
        }
        log.info("未找到保温工序");
        return null;
    }

    /**
     * 获取铸轧工序
     */
    private LmdpCastProduce getLmdpCastProduce(String reelNum) throws CustomException {
        LambdaQueryWrapper<LmdpCastProduce> queryWrapper = new LambdaQueryWrapper<LmdpCastProduce>();
        queryWrapper.eq(LmdpCastProduce::getReelNum, reelNum);
        List<LmdpCastProduce> list = lmdpCastProduceService.list(queryWrapper);
        if (list.size() != 0) {
            return list.get(0);
        }
        log.info("未找到铸轧工序");
        return null;
    }
    /**
     * 获取铸轧出入库记录
     */
    private LmdpCastReelStoreRecord getLmdpCastReelStoreRecord(String reelNum)  throws CustomException{
        LambdaQueryWrapper<LmdpCastReelStoreRecord> queryWrapper = new LambdaQueryWrapper<LmdpCastReelStoreRecord>();
        queryWrapper.eq(LmdpCastReelStoreRecord::getReelNum, reelNum);
        List<LmdpCastReelStoreRecord> list = lmdpCastReelStoreRecordService.list(queryWrapper);
        if (list.size() != 0) {
            return list.get(0);
        }
        log.info("未找到铸轧出入库记录");
        return null;
    }
    /**
     * 铸轧卷质检报告
     */
    private LmdpQcCastReel getLmdpQcCastReel(String reelNum)  throws CustomException{
        LambdaQueryWrapper<LmdpQcCastReel> queryWrapper = new LambdaQueryWrapper<LmdpQcCastReel>();
        queryWrapper.eq(LmdpQcCastReel::getReelNum, reelNum);
        List<LmdpQcCastReel> list = lmdpQcCastReelService.list(queryWrapper);
        if (list.size() != 0) {
            return list.get(0);
        }
        log.info("未找到铸轧卷质检报告");
        return null;
    }
    /**
     * 查询冷轧计划表
     */
    private ErpPlanColdreductionstrip getErpPlanColdreductionstrip(String reelNum) throws CustomException{
        ErpPlanColdreductionstrip coldPlan = erpPlanColdreductionstripService.getColdPlan(reelNum);
        if (coldPlan != null){
            return coldPlan;
        }
        log.info("未找到冷轧计划表");
        return null;
    }

    /**
     * 冷轧工序
     */
    private LmdpColdRecord getLmdpColdRecord(String batchNum) throws CustomException{
        LambdaQueryWrapper<LmdpColdRecord> queryWrapper = new LambdaQueryWrapper<LmdpColdRecord>();
        queryWrapper.eq(LmdpColdRecord::getBatchNum, batchNum.substring(0, 8));
        List<LmdpColdRecord> list = lmdpColdRecordService.list(queryWrapper);
        if (list.size() != 0){
            return list.get(0);
        }
        log.info("未找到冷轧工序");
        return null;
    }

    /**
     * 退火工序
     */
    private LmdpColdFurnaceRecord getLmdpColdFurnaceRecord(String batchNum) throws CustomException{
        LambdaQueryWrapper<LmdpColdFurnaceRecord> queryWrapper = new LambdaQueryWrapper<LmdpColdFurnaceRecord>();
        queryWrapper.apply("FIND_IN_SET( {0}, batch_num) or {1} in (batch_num,batch_num2,batch_num3,batch_num4)", batchNum.substring(0, 8), batchNum.substring(0, 8))
                .orderByDesc(LmdpColdFurnaceRecord::getTs)
                .last("limit 1");
        List<LmdpColdFurnaceRecord> list = lmdpColdFurnaceRecordService.list(queryWrapper);
        if (list.size() != 0){
            return list.get(0);
        }
        log.info("未找到退火工序");
        return null;
    }
    /**
     * 重卷工序
     */
    private LmdpColdRereelerRecord getLmdpColdRereelerRecord(String batchNum) throws CustomException{
        LambdaQueryWrapper<LmdpColdRereelerRecord> queryWrapper = new LambdaQueryWrapper<LmdpColdRereelerRecord>();
        queryWrapper.eq(LmdpColdRereelerRecord::getBatchNum, batchNum);
        List<LmdpColdRereelerRecord> list = lmdpColdRereelerRecordService.list(queryWrapper);
        if (list.size() != 0){
            return list.get(0);
        }
        log.info("未找到重卷工序");
        return null;
    }
    /**
     * 冷轧入库
     */
    private LmdpColdStoreRecord getLmdpColdStoreRecord(String batchNum) throws CustomException{
        LambdaQueryWrapper<LmdpColdStoreRecord> queryWrapper = new LambdaQueryWrapper<LmdpColdStoreRecord>();
        queryWrapper.eq(LmdpColdStoreRecord::getReelNum, batchNum);
        List<LmdpColdStoreRecord> list = lmdpColdStoreRecordService.list(queryWrapper);
        if (list.size() != 0){
            return list.get(0);
        }
        log.info("未找到冷轧入库");
        return null;
    }
    /**
     * 冷轧工序质检
     */
    private LmdpQcColdInspect getLmdpQcColdInspect(String batchNum) throws CustomException{
        LambdaQueryWrapper<LmdpQcColdInspect> queryWrapper = new LambdaQueryWrapper<LmdpQcColdInspect>();
        queryWrapper.eq(LmdpQcColdInspect::getBatchNum, batchNum);
        List<LmdpQcColdInspect> list = lmdpQcColdInspectService.list(queryWrapper);
        if (list.size() != 0){
            return list.get(0);
        }
        log.info("未找到冷轧工序质检");
        return null;
    }
    /**
     * 冷轧质检报告
     */
    private LmdpQcColdReelReport getLmdpQcColdReelReport(String batchNum) throws CustomException{
        LambdaQueryWrapper<LmdpQcColdReelReport> queryWrapper = new LambdaQueryWrapper<LmdpQcColdReelReport>();
        queryWrapper.eq(LmdpQcColdReelReport::getBatchNum, batchNum);
        List<LmdpQcColdReelReport> list = lmdpQcColdReelReportService.list(queryWrapper);
        if (list.size() != 0){
            return list.get(0);
        }
        log.info("未找到冷轧质检报告");
        return null;
    }
    /**
     * 投诉处理
     */
    private LmdpQcComplaintDetail getLmdpQcComplaintDetail(String batchNum) throws CustomException{
        LambdaQueryWrapper<LmdpQcComplaintDetail> queryWrapper = new LambdaQueryWrapper<LmdpQcComplaintDetail>();
        queryWrapper.eq(LmdpQcComplaintDetail::getBatchNum, batchNum);
        List<LmdpQcComplaintDetail> list = lmdpQcComplaintDetailService.list(queryWrapper);
        if (list.size() != 0){
            return list.get(0);
        }
        log.info("未找到投诉处理");
        return null;
    }
}




