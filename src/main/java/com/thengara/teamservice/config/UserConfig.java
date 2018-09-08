package com.thengara.teamservice.config;

import java.util.HashMap;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

//@Configuration
//@EnableJpaRepositories(basePackages = "com.thengara.teamservice.entity.user", entityManagerFactoryRef = "userEntityManager", transactionManagerRef = "userTransactionManager")
public class UserConfig {
	/*@Autowired
	private Environment env;

	private final String database  = "userdb";

	
	@Bean(name="userEntityManager")
	@Primary
	public LocalContainerEntityManagerFactoryBean userEntityManager() {
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setDataSource(userDataSource());
		em.setPackagesToScan(new String[] { "com.thengara.teamservice.entity.user" });

		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		em.setJpaVendorAdapter(vendorAdapter);
		HashMap<String, Object> properties = new HashMap<>();
		properties.put("hibernate.hbm2ddl.auto", env.getProperty(database+".hibernate.hbm2ddl.auto"));
		properties.put("hibernate.dialect", env.getProperty(database+".hibernate.dialect"));
		em.setJpaPropertyMap(properties);

		return em;
	}

	@Primary
	@Bean
	public DataSource userDataSource() {

		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(env.getProperty(database+".jdbc.driverClassName"));
		dataSource.setUrl(env.getProperty(database+".user.jdbc.url"));
		dataSource.setUsername(env.getProperty(database+".jdbc.user"));
		dataSource.setPassword(env.getProperty(database+".jdbc.pass"));

		return dataSource;
	}

	@Primary
	@Bean
	public PlatformTransactionManager userTransactionManager() {

		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(userEntityManager().getObject());
		return transactionManager;
	}*/
}