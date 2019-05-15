package com.github.api.controller;

import com.github.api.service.UmsUserService;
import com.github.entity.UmsUser;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

	@GetMapping
	@ApiOperation("查询")
	@ApiParam(name = "UmsUser", value = "对象")
	public PageInfo<UmsUser> selectBySelective(UmsUser record) {
		log.info("sysRole {}", record);
		return umsUserService.selectPage(record);
	}

}
