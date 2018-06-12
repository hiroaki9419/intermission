package com.homepage.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.homepage.dao", "com.homepage.service"})
public class BusinessLogicConfig {

}
