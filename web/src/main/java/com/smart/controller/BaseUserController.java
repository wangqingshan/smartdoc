package com.smart.controller;

import com.smart.domain.BaseUser;
import com.smart.service.BaseUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * BaseUserController
 *
 * @Title: BaseUserController.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2018/10/12 10:11
 * @Author 90
 */
@RequestMapping("/v1/BaseUser")
@Controller
public class BaseUserController {

    @Autowired
    private BaseUserService baseUserService;


    @RequestMapping(value = "/add")
    @ResponseBody
    public String addUser(){
        BaseUser user= new BaseUser();
        user.setPhone("15036649390");
        user.setPassword("123456");
        user.setNickName("小明");
        baseUserService.addUser(user);


        return "插入成功";
    }

    @RequestMapping(value = "/getAll")
    @ResponseBody
    public Object getAll(){

        List<BaseUser> list=baseUserService.selectAllUser();
        Map<String,Object> rltMap=new HashMap<String,Object>();
        rltMap.put("dataList",list);

        return rltMap;
    }



}
