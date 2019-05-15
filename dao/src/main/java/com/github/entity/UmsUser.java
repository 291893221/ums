package com.github.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

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
}