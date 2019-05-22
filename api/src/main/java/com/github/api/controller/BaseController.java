package com.github.api.controller;

import com.github.api.service.BaseService;
import com.github.entity.BaseEntity;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

@Slf4j
public class BaseController<T extends BaseEntity> {
	@Autowired
	private BaseService<T> service;

	@PostMapping
	@ApiOperation(value = "新增", notes = "新增数据")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "username", value = "登陆账号", paramType = "query", required = true),
			@ApiImplicitParam(name = "password", value = "登陆密码", paramType = "query", required = true),
			@ApiImplicitParam(name = "nickname", value = "用户姓名", paramType = "query")
	})
	public T insert(@ApiIgnore T record) {
		service.insertSelective(record);
		log.info("sysUser {}", record);
		return record;
	}

	@DeleteMapping("/{id}")
	@ApiOperation(value = "删除", notes = "根据主键i的删除数据")
	public int delete(@PathVariable("id") Long id) {
		log.info("id {}", id);
		return service.deleteByPrimaryKey(id);
	}

	@GetMapping
	@ApiOperation(value = "查询", notes = "分页查询方法")
	public PageInfo<T> selectBySelective(T record) {
		log.info("sysRole {}", record);
		return service.selectPage(record);
	}

	@PutMapping
	@ApiOperation(value = "修改", notes = "根据主键id更新数据")
	public int updateByPrimaryKeySelective(T record) {
		log.info("sysUser {}", record);
		return service.updateByPrimaryKeySelective(record);
	}
}
