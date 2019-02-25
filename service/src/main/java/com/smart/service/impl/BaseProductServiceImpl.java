package com.smart.service.impl;


import com.smart.dao.BaseProductMapper;
import com.smart.domain.BaseProduct;
import com.smart.service.BaseProductService;
import com.smart.utils.ResultData;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * BaseProductServiceImpl
 *
 * @Title: BaseProductServiceImpl.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-2-25 19:22
 * @Author 90
 */
public class BaseProductServiceImpl implements BaseProductService {

    @Autowired
    private BaseProductMapper baseProductMapper;

    @Override
    public ResultData<Integer> addBaseProduct(BaseProduct product) {
        return null;
    }
}
