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
    @Resource
    private ReportDictService reportDictService;

    @Resource
    private SysUserService sysUserService;

    @Override
    public ProcessMonitor getProcessMonitor(String number, Integer type) {
        ProcessMonitor processMonitor = new ProcessMonitor();
        Boolean[] status = {false, false, false, false, false, false, false, false, false, false, false, false, false};
        processMonitor.setLength(null);
        HashMap<String, String> userMap = saveUserDict();
//        HashMap<String, String> dictMap = saveTableDict();
//        HashMap<String, String> map = new HashMap<String, String>();
        try {
            // 获取熔次号 铸轧卷号 冷轧卷号
            getSmeltTime(number, type);

            // 获取熔炼工序 熔次号
            LmdpCastSmeltHold lmdpCastSmeltHold = getLmdpCastSmeltHold(smeltTime, userMap);
            if (lmdpCastSmeltHold != null){
                status[1] = true;
                processMonitor.setLength(1);
                processMonitor.setStatus(status);
            }
            processMonitor.setLmdpCastSmeltHold(lmdpCastSmeltHold);

            // 铸轧生产计划 lmdpCastSmeltHold.getPlanId()铸轧计划ID
            ErpPlanRollcasting erpPlanRollcasting = getErpPlanRollcasting(lmdpCastSmeltHold.getPlanId(), userMap);
            if (erpPlanRollcasting != null){
                status[0] = true;
                processMonitor.setLength(2);
                processMonitor.setStatus(status);
            }
            processMonitor.setErpPlanRollcasting(erpPlanRollcasting);

            // 保温工序 熔次号
            LmdpCastHoldingFurnace lmdpCastHoldingFurnace = getLmdpCastHoldingFurnace(smeltTime, userMap);
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
            LmdpCastProduce lmdpCastProduce = getLmdpCastProduce(reelNum, userMap);
            if (lmdpCastProduce != null){
                status[3] = true;
                processMonitor.setLength(4);
                processMonitor.setStatus(status);
            }
            processMonitor.setLmdpCastProduce(lmdpCastProduce);

            // 铸轧质检 铸轧卷号
            LmdpQcCastReel lmdpQcCastReel = getLmdpQcCastReel(reelNum, userMap);
            if (lmdpQcCastReel != null){
                status[4] = true;
                processMonitor.setLength(5);
                processMonitor.setStatus(status);
            }
            processMonitor.setLmdpQcCastReel(lmdpQcCastReel);

            LmdpCastReelStoreRecord lmdpCastReelStoreRecord = getLmdpCastReelStoreRecord(reelNum, userMap);//铸轧出入库
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
            ErpPlanColdreductionstrip erpPlanColdreductionstrip = getErpPlanColdreductionstrip(reelNum, userMap);
            if (erpPlanColdreductionstrip != null){
                status[6] = true;
                processMonitor.setLength(7);
                processMonitor.setStatus(status);
            }
            processMonitor.setErpPlanColdreductionstrip(erpPlanColdreductionstrip);//冷轧计划

            LmdpColdRecord lmdpColdRecord = getLmdpColdRecord(batchNum, userMap);
            if (lmdpColdRecord != null){
                status[7] = true;
                processMonitor.setLength(8);
                processMonitor.setStatus(status);
            }
            processMonitor.setLmdpColdRecord(lmdpColdRecord);

            LmdpColdFurnaceRecord lmdpColdFurnaceRecord = getLmdpColdFurnaceRecord(batchNum, userMap);
            if (lmdpColdFurnaceRecord != null){
                status[8] = true;
                processMonitor.setLength(9);
                processMonitor.setStatus(status);
            }
            processMonitor.setLmdpColdFurnaceRecord(lmdpColdFurnaceRecord);//退火工序

            LmdpColdRereelerRecord lmdpColdRereelerRecord = getLmdpColdRereelerRecord(batchNum, userMap);
            if (lmdpColdRereelerRecord != null){
                status[9] = true;
                processMonitor.setLength(10);
                processMonitor.setStatus(status);
            }
            processMonitor.setLmdpColdRereelerRecord(lmdpColdRereelerRecord);//重卷工序

            LmdpQcColdReelReport lmdpQcColdReelReport = getLmdpQcColdReelReport(batchNum, userMap);
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

            LmdpColdStoreRecord lmdpColdStoreRecord = getLmdpColdStoreRecord(batchNum, userMap);
            if (lmdpColdStoreRecord != null){
                status[11] = true;
                processMonitor.setLength(12);
                processMonitor.setStatus(status);
            }
            processMonitor.setLmdpColdStoreRecord(lmdpColdStoreRecord);//冷轧出入库

//            LmdpQcColdReelReport lmdpQcColdReelReport = getLmdpQcColdReelReport(batchNum);
//            processMonitor.setLmdpQcColdReelReport(lmdpQcColdReelReport);//冷轧质检

            LmdpQcComplaintDetail lmdpQcComplaintDetail = getLmdpQcComplaintDetail(batchNum, userMap);
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

    /**
     * 存储report_dict字典表中的字典
     * @return 返回字典map
     */
    private HashMap<String, String> saveTableDict(){
        HashMap<String, String> map = new HashMap<>();
        List<ReportDict> list = reportDictService.list();
        list.forEach(item -> {
            map.put(item.getType()+'_'+item.getValue(), item.getChdesc());
        });
        return map;
    }

    /**
     * 存储用户表字典
     * @return 用户map
     */
    private HashMap<String, String> saveUserDict(){
        HashMap<String, String> map = new HashMap<>();
        List<SysUser> list = sysUserService.list();
        list.forEach(item -> {
            map.put(item.getUserId(), item.getRealName());
        });
        return map;
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
    private ErpPlanRollcasting getErpPlanRollcasting(String planId, HashMap<String, String> userMap)  throws CustomException{
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
    private LmdpCastSmeltHold getLmdpCastSmeltHold(String smeltTimes, HashMap<String, String> userMap) throws CustomException{
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
    private LmdpCastHoldingFurnace getLmdpCastHoldingFurnace(String smeltTimes, HashMap<String, String> userMap)  throws CustomException{
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
    private LmdpCastProduce getLmdpCastProduce(String reelNum, HashMap<String, String> userMap) throws CustomException {
        LambdaQueryWrapper<LmdpCastProduce> queryWrapper = new LambdaQueryWrapper<LmdpCastProduce>();
        queryWrapper.eq(LmdpCastProduce::getReelNum, reelNum);
        List<LmdpCastProduce> list = lmdpCastProduceService.list(queryWrapper);
        if (list.size() != 0) {
            LmdpCastProduce lmdpCastProduce = list.get(0);
//            lmdpCastProduce.setParamCastTiBrand(dictMap.get("cast_ti_brand_"+lmdpCastProduce.getParamCastTiBrand()));
//            lmdpCastProduce.setProcUpperGroupId(dictMap.get("work_group_"+lmdpCastProduce.getProcUpperGroupId()));
//            lmdpCastProduce.setProcBigGroupId(dictMap.get("work_group_"+lmdpCastProduce.getProcBigGroupId()));
//            lmdpCastProduce.setProcLowerGroupId(dictMap.get("work_group_"+lmdpCastProduce.getProcLowerGroupId()));
//            lmdpCastProduce.setProcessQcDutyGroupId(dictMap.get("work_group_"+lmdpCastProduce.getProcessQcDutyGroupId()));
//            lmdpCastProduce.setProcBeforeStabilizerCheck(dictMap.get("device_inspect_status_"+lmdpCastProduce.getProcBeforeStabilizerCheck()));
//            lmdpCastProduce.setProcAfterStabilizerCheck(dictMap.get("device_inspect_status_"+lmdpCastProduce.getProcAfterStabilizerCheck()));
//            lmdpCastProduce.setProcStabilizerStatus(dictMap.get("device_inspect_status_"+lmdpCastProduce.getProcStabilizerStatus()));

            lmdpCastProduce.setProcUpperCasterId(userMap.get(lmdpCastProduce.getProcUpperCasterId()));
            lmdpCastProduce.setProcBigCasterId(userMap.get(lmdpCastProduce.getProcBigCasterId()));
            lmdpCastProduce.setProcLowerCasterId(userMap.get(lmdpCastProduce.getProcLowerCasterId()));
            lmdpCastProduce.setProcOperatorId(userMap.get(lmdpCastProduce.getProcOperatorId()));
            return lmdpCastProduce;
        }
        log.info("未找到铸轧工序");
        return null;
    }
    /**
     * 获取铸轧出入库记录
     */
    private LmdpCastReelStoreRecord getLmdpCastReelStoreRecord(String reelNum, HashMap<String, String> userMap)  throws CustomException{
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
    private LmdpQcCastReel getLmdpQcCastReel(String reelNum, HashMap<String, String> userMap)  throws CustomException{
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
    private ErpPlanColdreductionstrip getErpPlanColdreductionstrip(String reelNum, HashMap<String, String> userMap) throws CustomException{
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
    private LmdpColdRecord getLmdpColdRecord(String batchNum, HashMap<String, String> userMap) throws CustomException{
        LambdaQueryWrapper<LmdpColdRecord> queryWrapper = new LambdaQueryWrapper<LmdpColdRecord>();
        queryWrapper.eq(LmdpColdRecord::getBatchNum, batchNum.substring(0, 8));
        List<LmdpColdRecord> list = lmdpColdRecordService.list(queryWrapper);
        if (list.size() != 0){
            LmdpColdRecord lmdpColdRecord = list.get(0);
            lmdpColdRecord.setMainOperator(userMap.get(lmdpColdRecord.getMainOperator()));
            lmdpColdRecord.setMainOperator2(userMap.get(lmdpColdRecord.getMainOperator2()));
            lmdpColdRecord.setMainOperator3(userMap.get(lmdpColdRecord.getMainOperator3()));
            lmdpColdRecord.setMainOperator4(userMap.get(lmdpColdRecord.getMainOperator4()));
            lmdpColdRecord.setMainOperator5(userMap.get(lmdpColdRecord.getMainOperator5()));
            lmdpColdRecord.setMainOperator6(userMap.get(lmdpColdRecord.getMainOperator6()));
            lmdpColdRecord.setMainOperator7(userMap.get(lmdpColdRecord.getMainOperator7()));
            lmdpColdRecord.setMainOperator8(userMap.get(lmdpColdRecord.getMainOperator8()));
            lmdpColdRecord.setWelder1(userMap.get(lmdpColdRecord.getWelder1()));
            lmdpColdRecord.setWelder2(userMap.get(lmdpColdRecord.getWelder2()));
            lmdpColdRecord.setWelder3(userMap.get(lmdpColdRecord.getWelder3()));
            lmdpColdRecord.setWelder4(userMap.get(lmdpColdRecord.getWelder4()));
            lmdpColdRecord.setWelder5(userMap.get(lmdpColdRecord.getWelder5()));
            lmdpColdRecord.setWelder6(userMap.get(lmdpColdRecord.getWelder6()));
            lmdpColdRecord.setWelder7(userMap.get(lmdpColdRecord.getWelder7()));
            lmdpColdRecord.setWelder8(userMap.get(lmdpColdRecord.getWelder8()));
            return lmdpColdRecord;
        }
        log.info("未找到冷轧工序");
        return null;
    }

    /**
     * 退火工序
     */
    private LmdpColdFurnaceRecord getLmdpColdFurnaceRecord(String batchNum, HashMap<String, String> userMap) throws CustomException{
        LambdaQueryWrapper<LmdpColdFurnaceRecord> queryWrapper = new LambdaQueryWrapper<LmdpColdFurnaceRecord>();
        queryWrapper.apply("FIND_IN_SET( {0}, batch_num) or {1} in (batch_num,batch_num2,batch_num3,batch_num4)", batchNum.substring(0, 8), batchNum.substring(0, 8))
                .orderByDesc(LmdpColdFurnaceRecord::getTs)
                .last("limit 1");
        List<LmdpColdFurnaceRecord> list = lmdpColdFurnaceRecordService.list(queryWrapper);
        if (list.size() != 0){
            LmdpColdFurnaceRecord lmdpColdFurnaceRecord = list.get(0);
//            lmdpColdFurnaceRecord.setTempPowerControl(dictMap.get("temp_power_control_"+lmdpColdFurnaceRecord.getTempPowerControl()));
            lmdpColdFurnaceRecord.setCreatorId(userMap.get(lmdpColdFurnaceRecord.getCreatorId()));
            lmdpColdFurnaceRecord.setFurnaceOperator1Id(userMap.get(lmdpColdFurnaceRecord.getFurnaceOperator1Id()));
            lmdpColdFurnaceRecord.setFurnaceOperator2Id(userMap.get(lmdpColdFurnaceRecord.getFurnaceOperator2Id()));
            return lmdpColdFurnaceRecord;
        }
        log.info("未找到退火工序");
        return null;
    }
    /**
     * 重卷工序
     */
    private LmdpColdRereelerRecord getLmdpColdRereelerRecord(String batchNum, HashMap<String, String> userMap) throws CustomException{
        LambdaQueryWrapper<LmdpColdRereelerRecord> queryWrapper = new LambdaQueryWrapper<LmdpColdRereelerRecord>();
        queryWrapper.eq(LmdpColdRereelerRecord::getBatchNum, batchNum);
        List<LmdpColdRereelerRecord> list = lmdpColdRereelerRecordService.list(queryWrapper);
        if (list.size() != 0){
            LmdpColdRereelerRecord lmdpColdRereelerRecord = list.get(0);
            lmdpColdRereelerRecord.setSleeveInspectorId(userMap.get(lmdpColdRereelerRecord.getSleeveInspectorId()));
            lmdpColdRereelerRecord.setMainOperator(userMap.get(lmdpColdRereelerRecord.getMainOperator()));
            lmdpColdRereelerRecord.setSleeveCheckerId(userMap.get(lmdpColdRereelerRecord.getSleeveCheckerId()));
            return lmdpColdRereelerRecord;
        }
        log.info("未找到重卷工序");
        return null;
    }
    /**
     * 冷轧入库
     */
    private LmdpColdStoreRecord getLmdpColdStoreRecord(String batchNum, HashMap<String, String> userMap) throws CustomException{
        LambdaQueryWrapper<LmdpColdStoreRecord> queryWrapper = new LambdaQueryWrapper<LmdpColdStoreRecord>();
        queryWrapper.eq(LmdpColdStoreRecord::getReelNum, batchNum);
        List<LmdpColdStoreRecord> list = lmdpColdStoreRecordService.list(queryWrapper);
        if (list.size() != 0){
            LmdpColdStoreRecord lmdpColdStoreRecord = list.get(0);
            lmdpColdStoreRecord.setStorerId(userMap.get(lmdpColdStoreRecord.getStorerId()));
            return lmdpColdStoreRecord;
        }
        log.info("未找到冷轧入库");
        return null;
    }
    /**
     * 冷轧工序质检
     */
    private LmdpQcColdInspect getLmdpQcColdInspect(String batchNum, HashMap<String, String> userMap) throws CustomException{
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
    private LmdpQcColdReelReport getLmdpQcColdReelReport(String batchNum, HashMap<String, String> userMap) throws CustomException{
        LambdaQueryWrapper<LmdpQcColdReelReport> queryWrapper = new LambdaQueryWrapper<LmdpQcColdReelReport>();
        queryWrapper.eq(LmdpQcColdReelReport::getBatchNum, batchNum);
        List<LmdpQcColdReelReport> list = lmdpQcColdReelReportService.list(queryWrapper);
        if (list.size() != 0){
            LmdpQcColdReelReport lmdpQcColdReelReport = list.get(0);
            lmdpQcColdReelReport.setInspector(userMap.get(lmdpQcColdReelReport.getInspector()));
            lmdpQcColdReelReport.setMonitor(userMap.get(lmdpQcColdReelReport.getMonitor()));
            return lmdpQcColdReelReport;
        }
        log.info("未找到冷轧质检报告");
        return null;
    }
    /**
     * 投诉处理
     */
    private LmdpQcComplaintDetail getLmdpQcComplaintDetail(String batchNum, HashMap<String, String> userMap) throws CustomException{
        LambdaQueryWrapper<LmdpQcComplaintDetail> queryWrapper = new LambdaQueryWrapper<LmdpQcComplaintDetail>();
        queryWrapper.eq(LmdpQcComplaintDetail::getBatchNum, batchNum);
        List<LmdpQcComplaintDetail> list = lmdpQcComplaintDetailService.list(queryWrapper);
        if (list.size() != 0){
            LmdpQcComplaintDetail lmdpQcComplaintDetail = list.get(0);
            lmdpQcComplaintDetail.setManagerId(userMap.get(lmdpQcComplaintDetail.getManagerId()));
            lmdpQcComplaintDetail.setChargeId(userMap.get(lmdpQcComplaintDetail.getChargeId()));
            lmdpQcComplaintDetail.setDirectorId(userMap.get(lmdpQcComplaintDetail.getDirectorId()));
            return lmdpQcComplaintDetail;
        }
        log.info("未找到投诉处理");
        return null;
    }
}




