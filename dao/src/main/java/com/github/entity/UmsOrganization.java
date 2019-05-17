package com.github.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* Created by Mybatis Generator 2019/05/17
*/
@ApiModel(value="com.github.entity.UmsOrganization")
@Data
public class UmsOrganization extends BaseEntity {
    @ApiModelProperty(value="主键编号")
    private Long id;

    @ApiModelProperty(value="组织名称")
    private String organizationName;

    @ApiModelProperty(value="图标")
    private String organizationIcon;

    @ApiModelProperty(value="组织类型(1:集团,2:分公司,3:事业部,4:部门)")
    private Boolean organizationType;

    @ApiModelProperty(value="上级id")
    private Long pid;

}