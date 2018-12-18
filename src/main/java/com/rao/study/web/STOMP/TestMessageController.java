package com.rao.study.web.STOMP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class TestMessageController {

    @Autowired
    private MessageBrokerHandler messageBrokerHandler;

    @GetMapping(value = "/testMessage")
    public void test() throws Exception{
        messageBrokerHandler.callback();
    }

    @MessageMapping("/send")//这里直接将地址映射到当前应用下了
    public SocketMessage send() throws Exception {
        SocketMessage message = new SocketMessage();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        message.date = df.format(new Date());
        return messageBrokerHandler.send(message);
    }

}
