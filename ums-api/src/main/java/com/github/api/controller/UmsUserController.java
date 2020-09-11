package com.github.api.controller;

import com.github.api.service.UmsUserService;
import com.github.entity.UmsUser;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * http://localhost:8080/ums/user
 */
@Slf4j
@RestController
@RequestMapping("/ums/user")
@Api(tags = "用户管理")
public class UmsUserController extends BaseController<UmsUser> {

	@Autowired
	private UmsUserService umsUserService;

}
