package com.crm.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {
    // Method to create and configure a ModelMapper instance to map entities to DTOs
    @Bean
    public ModelMapper getMapper(){
        return new ModelMapper();
    }
}
