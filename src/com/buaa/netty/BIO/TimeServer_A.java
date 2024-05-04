package com.buaa.netty.BIO;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

//伪异步
public class TimeServer_A {
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
            TimeServerHandlerExecutePool singleExecutor =   new TimeServerHandlerExecutePool(50,10000);
            while(true){
                socket = server.accept();
                singleExecutor.execute(new TimerServerHandler(socket));
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
