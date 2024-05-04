package com.buaa.netty.BIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class TimeClient {
    public static void main(String[] args) throws IOException {
        int port = 8080;
        if(args!=null&&args.length>0){
            try{
                port = Integer.parseInt(args[0]);
            }catch (NumberFormatException e){

            }

        }
        Socket socket = null;
        BufferedReader in = null;
        PrintWriter out = null;
        try{
            socket = new Socket("127.0.0.1",port);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(),true);
            out.println("QUERY TIME ORDER");
            System.out.println("Send order 2 server successed ");
            String resp = in.readLine();
            System.out.println("now is :"+resp);
        }catch (Exception e){

        }finally {
            if(in!=null){
                in.close();
            }
            if(out!=null){
                out.close();
                out = null;
            }
            if(socket!=null){
                socket.close();
                socket =null;
            }
        }


    }
}
