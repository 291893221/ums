package com.github.api.service;

import com.github.entity.UmsRole;
import com.github.mapper.UmsRoleMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service
public class UmsRoleService extends BaseService<UmsRole>{
	@Resource
	private UmsRoleMapper umsRoleMapper;
}