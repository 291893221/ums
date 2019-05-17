package com.github.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by Mybatis Generator 2019/05/17
 */
@ApiModel(value = "com.github.entity.UmsLog")
@Data
public class UmsLog extends BaseEntity {
	@ApiModelProperty(value = "访问地址")
	private String logUrl;
	@ApiModelProperty(value = "类")
	private String logClass;
	@ApiModelProperty(value = "方法")
	private String logMethod;
	@ApiModelProperty(value = "代码行", example = "1")
	private Integer logLine;
	@ApiModelProperty(value = "日志级别")
	private String logLever;
}