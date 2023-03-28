package com.szj.djk.vo;

import com.szj.djk.entity.*;
import lombok.Data;

/**
 * @author 孙少聪
 * @Date 2023/3/25 14:40:47
 * @Description 流程监控VO类
 */
@Data
public class ProcessMonitor {
    private ErpPlanRollcasting erpPlanRollcasting;
    private LmdpCastSmeltHold lmdpCastSmeltHold;
    private LmdpCastHoldingFurnace lmdpCastHoldingFurnace;
    private LmdpCastProduce lmdpCastProduce;
    private LmdpCastReelStoreRecord lmdpCastReelStoreRecord;
    private LmdpQcCastReel lmdpQcCastReel;
    private ErpPlanColdreductionstrip erpPlanColdreductionstrip;
    private LmdpColdRecord lmdpColdRecord;
    private LmdpColdFurnaceRecord lmdpColdFurnaceRecord;
    private LmdpColdRereelerRecord lmdpColdRereelerRecord;
    private LmdpColdStoreRecord lmdpColdStoreRecord;
    private LmdpQcColdInspect lmdpQcColdInspect;
    private LmdpQcColdReelReport lmdpQcColdReelReport;
    private LmdpQcComplaintHandle lmdpQcComplaintHandle;
    private LmdpQcComplaintDetail  lmdpQcComplaintDetail;
}
