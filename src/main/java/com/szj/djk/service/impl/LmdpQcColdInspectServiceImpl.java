package com.szj.djk.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.szj.djk.entity.LmdpQcColdInspect;
import com.szj.djk.mapper.LmdpQcColdInspectMapper;
import com.szj.djk.service.LmdpQcColdInspectService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* @author Admin
* @description 针对表【lmdp_qc_cold_inspect(冷轧工序质量巡检记录)】的数据库操作Service实现
* @createDate 2023-02-16 14:25:11
*/
@Service
@DS("master")
public class LmdpQcColdInspectServiceImpl extends ServiceImpl<LmdpQcColdInspectMapper, LmdpQcColdInspect>
    implements LmdpQcColdInspectService{

    @Resource
    private LmdpQcColdInspectMapper lmdpQcColdInspectMapper;

    @Override
    public List<LmdpQcColdInspect> test() {
        List<LmdpQcColdInspect> list = lmdpQcColdInspectMapper.selectList(null);
        return list;
    }
}




