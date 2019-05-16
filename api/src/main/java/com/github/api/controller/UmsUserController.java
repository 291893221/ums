package com.github.api.controller;

import com.github.api.service.UmsUserService;
import com.github.entity.UmsUser;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

/**
 * http://localhost:8080/ums/user
 */
@Slf4j
@RestController
@RequestMapping("/ums/user")
@Api(tags = "用户管理")
public class UmsUserController {

	@Autowired
	private UmsUserService umsUserService;

	@PostMapping
	@ApiOperation(value = "新增", notes = "新增用户信息")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "username", value = "登陆账号", paramType = "query", required = true),
			@ApiImplicitParam(name = "password", value = "登陆密码", paramType = "query", required = true),
			@ApiImplicitParam(name = "nickname", value = "用户姓名", paramType = "query")
	})
	public UmsUser insert(@ApiIgnore UmsUser record) {
		umsUserService.insertSelective(record);
		log.info("sysUser {}", record);
		return record;
	}

	@DeleteMapping
	@ApiOperation(value = "删除", notes = "根据主键i的删除数据")
	public int delete(Long id) {
		log.info("id {}", id);
		return umsUserService.deleteByPrimaryKey(id);
	}

	@GetMapping
	@ApiOperation(value = "查询", notes = "分页查询方法")
	public PageInfo<UmsUser> selectBySelective(UmsUser record) {
		log.info("sysRole {}", record);
		return umsUserService.selectPage(record);
	}

	@PutMapping
	@ApiOperation(value = "修改", notes = "根据主键id更新数据")
	public int updateByPrimaryKeySelective(UmsUser record) {
		log.info("sysUser {}", record);
		return umsUserService.updateByPrimaryKeySelective(record);
	}
}
