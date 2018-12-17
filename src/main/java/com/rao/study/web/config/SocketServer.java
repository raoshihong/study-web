package com.rao.study.web.config;

import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;

@ServerEndpoint("/socketServer")
@Component
public class SocketServer {

    private Session session;

    @OnOpen
    public void onOpen(Session session){
        this.session = session;
        ServerManager.add(this);
    }

    public void sendMessage(String message) throws IOException{
        this.session.getBasicRemote().sendText(message);
    }

    @OnClose
    public void onClose(){
        ServerManager.remove(this);
    }

    @OnMessage
    public void onMessage(String message,Session session){
        System.out.println("来自客户端的消息:"+message);
    }

    @OnError
    public void onError(Session session,Throwable error){
        error.printStackTrace();
    }
}
