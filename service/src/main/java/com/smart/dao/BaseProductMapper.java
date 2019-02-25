package com.smart.dao;

import com.smart.domain.BaseProduct;

public interface BaseProductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BaseProduct record);

    int insertSelective(BaseProduct record);

    BaseProduct selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BaseProduct record);

    int updateByPrimaryKeyWithBLOBs(BaseProduct record);

    int updateByPrimaryKey(BaseProduct record);
}