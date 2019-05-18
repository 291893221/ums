package com.github.api.controller;

import com.github.api.service.UmsOrganizationService;
import com.github.entity.UmsOrganization;
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
 * http://localhost:8080/ums/organization
 */
@Slf4j
@RestController
@RequestMapping("/ums/organization")
@Api(tags = "组织管理")
public class UmsOrganizationController {

	@Autowired
	private UmsOrganizationService umsOrganizationService;

	@PostMapping
	@ApiOperation(value = "新增", notes = "新增数据")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "organizationName", value = "组织名称", paramType = "query", required = true),
			@ApiImplicitParam(name = "pid", value = "上级编号", paramType = "query", required = true),
			@ApiImplicitParam(name = "nickname", value = "用户姓名", paramType = "query")
	})
	public UmsOrganization insert(@ApiIgnore UmsOrganization record) {
		umsOrganizationService.insertSelective(record);
		log.info("sysUser {}", record);
		return record;
	}

	@DeleteMapping
	@ApiOperation(value = "删除", notes = "根据主键i的删除数据")
	public int delete(Long id) {
		log.info("id {}", id);
		return umsOrganizationService.deleteByPrimaryKey(id);
	}

	@GetMapping
	@ApiOperation(value = "查询", notes = "分页查询方法")
	public PageInfo<UmsOrganization> selectBySelective(UmsOrganization record) {
		log.info("sysRole {}", record);
		return umsOrganizationService.selectPage(record);
	}

	@PutMapping
	@ApiOperation(value = "修改", notes = "根据主键id更新数据")
	public int updateByPrimaryKeySelective(UmsOrganization record) {
		log.info("sysUser {}", record);
		return umsOrganizationService.updateByPrimaryKeySelective(record);
	}
}
