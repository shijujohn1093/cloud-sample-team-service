package com.thengara.teamservice.config;

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