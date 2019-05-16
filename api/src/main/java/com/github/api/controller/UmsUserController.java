package com.github.api.controller;

import com.github.api.service.UmsUserService;
import com.github.entity.UmsUser;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * http://localhost:8080/ums/user
 */
@Slf4j
@RestController
@RequestMapping("/ums/user")
@Api("用户管理")
public class UmsUserController {

	@Autowired
	private UmsUserService umsUserService;

	@PostMapping
	@ApiOperation("新增")
	@ApiParam(name = "UmsUser", value = "对象")
	public UmsUser insert(UmsUser record) {
		umsUserService.insert(record);
		log.info("sysUser {}", record);
		return record;
	}

	@DeleteMapping
	@ApiOperation("删除")
	@ApiParam(name = "id", value = "主键")
	public int delete(String id) {
		log.info("id {}", id);
		return umsUserService.deleteByPrimaryKey(id);
	}

	@GetMapping
	@ApiOperation("查询")
	@ApiParam(name = "UmsUser", value = "对象")
	public PageInfo<UmsUser> selectBySelective(UmsUser record) {
		log.info("sysRole {}", record);
		return umsUserService.selectPage(record);
	}

	@PutMapping
	@ApiOperation("修改")
	@ApiParam(name = "UmsUser", value = "对象")
	public int updateByPrimaryKeySelective(UmsUser record) {
		log.info("sysUser {}", record);
		return umsUserService.updateByPrimaryKeySelective(record);
	}
}
