package com.example.test04;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionalConfig {

    @Bean
    @Conditional(WindowsCondition.class)
    public ListService windows(){
        return new WindowsListService();
    }

    @Bean
    @Conditional(LinuxCondition.class)
    public ListService linux(){
        return new LinuxListService();
    }
}
