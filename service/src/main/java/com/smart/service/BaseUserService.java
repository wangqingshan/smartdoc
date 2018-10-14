package com.smart.service;

import com.smart.domain.BaseUser;
import com.smart.utils.ResultData;

import java.util.List;

/**
 * BaseUserService
 *
 * @Title: BaseUserService.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2018/10/12 10:02
 * @Author 90
 */
public interface BaseUserService {

    ResultData<Integer> addUser(BaseUser user);


    List<BaseUser> selectAllUser();

    BaseUser getUserByNameAndPsw(String email,String password);
}
