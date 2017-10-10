package com.example.test04;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(ConditionalConfig.class);
        ListService listService = configApplicationContext.getBean(ListService.class);

        listService.showListCmd();
        configApplicationContext.close();
    }
}
