package com.szj.djk.ssc.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.szj.djk.common.CustomException;
import com.szj.djk.common.R;
import com.szj.djk.ssc.entity.Lqcmr;
import com.szj.djk.ssc.service.LqcmrService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @ClassName LqcmrController
 * @Authoc 孙少聪
 * @Date 2023/1/11 11:10:29
 */
@RestController
@RequestMapping("/lqcmr")
public class LqcmrController {

    @Resource
    private LqcmrService lqcmrService;

    @RequestMapping("/list")
    public R<Page> list(int pageNum, int pageSize, Lqcmr lqcmr) {
        Page<Lqcmr> pageInfo = new Page<>(pageNum, pageSize);
        LambdaQueryWrapper<Lqcmr> queryWrapper = new LambdaQueryWrapper<>(lqcmr);
        Page<Lqcmr> page = lqcmrService.page(pageInfo, queryWrapper);
        return R.success(page);
    }

    @PostMapping()
    public R<String> add(@RequestBody Lqcmr lqcmr) {
        try {
            lqcmrService.save(lqcmr);
            return R.success("新增成功");
        } catch (Exception e) {
            e.printStackTrace();
            return R.success("新增失败");
        }
    }

    @GetMapping("{id}")
    public R<Lqcmr> getLqcibyId(@PathVariable("id") int id){
        try {
            Lqcmr lqcmr = lqcmrService.getById(id);
            return R.success(lqcmr);
        } catch (Exception e) {
            // 抛出一个异常
            throw new CustomException("查询失败");
        }
    }

    @PutMapping
    public R<String> edit(@RequestBody Lqcmr lqcmr){
        boolean b = lqcmrService.updateById(lqcmr);
        return b? R.success("修改成功"):R.success("修改失败");
    }
}
