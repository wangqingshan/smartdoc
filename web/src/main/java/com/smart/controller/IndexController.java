package com.smart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

    /**
     * 欢迎页
     * @return
     */
    @RequestMapping(value = "/")
    public String index(){


        return "index";
    }
}
