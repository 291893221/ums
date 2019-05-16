package com.github.entity;

import io.swagger.annotations.ApiParam;
import lombok.Data;

import java.io.Serializable;

@Data
public class BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	@ApiParam(hidden = true)
	private Integer pageNum = 1;

	@ApiParam(hidden = true)
	private Integer pageSize = 10;

}
