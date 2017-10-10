package com.example.test03;


import com.example.test03.config.TaskExecutorConfig;
import com.example.test03.executor.AsyncExecutorService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncExecutorService asyncExecutorService = configApplicationContext.getBean(AsyncExecutorService.class);

        for(int i = 0; i <10; i++) {
            asyncExecutorService.test(i);
            asyncExecutorService.test02(i);
        }
        configApplicationContext.close();
    }
}
