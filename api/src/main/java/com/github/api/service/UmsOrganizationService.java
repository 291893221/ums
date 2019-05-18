package com.github.api.service;

import com.github.entity.UmsOrganization;
import com.github.mapper.UmsOrganizationMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service
public class UmsOrganizationService extends BaseService<UmsOrganization> {
	@Resource
	private UmsOrganizationMapper umsOrganizationMapper;
}
