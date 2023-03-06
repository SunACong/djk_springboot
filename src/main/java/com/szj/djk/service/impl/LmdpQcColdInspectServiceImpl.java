package com.szj.djk.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.szj.djk.common.DataSourceNames;
import com.szj.djk.config.DataSource;
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
public class LmdpQcColdInspectServiceImpl extends ServiceImpl<LmdpQcColdInspectMapper, LmdpQcColdInspect>
    implements LmdpQcColdInspectService{

    @Resource
    private LmdpQcColdInspectMapper lmdpQcColdInspectMapper;

    @Override
    @DataSource(DataSourceNames.SLAVE)
    public List<LmdpQcColdInspect> selectTest() {
        LambdaQueryWrapper<LmdpQcColdInspect> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(LmdpQcColdInspect::getId, "3754cbaea4f24f06933fffecd2d997dc");
        List<LmdpQcColdInspect> list = lmdpQcColdInspectMapper.selectList(queryWrapper);
        list.forEach(System.out::println);
        return list;
    }
}




