package com.szj.djk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName sys_user
 */
@TableName(value ="sys_user")
@Data
public class SysUser implements Serializable {
    /**
     * 
     */
    @TableId(value = "user_id")
    private String userId;

    /**
     * 用户名
     */
    @TableField(value = "username")
    private String username;

    /**
     * 密码
     */
    @TableField(value = "password")
    private String password;

    /**
     * 真实姓名
     */
    @TableField(value = "real_name")
    private String realName;

    /**
     * 状态 1:男，2:女
     */
    @TableField(value = "sex")
    private Integer sex;

    /**
     * 联系地址
     */
    @TableField(value = "address")
    private String address;

    /**
     * 所属单位
     */
    @TableField(value = "dept_name")
    private String deptName;

    /**
     * api key 短信通报保留
     */
    @TableField(value = "api_key")
    private String apiKey;

    /**
     * 邮箱
     */
    @TableField(value = "email")
    private String email;

    /**
     * 手机号
     */
    @TableField(value = "mobile")
    private String mobile;

    /**
     * 状态 0:禁用，1:正常
     */
    @TableField(value = "status")
    private Integer status;

    /**
     * 
     */
    @TableField(value = "user_id_create")
    private String userIdCreate;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @TableField(value = "ts")
    private Date ts;

    /**
     * 
     */
    @TableField(value = "ext_attr1")
    private String extAttr1;

    /**
     * 
     */
    @TableField(value = "ext_attr2")
    private String extAttr2;

    /**
     * 
     */
    @TableField(value = "ext_attr3")
    private String extAttr3;

    /**
     * 
     */
    @TableField(value = "ext_attr4")
    private String extAttr4;

    /**
     * 
     */
    @TableField(value = "ext_attr5")
    private String extAttr5;

    /**
     * 
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 数据来源,字典sync_data_source：titan-titan录入，weilink-weilink同步
     */
    @TableField(value = "source")
    private String source;

    /**
     * 账户密码过期日期
     */
    @TableField(value = "expire_date")
    private Date expireDate;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}