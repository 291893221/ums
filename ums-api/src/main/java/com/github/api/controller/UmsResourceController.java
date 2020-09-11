package com.github.api.controller;

import com.github.api.service.UmsResourceService;
import com.github.entity.UmsResource;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * http://localhost:8080/ums/resource
 */
@Slf4j
@RestController
@RequestMapping("/ums/resource")
@Api(tags = "资源管理")
public class UmsResourceController extends BaseController<UmsResource> {

	@Autowired
	private UmsResourceService umsResourceService;

}
