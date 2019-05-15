package com.github.api.service;

import com.github.entity.UmsUser;
import com.github.mapper.UmsUserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service
public class UmsUserService extends BaseService<UmsUser> {
	@Resource
	private UmsUserMapper umsUserMapper;

}
