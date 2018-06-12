package com.homepage.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
@ComponentScan({"com.homepage.service"})
public class ApplicationConfig {
	@Bean
	public ReloadableResourceBundleMessageSource messageSource() {
		ReloadableResourceBundleMessageSource bundle = new ReloadableResourceBundleMessageSource();
		bundle.setBasenames("classpath:/bundle/error");
		bundle.setDefaultEncoding("utf-8");
		bundle.setCacheSeconds(0);// 개발 시
		return bundle;
	}
}
