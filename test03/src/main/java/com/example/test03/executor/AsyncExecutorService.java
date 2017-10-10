package com.example.test03.executor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncExecutorService {

    @Async
    public void test(int i){
        System.out.println("test01  执行异步任务  "  + i);
    }

    @Async
    public void test02(int i ){
        System.out.println("执行异步任务 i+1 = " + "" + (i + 1));
    }
}
