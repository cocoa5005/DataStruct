package com.buaa.netty.BIO;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TimeServer {
    public static void main(String[] args) {
        int port = 8080;
        if(args!=null&&args.length>0){
            try{
                port = Integer.parseInt(args[0]);
            }catch (NumberFormatException e){

            }

        }
        ServerSocket server = null;
        try {
            server = new ServerSocket(port);
            System.out.println("THIS TIMESERVER USE PORT:"+port);
            Socket socket = null;
            while(true){
                socket = server.accept();
                new Thread(new TimerServerHandler(socket)).start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
                if(server!=null){
                    System.out.println("THIS TIMESERVER IS CLOSE;");
                    try {
                        server.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    server=null;
                }
        }

    }
}
