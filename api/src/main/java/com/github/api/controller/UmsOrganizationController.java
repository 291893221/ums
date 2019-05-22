package com.github.api.controller;

import com.github.api.service.UmsOrganizationService;
import com.github.entity.UmsOrganization;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * http://localhost:8080/ums/organization
 */
@Slf4j
@RestController
@RequestMapping("/ums/organization")
@Api(tags = "组织管理")
public class UmsOrganizationController extends BaseController<UmsOrganization> {

	@Autowired
	private UmsOrganizationService umsOrganizationService;

}
