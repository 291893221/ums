package com.github.api.controller;

import com.github.api.service.UmsRoleService;
import com.github.entity.UmsRole;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * http://localhost:8080/ums/role
 */
@Slf4j
@RestController
@RequestMapping("/ums/role")
@Api(tags = "角色管理")
public class UmsRoleController extends BaseController<UmsRole> {

	@Autowired
	private UmsRoleService umsRoleService;

}
