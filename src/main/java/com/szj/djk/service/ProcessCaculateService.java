package com.szj.djk.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.szj.djk.entity.ProcessCaculate;

import java.util.List;
import java.util.Map;

/**
* @author ACongSun
* @description 针对表【process_caculate】的数据库操作Service
* @createDate 2023-05-20 14:26:43
*/
public interface ProcessCaculateService extends IService<ProcessCaculate> {
    List<Map<String, Integer>> historyException();
}
