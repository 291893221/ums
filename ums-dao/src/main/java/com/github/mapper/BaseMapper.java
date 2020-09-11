package com.github.mapper;

import com.github.entity.BaseEntity;

import java.util.List;

public interface BaseMapper<T extends BaseEntity> {

	List<T> selectBySelective(T record);

	int deleteByPrimaryKey(Long id);

	int insert(T record);

	int insertSelective(T record);

	T selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(T record);

	int updateByPrimaryKey(T record);

}