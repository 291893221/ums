package com.github.entity;

import io.swagger.annotations.ApiParam;
import lombok.Data;
import java.io.Serializable;
import java.util.UUID;

@Data
public class BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id = UUID.randomUUID().toString();

	@ApiParam(hidden = true)
	private Integer pageNum = 1;

	@ApiParam(hidden = true)
	private Integer pageSize = 10;

}
