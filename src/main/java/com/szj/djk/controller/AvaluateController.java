package com.szj.djk.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.szj.djk.common.R;
import com.szj.djk.entity.Avaluate;
import com.szj.djk.service.AvaluateService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName AvaluateController
 * @Author 张高义
 * @Create 2022/10/8 0008 下午 17:10
 */
@RestController
@RequestMapping("/avaluate")
public class AvaluateController {
    @Autowired
    private AvaluateService avaluateService;
    /**
     * 查询值域列表
     */
    @GetMapping("list")
    public R<List<Avaluate>> list(Avaluate avaluate){
        LambdaQueryWrapper<Avaluate> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.setEntity(avaluate);
        List<Avaluate> list = avaluateService.list(queryWrapper);
        return R.success(list);
    }
    /**
     * 查询值域列表(分页)
     */
    @GetMapping("pageVOList")
    public R<IPage> test(int currentPage, int pageSize, @Param("avaluate") Avaluate avaluate) {
        QueryWrapper<Avaluate> queryWrapper = new QueryWrapper<>();
        Page<Avaluate> page = new Page<Avaluate>(currentPage, pageSize);
        IPage<Avaluate> avaluateIPage = avaluateService.selectAvaluateAndStandard(page,queryWrapper,avaluate);
        return R.success(avaluateIPage);
    }
    /**
     * 获取值域详细信息
     */
    @GetMapping("/{id}")
    public  R<Avaluate> getinfo(@PathVariable("id") Long id){
        return R.success(avaluateService.getById(id));
    }
    /**
     * 修改值域
     */
    @PutMapping
    public R<String> update(@RequestBody Avaluate avaluate){
        LambdaUpdateWrapper<Avaluate> updateWrapper = new LambdaUpdateWrapper<>();
        updateWrapper.eq(Avaluate::getId, avaluate.getId());
        boolean update = avaluateService.update(avaluate, updateWrapper);
        if (update){
            return R.success("修改成功");
        }
        return R.error("修改失败");
    }
    /**
     * 新增值域
     */
    @PostMapping
    public R<String> add(@RequestBody Avaluate avaluate){
        boolean save = avaluateService.save(avaluate);
        if (save){
            return R.success("修改成功");
        }
        return R.error("修改失败");
//        return R.success(avaluateService.save(avaluate));
    }
    /**
     * 删除值域
     */
    @DeleteMapping("/{ids}")
    public R<String> remove(@PathVariable Long[] ids){
        boolean removeByIds = avaluateService.removeByIds(Arrays.asList(ids));
        if (removeByIds){
            return R.success("修改成功");
        }
        return R.error("修改失败");
    }


}
