package com.buaa.ds;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class test {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(5);
        final CountDownLatch endGate = new CountDownLatch(10);
        for (int i = 1;i<=10;i++) {
            es.submit(new Runnable() {
                @Override
                public void run() {
                    try{
                        System.out.println("测试：");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                            endGate.countDown();
                    }
                }
            });
        }
        long startTime = System.currentTimeMillis();
        try {
            endGate.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        long runtime = (endTime-startTime)/1000;
        System.out.println("并发测试用时："+runtime);
        es.shutdown();
    }
}
