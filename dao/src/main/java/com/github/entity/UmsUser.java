package com.github.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
* Created by Mybatis Generator 2019/05/15
*/
@ApiModel(value="com.github.entity.UmsUser")
@Data
public class UmsUser extends BaseEntity {
    @ApiModelProperty(value="帐号")
    private String username;
    @ApiModelProperty(value="密码")
    private String password;
    @ApiModelProperty(value="姓名")
    private String realname;
    @ApiModelProperty(value="锁定",example = "0")
    private Integer locked;
    @ApiModelProperty(value="创建时间")
    private Date ctime;
    @ApiModelProperty(value="更新时间")
    private Date utime;
}