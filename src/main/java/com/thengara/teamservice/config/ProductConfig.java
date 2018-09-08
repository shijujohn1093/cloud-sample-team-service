package com.thengara.teamservice.config;

//@Configuration
//@EnableJpaRepositories(basePackages = "com.thengara.teamservice.entity.product", entityManagerFactoryRef = "productEntityManager", transactionManagerRef = "productTransactionManager")
public class ProductConfig {
	/*@Autowired
	private Environment env;
	
	private final String database  = "productdb";

	@Bean
	public LocalContainerEntityManagerFactoryBean productEntityManager() {
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setDataSource(productDataSource());
		em.setPackagesToScan(new String[] { "com.thengara.teamservice.entity.product" });

		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		em.setJpaVendorAdapter(vendorAdapter);
		HashMap<String, Object> properties = new HashMap<>();
		properties.put("hibernate.hbm2ddl.auto", env.getProperty(database+".hibernate.hbm2ddl.auto"));
		properties.put("hibernate.dialect", env.getProperty(database+".hibernate.dialect"));
		em.setJpaPropertyMap(properties);

		return em;
	}

	@Bean
	public DataSource productDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(env.getProperty(database+".jdbc.driverClassName"));
		dataSource.setUrl(env.getProperty(database+".product.jdbc.url"));
		dataSource.setUsername(env.getProperty(database+".jdbc.user"));
		dataSource.setPassword(env.getProperty(database+".jdbc.password"));

		return dataSource;
	}

	@Bean
	public PlatformTransactionManager productTransactionManager() {

		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(productEntityManager().getObject());
		return transactionManager;
	}*/

}
