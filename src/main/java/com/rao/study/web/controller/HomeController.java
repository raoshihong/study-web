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

}
