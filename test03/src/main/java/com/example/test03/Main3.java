package com.example.test03;

import com.example.test03.config.ConditionalConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(ConditionalConfig.class);
        ListService listService = configApplicationContext.getBean(ListService.class);

        listService.showListCmd();
        configApplicationContext.close();
    }
}
