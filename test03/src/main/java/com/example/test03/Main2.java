package com.example.test03;

import com.example.test03.config.AnnotationConfig;
import com.example.test03.service.AnnotationService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(AnnotationConfig.class);
        AnnotationService annotationService = configApplicationContext.getBean(AnnotationService.class);
        annotationService.test();
        configApplicationContext.close();

    }
}
