package com.smart.dao;

import com.smart.domain.TycDoc;

public interface TycDocMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TycDoc record);

    int insertSelective(TycDoc record);

    TycDoc selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TycDoc record);

    int updateByPrimaryKey(TycDoc record);
}