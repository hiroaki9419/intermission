package com.homepage.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

// 환경설정
@Configuration
// DataSource 등 Infra 관련 >> 자주 변경될 수 있는 Bean 생성
@PropertySource({"classpath:/db/dbconfig.properties"})
// dbconfig.properties로부터 값 로딩
// @Transactional 활성화
@EnableTransactionManagement
public class InfraConfig {
	// 개발 환경에서 사용되는 DataSource >> dev profile
	// dbconfig.properties의 값을 ${driver} 형태로 참조
	@Bean
	@Profile("dev")
	public DataSource dataSource1(@Value ("${db.driver}") String driverClassName, @Value("${db.url}") String url, @Value("${db.username}") String username, @Value("${db.password}") String password) {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName(driverClassName);
		ds.setUrl(url);
		ds.setUsername(username);
		ds.setPassword(password);
		return ds;
	}
	
	// 운영 환경에서 사용되는 DataSource >> oper profile
	@Bean
	@Profile("oper")
	public DataSource dataSource2(@Value ("${db.driver}") String driverClassName,
								  @Value("${db.url}") String url,
								  @Value("${db.username}") String username,
								  @Value("${db.password}") String password) {
		BasicDataSource ds = new BasicDataSource();// 진짜 DS
		ds.setDriverClassName(driverClassName);
		ds.setUrl(url);
		ds.setUsername(username);
		ds.setPassword(password);
		return ds;
	}
	
	@Bean
	public SqlSessionFactoryBean sessionFactoryBean(DataSource ds) {
		SqlSessionFactoryBean sfb = new SqlSessionFactoryBean();
		sfb.setDataSource(ds);
		String conFile = "classpath:/db/mybatis/mybatis-config.xml";
		Resource res = new PathMatchingResourcePatternResolver().getResource(conFile);
		sfb.setConfigLocation(res);
		return sfb;
	}
	
	@Bean
	public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactoryBean factory) throws Exception {
		SqlSessionTemplate template = new SqlSessionTemplate(factory.getObject());
		return template;
	}
	
	@Bean
	public PlatformTransactionManager transactionManager(DataSource ds) {
		DataSourceTransactionManager dtm = new DataSourceTransactionManager(ds);
		return dtm;
	}
}
