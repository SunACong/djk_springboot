package com.szj.djk.ssc.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.szj.djk.common.CustomException;
import com.szj.djk.common.R;
import com.szj.djk.ssc.entity.Lqci;
import com.szj.djk.ssc.service.LqciService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @ClassName LqciController
 * @Authoc 孙少聪
 * @Date 2023/1/11 11:10:04
 */
@RestController
@RequestMapping("/lqci")
public class LqciController {

    @Resource
    private LqciService lqciService;

    @RequestMapping("/list")
    public R<Page> list(int pageNum, int pageSize, Lqci lqci) {
        Page<Lqci> pageInfo = new Page<>(pageNum, pageSize);
        LambdaQueryWrapper<Lqci> queryWrapper = new LambdaQueryWrapper<>(lqci);
        Page<Lqci> page = lqciService.page(pageInfo, queryWrapper);
        return R.success(page);
    }

    @PostMapping()
    public R<String> add(@RequestBody Lqci lqci) {
        try {
            lqciService.save(lqci);
            return R.success("新增成功");
        } catch (Exception e) {
            e.printStackTrace();
            return R.success("新增失败");
        }
    }

    @GetMapping("{id}")
    public R<Lqci> getLqcibyId(@PathVariable("id") int id){
        try {
            Lqci lqci = lqciService.getById(id);
            return R.success(lqci);
        } catch (Exception e) {
            // 抛出一个异常
            throw new CustomException("查询失败");
        }
    }

    @PutMapping
    public R<String> edit(@RequestBody Lqci lqci){
        boolean b = lqciService.updateById(lqci);
        return b? R.success("修改成功"):R.success("修改失败");
    }

}
