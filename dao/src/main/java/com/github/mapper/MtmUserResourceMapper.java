package com.github.mapper;

import com.github.entity.MtmUserResource;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator 2019/05/17
*/
@Mapper
public interface MtmUserResourceMapper {
    int deleteByPrimaryKey(@Param("userId") Long userId, @Param("resourceId") Long resourceId);

    int insert(MtmUserResource record);

    int insertSelective(MtmUserResource record);
}