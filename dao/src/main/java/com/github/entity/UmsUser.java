package com.github.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* Created by Mybatis Generator 2019/05/16
*/
@ApiModel(value="com.github.entity.UmsUser")
@Data
public class UmsUser extends BaseEntity {
    @ApiModelProperty(value="登陆帐号")
    private String username;
    @ApiModelProperty(value="登陆密码(MD5加密)")
    private String password;
    @ApiModelProperty(value="用户姓名")
    private String nickname;
    @ApiModelProperty(value="0:未锁定,1:已锁定", example = "0")
    private Integer isLocked;
    @ApiModelProperty(value="0:普通账号,1:超级管理员账号", example = "0")
    private Integer isAdmin;
}