package com.szj.djk.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.szj.djk.entity.ReportDict;
import com.szj.djk.service.ReportDictService;
import com.szj.djk.mapper.ReportDictMapper;
import org.springframework.stereotype.Service;

/**
* @author Admin
* @description 针对表【report_dict(可视化字典)】的数据库操作Service实现
* @createDate 2023-04-05 10:58:02
*/
@DS("slave")
@Service
public class ReportDictServiceImpl extends ServiceImpl<ReportDictMapper, ReportDict>
    implements ReportDictService{
}




