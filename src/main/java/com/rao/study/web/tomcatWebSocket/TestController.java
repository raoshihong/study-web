package com.rao.study.web.tomcatWebSocket;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(value = "/test")
    public void test(){
        ServerManager.broadCast("sdfsdf");
    }

}
