package com.github.mapper;

import com.github.entity.MtmUserRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Mybatis Generator 2019/05/17
 */
@Mapper
public interface MtmUserRoleMapper {
	int deleteByPrimaryKey(@Param("userId") Long userId, @Param("roleId") Long roleId);

	int insert(MtmUserRole record);

	int insertSelective(MtmUserRole record);
}