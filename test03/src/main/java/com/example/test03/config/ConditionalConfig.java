package com.example.test03.config;

import com.example.test03.LinuxCondition;
import com.example.test03.ListService;
import com.example.test03.WindowsCondition;
import com.example.test03.service.LinuxListService;
import com.example.test03.service.WindowsListService;
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
