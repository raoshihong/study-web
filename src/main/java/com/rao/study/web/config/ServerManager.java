package com.rao.study.web.config;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ServerManager {
    private static Collection<SocketServer> servers = Collections.synchronizedList(new ArrayList<SocketServer>());

    public static void broadCast(String msg){

        for (SocketServer socketServer : servers) {
            try {
                socketServer.sendMessage(msg);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }


    }

    public static int getToal(){
        return servers.size();
    }

    public static void add(SocketServer socketServer){
        servers.add(socketServer);
    }

    public static void remove(SocketServer socketServer){
        servers.remove(socketServer);
    }
}
