package com.github.api.service;

import com.github.entity.UmsResource;
import com.github.mapper.UmsResourceMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service
public class UmsResourceService extends BaseService<UmsResource> {

	@Resource
	private UmsResourceMapper umsResourceMapper;

}
