package com.example.test03.annotation;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration //1
@ComponentScan //2
@SpringBootApplication
public @interface CombineConfiguration {

    @AliasFor(
            annotation = ComponentScan.class,
            attribute = "basePackages"
    )
    String[] value() default {}; //3

}
