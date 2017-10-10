package com.example.test03.annotation;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration //1
@ComponentScan //2
public @interface CombineConfiguration {

    String[] value() default {}; //3

}
