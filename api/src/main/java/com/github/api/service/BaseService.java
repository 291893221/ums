package com.github.api.service;

import com.github.entity.BaseEntity;
import com.github.mapper.BaseMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BaseService<T extends BaseEntity> {

	@Autowired
	private BaseMapper<T> mapper;

	public int deleteByPrimaryKey(Long id) {
		return mapper.deleteByPrimaryKey(id);
	}

	public int insert(T t) {
		return mapper.insert(t);
	}

	public int insertSelective(T t) {
		return mapper.insertSelective(t);
	}

	public T selectByPrimaryKey(Long id) {
		return mapper.selectByPrimaryKey(id);
	}

	public int updateByPrimaryKeySelective(T t) {
		return mapper.updateByPrimaryKeySelective(t);
	}

	public int updateByPrimaryKey(T t) {
		return mapper.updateByPrimaryKey(t);
	}

	public PageInfo<T> selectPage(T t) {
		PageHelper.startPage(t.getPageNum(), t.getPageSize());
		List<T> list = mapper.selectBySelective(t);
		return new PageInfo(list);
	}

	public List<T> selectBySelective(T record) {
		return mapper.selectBySelective(record);
	}

}