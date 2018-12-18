package com.rao.study.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@Controller
public class HomeController {

    @RequestMapping(value = "/hello")
    public String home(HashMap<String, Object> map){
        return "/index";
    }

    @RequestMapping(value = "/index1")
    public String index1(){
        return "/index1";
    }

    @RequestMapping(value = "/index2")
    public String index2(){
        return "/index2";
    }

    @RequestMapping(value = "/index3")
    public String index3(){
        return "/index3";
    }

    @RequestMapping(value = "/index4")
    public String index4(){
        return "/index4";
    }

}
