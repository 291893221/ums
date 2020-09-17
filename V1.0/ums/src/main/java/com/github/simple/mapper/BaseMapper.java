package com.github.simple.mapper;

import java.util.List;

import com.github.simple.entity.BaseEntity;

public interface BaseMapper<T extends BaseEntity> {

	List<T> selectBySelective(T record);

	int deleteByPrimaryKey(Long id);

	int insert(T record);

	int insertSelective(T record);

	T selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(T record);

	int updateByPrimaryKey(T record);

}