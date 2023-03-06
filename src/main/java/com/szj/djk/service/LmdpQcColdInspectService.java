package com.szj.djk.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.szj.djk.entity.LmdpQcColdInspect;

import java.util.List;

/**
* @author Admin
* @description 针对表【lmdp_qc_cold_inspect(冷轧工序质量巡检记录)】的数据库操作Service
* @createDate 2023-02-16 14:25:11
*/
public interface LmdpQcColdInspectService extends IService<LmdpQcColdInspect> {
    public List<LmdpQcColdInspect> selectTest();
}
