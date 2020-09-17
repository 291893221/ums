package com.github.simple.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.simple.entity.UmsUser;
import com.github.simple.mapper.UmsUserMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UmsUserService extends BaseService<UmsUser> {

	@Resource
	private UmsUserMapper umsUserMapper;

}
