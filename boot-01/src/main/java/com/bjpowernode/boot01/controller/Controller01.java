package com.bjpowernode.boot01.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 2021/4/6
 */
@Controller
public class Controller01 {

    @Resource
    private Student prot;
    @RequestMapping("/help")
    @ResponseBody
    public String help(){
        return prot.toString();
    }
}
