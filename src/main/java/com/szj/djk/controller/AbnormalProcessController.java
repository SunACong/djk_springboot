package com.szj.djk.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.szj.djk.common.R;

import com.szj.djk.entity.AbnormalProcess;
import com.szj.djk.service.AbnormalProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 异常流程显示Controller
 *
 * @author jiahua
 * @date 2022-11-08
 */
@RestController
@RequestMapping("/system/process")
public class AbnormalProcessController
{
    @Autowired
    private AbnormalProcessService abnormalProcessService;

    @GetMapping("list")
    public R<List<AbnormalProcess>> list(AbnormalProcess abnormalProcess){
        LambdaQueryWrapper<AbnormalProcess> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.setEntity(abnormalProcess);
        List<AbnormalProcess> list = abnormalProcessService.list(queryWrapper);
        return R.success(list);
    }
}
