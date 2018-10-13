package com.smart.dao;

import com.smart.domain.TycCreTime;

public interface TycCreTimeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TycCreTime record);

    int insertSelective(TycCreTime record);

    TycCreTime selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TycCreTime record);

    int updateByPrimaryKey(TycCreTime record);
}