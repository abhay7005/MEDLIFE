
package com.medlife.api.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;


/**
 * @author Abhay
 *
 */
@Configuration
@EnableTransactionManagement
public class HibernateConfiguration {

	@Value("${spring.datasource.driver-class-name}")
	private String DB_DRIVER;

	@Value("${spring.datasource.password}")
	private String DB_PASSWORD;

	@Value("${spring.datasource.url}")
	private String DB_URL;

	@Value("${spring.datasource.username}")
	private String DB_USERNAME;

	@Value("${spring.jpa.properties.hibernate.dialect}")
	private String HIBERNATE_DIALECT;

	@Value("${spring.jpa.properties.hibernate.show_sql}")
	private String HIBERNATE_SHOW_SQL;
	
	@Value("${spring.jpa.properties.hibernate.format_sql}")
	private String HIBERNATE_FORMAT_SQL;

	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String HIBERNATE_HBM2DDL_AUTO;

	@Value("${spring.jpa.entity-manager.packages-to-scan}")
	private String ENTITYMANAGER_PACKAGES_TO_SCAN;

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource  dataSource= new DriverManagerDataSource();
		dataSource.setDriverClassName(DB_DRIVER);
		dataSource.setUrl(DB_URL);
		dataSource.setUsername(DB_USERNAME);
		dataSource.setPassword(DB_PASSWORD);
		return dataSource;
	}

	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setPackagesToScan(ENTITYMANAGER_PACKAGES_TO_SCAN);
		Properties hibernateProperties = new Properties();
		hibernateProperties.put("hibernate.dialect", HIBERNATE_DIALECT);
		hibernateProperties.put("hibernate.show_sql", HIBERNATE_SHOW_SQL);
		hibernateProperties.put("hibernate.format_sql", HIBERNATE_FORMAT_SQL);
		hibernateProperties.put("hibernate.hbm2ddl.auto", HIBERNATE_HBM2DDL_AUTO);
		
		
		sessionFactory.setHibernateProperties(hibernateProperties);
		return sessionFactory;
	}

	@Bean
	public HibernateTransactionManager transactionManager() {
		HibernateTransactionManager txManager = new HibernateTransactionManager();
		txManager.setSessionFactory(sessionFactory().getObject());
		return txManager;
	}
	
	

}
