package com.buaa.netty.BIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Date;

public class TimerServerHandler implements Runnable{

    private Socket socket;

    public TimerServerHandler(Socket socket){
        this.socket = socket;
    }
    @Override
    public void run() {
        BufferedReader in=null;
        PrintWriter out = null;
        try{
            in = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
            out = new PrintWriter(this.socket.getOutputStream(),true);
            String currtime=null;
            String body  = null;
            while(true){
                body  = in.readLine();
                if(body ==null){
                    break;
                }
                System.out.println("The TIMESERVER recieve order:"+body);
                currtime = "QUERY TIME ORDER".equalsIgnoreCase(body)?new Date(System.currentTimeMillis()).toString():"BAD ORDER";
                out.println(currtime);
            }
        }catch (Exception e){

        }finally {
            try{
                if(in!=null){
                    in.close();
                }
            }catch (IOException el){
                el.printStackTrace();
            }
            if(out!=null){
                out.close();
                out = null;
            }
            try {
                if(this.socket!=null){
                    this.socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.socket = null;
        }

    }
}
