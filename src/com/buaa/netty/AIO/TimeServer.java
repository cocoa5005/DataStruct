package com.buaa.netty.AIO;

import com.buaa.netty.NIO.MultiplexerTimeServer;

public class TimeServer {
    public static void main(String[] args) {
        int port = 8080;
        if(args!=null&&args.length>0){
            try{
                port = Integer.parseInt(args[0]);
            }catch (NumberFormatException e){

            }

        }
        AsyncTimeServerHandler timeServer= new AsyncTimeServerHandler(port);
        new Thread(timeServer,"AIO-AsyncTimeServerHandler-001").start();
    }
}
