package com.github.mapper;

import com.github.entity.OtoUserExt;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by Mybatis Generator 2019/05/17
 */
@Mapper
public interface OtoUserExtMapper {
	int insert(OtoUserExt record);

	int insertSelective(OtoUserExt record);
}