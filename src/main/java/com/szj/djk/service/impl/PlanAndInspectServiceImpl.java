package com.szj.djk.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.szj.djk.mapper.PlanAndInspectMapper;
import com.szj.djk.service.PlanAndInspectService;
import com.szj.djk.vo.PlanAndInspect;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
* @author Admin
* @description 针对表【plan_and_inspect】的数据库操作Service实现
* @createDate 2023-03-14 15:20:29
*/
@Service
public class PlanAndInspectServiceImpl extends ServiceImpl<PlanAndInspectMapper, PlanAndInspect>
    implements PlanAndInspectService{

    @Resource
    private PlanAndInspectMapper planAndInspectMapper;

    @Override
    public String getRecentTs() {

        String ts = "1970-01-01 00:00:00";
        if (planAndInspectMapper.getRecentTs() != null) {
            return planAndInspectMapper.getRecentTs();
        }
        return ts;
    }
}




