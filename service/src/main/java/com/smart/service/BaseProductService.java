package com.smart.service;

import com.smart.domain.BaseProduct;
import com.smart.utils.ResultData;

/**
 * BaseProductService
 *
 * @Title: BaseProductService.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-2-25 19:22
 * @Author 90
 */
public interface BaseProductService {

    ResultData<Integer> addBaseProduct(BaseProduct user);
}
