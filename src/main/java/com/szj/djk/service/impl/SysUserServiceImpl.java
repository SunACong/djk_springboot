package com.szj.djk.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.szj.djk.entity.SysUser;
import com.szj.djk.service.SysUserService;
import com.szj.djk.mapper.SysUserMapper;
import org.springframework.stereotype.Service;

/**
* @author Admin
* @description 针对表【sys_user】的数据库操作Service实现
* @createDate 2023-04-05 14:54:31
*/
@DS("slave")
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser>
    implements SysUserService{

}




