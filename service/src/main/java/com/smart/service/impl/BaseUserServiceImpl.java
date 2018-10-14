package com.smart.service.impl;

import com.smart.dao.BaseUserMapper;
import com.smart.domain.BaseUser;
import com.smart.service.BaseUserService;
import com.smart.utils.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * BaseUserServiceImpl
 *
 * @Title: BaseUserServiceImpl.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2018/10/12 10:08
 * @Author 90
 */
@Service
public class BaseUserServiceImpl implements BaseUserService {

    @Autowired
    private BaseUserMapper baseUserMapper;

    @Override
    public ResultData<Integer> addUser(BaseUser user) {
        ResultData<Integer> result = new ResultData<Integer>();
        Integer insertNum = baseUserMapper.insertSelective(user);
        if(insertNum>0){
            result.setStatus(0);
        }else{
            result.setStatus(1);
        }
        result.setData(insertNum);
        return result;
    }

    public List<BaseUser> selectAllUser(){
        return baseUserMapper.selectAllUser();
    }

    @Override
    public BaseUser getUserByNameAndPsw(String email, String password) {
        return baseUserMapper.getUserByNameAndPsw(email,password);
    }


}
