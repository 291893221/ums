package com.github.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by Mybatis Generator 2019/05/20
 */
@ApiModel(value = "com.github.entity.SysLog")
@Data
public class SysLog extends BaseEntity {
	@ApiModelProperty(value = "主键编号")
	private Long id;

	@ApiModelProperty(value = "访问地址")
	private String logUrl;

	@ApiModelProperty(value = "类")
	private String logClass;

	@ApiModelProperty(value = "方法")
	private String logMethod;

	@ApiModelProperty(value = "参数")
	private String logParam;

	@ApiModelProperty(value = "代码行")
	private Integer logLine;

	@ApiModelProperty(value = "日志级别")
	private String logLever;

	@ApiModelProperty(value = "动作")
	private String logAction;

	@ApiModelProperty(value = "日志信息")
	private String logMessage;

}