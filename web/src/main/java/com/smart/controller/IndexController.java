package com.smart.controller;

import com.smart.domain.BaseUser;
import com.smart.service.BaseUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * IndexController
 *
 * @Title: IndexController.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2018/10/12 10:37
 * @Author 90
 */
@RequestMapping("/")
@Controller
public class IndexController {

    @Autowired
    private BaseUserService baseUserService;
    /**
     * 欢迎页
     * @return
     */
    @RequestMapping(value = "/v1/index")
    public String index(){


        return "index";
    }

    /**
     * 登陆页面
     * @return
     */
    @RequestMapping(value = "/")
    public String login(){


        return "login";
    }

    @PostMapping(value = "/validateUser")
    @ResponseBody
    public String validateUser(String username, String password, HttpServletRequest request){

        BaseUser user=baseUserService.getUserByNameAndPsw(username,password);
        if(user!=null){
            request.getSession().setAttribute("userId",user.getId());
            return "success";
        }else{
            return "fail";
        }
    }

}
