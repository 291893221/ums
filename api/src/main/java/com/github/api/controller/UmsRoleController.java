package com.github.api.controller;

import com.github.api.service.UmsRoleService;
import com.github.entity.UmsRole;
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
 * http://localhost:8080/ums/role
 */
@Slf4j
@RestController
@RequestMapping("/ums/role")
@Api(tags = "角色管理")
public class UmsRoleController {

	@Autowired
	private UmsRoleService umsRoleService;

	@PostMapping
	@ApiOperation(value = "新增", notes = "新增数据")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "rolename", value = "登陆账号", paramType = "query", required = true)
	})
	public UmsRole insert(@ApiIgnore UmsRole record) {
		umsRoleService.insertSelective(record);
		log.info("sysRole {}", record);
		return record;
	}

	@DeleteMapping
	@ApiOperation(value = "删除", notes = "根据主键i的删除数据")
	public int delete(Long id) {
		log.info("id {}", id);
		return umsRoleService.deleteByPrimaryKey(id);
	}

	@GetMapping
	@ApiOperation(value = "查询", notes = "分页查询方法")
	public PageInfo<UmsRole> selectBySelective(UmsRole record) {
		log.info("sysRole {}", record);
		return umsRoleService.selectPage(record);
	}

	@PutMapping
	@ApiOperation(value = "修改", notes = "根据主键id更新数据")
	public int updateByPrimaryKeySelective(UmsRole record) {
		log.info("sysRole {}", record);
		return umsRoleService.updateByPrimaryKeySelective(record);
	}
}
