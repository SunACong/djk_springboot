package com.szj.djk.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.szj.djk.common.R;
import com.szj.djk.entity.Lqci;
import com.szj.djk.service.LqciService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 测试
 * @author 孙少聪
 * @Date 2023/1/11 11:10:04
 */
@RestController
@RequestMapping("/lqci")
public class LqciController {

    @Resource
    private LqciService lqciService;

    /**
     * 测试上传接口
     * @param pageNum 页码
     * @param pageSize 页码
     * @param lqci 查询条件
     * @return 分页数据
     */
    @RequestMapping("/list")
    public R<Page<Lqci>> list(int pageNum, int pageSize, Lqci lqci) {
        Page<Lqci> pageInfo = new Page<>(pageNum, pageSize);
        LambdaQueryWrapper<Lqci> queryWrapper = new LambdaQueryWrapper<>(lqci);
        Page<Lqci> page = lqciService.page(pageInfo, queryWrapper);
        return R.success(page);
    }

}
