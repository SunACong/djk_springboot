package com.szj.djk.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.szj.djk.common.R;
import com.szj.djk.entity.SysUser;
import com.szj.djk.service.SysUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 孙少聪
 * @Date 2023/4/5 14:55:21
 * @Description 获取用户字典
 */
@RestController
@RequestMapping("/sysUser")
public class SysUserController {

    @Resource
    private SysUserService sysUserService;

    @GetMapping("list")
    public R<List<SysUser>> list(){
        LambdaQueryWrapper<SysUser> queryWrapper = new LambdaQueryWrapper<>();
        List<SysUser> list = sysUserService.list(queryWrapper);
        return R.success(list);
    }
}
