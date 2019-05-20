package com.github.api.controller;

import com.github.api.service.UmsResourceService;
import com.github.entity.UmsResource;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

/**
 * http://localhost:8080/ums/resource
 */
@Slf4j
@RestController
@RequestMapping("/ums/resource")
@Api(tags = "资源管理")
public class UmsResourceController {

	@Autowired
	private UmsResourceService umsResourceService;

	@PostMapping
	@ApiOperation(value = "新增", notes = "新增数据")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "resourceUrl", value = "资源地址", paramType = "query", required = true),
			@ApiImplicitParam(name = "resourcename", value = "资源名称", paramType = "query", required = true)
	})
	public UmsResource insert(@ApiIgnore UmsResource record) {
		umsResourceService.insertSelective(record);
		log.info("sysResource {}", record);
		return record;
	}

	@DeleteMapping
	@ApiOperation(value = "删除", notes = "根据主键i的删除数据")
	public int delete(Long id) {
		log.info("id {}", id);
		return umsResourceService.deleteByPrimaryKey(id);
	}

	@GetMapping
	@ApiOperation(value = "查询", notes = "分页查询方法")
	public PageInfo<UmsResource> selectBySelective(UmsResource record) {
		log.info("sysRole {}", record);
		return umsResourceService.selectPage(record);
	}

	@PutMapping
	@ApiOperation(value = "修改", notes = "根据主键id更新数据")
	public int updateByPrimaryKeySelective(UmsResource record) {
		log.info("sysResource {}", record);
		return umsResourceService.updateByPrimaryKeySelective(record);
	}
}
