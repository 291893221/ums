package com.github.mapper;

import com.github.entity.BaseEntity;

import java.util.List;

public interface BaseMapper<T extends BaseEntity> {

	int insert(T t);

	int insertSelective(T t);

	int deleteByPrimaryKey(Integer id);

	T selectByPrimaryKey(Integer id);

	List<T> selectBySelective(T record);

	int updateByPrimaryKeySelective(T t);

	int updateByPrimaryKey(T t);

}