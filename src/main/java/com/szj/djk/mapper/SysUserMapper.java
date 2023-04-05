package com.szj.djk.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.szj.djk.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;

/**
* @author Admin
* @description 针对表【sys_user】的数据库操作Mapper
* @createDate 2023-04-05 14:54:31
* @Entity com.szj.djk.entity.SysUser
*/
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {

}




