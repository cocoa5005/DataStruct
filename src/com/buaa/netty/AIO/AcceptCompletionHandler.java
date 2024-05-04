package com.buaa.netty.AIO;

import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;

public class AcceptCompletionHandler implements CompletionHandler<AsynchronousSocketChannel,AsyncTimeServerHandler>{


    @Override
    public void completed(AsynchronousSocketChannel result, AsyncTimeServerHandler attachment) {
        attachment.asynchronousServerSocketChannel.accept(attachment,this); //AsyncTimeServerHandler类40行处代码；此处表示接收成功后，再异步接收其他的客户端请求
        ByteBuffer buff =  ByteBuffer.allocate(1024);
        result.read(buff,buff,new ReadCompleteHandler(result));//异步读操作
    }

    @Override
    public void failed(Throwable exc, AsyncTimeServerHandler attachment) {
        exc.printStackTrace();
        attachment.latch.countDown();
    }
}
