package com.withing.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@PropertySource({"classpath:mysql-connection.properties"})
public class HibernateConfig {

//    private final Environment environment;
//
//    @Autowired
//    public HibernateConfig(Environment environment) {
//        this.environment = environment;
//    }
//
//    @Bean
//    public LocalSessionFactoryBean sessionFactory() {
//        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
//        sessionFactory.setDataSource(restDataSource());
//        sessionFactory.setPackagesToScan(
//                new String[]{"org.baeldung.spring.persistence.model"});
//        sessionFactory.setHibernateProperties(hibernateProperties());
//
//        return sessionFactory;
//    }
//
//    @Bean
//    public DataSource restDataSource() {
//        BasicDataSource dataSource = new BasicDataSource();
//        dataSource.setDriverClassName(environment.getProperty("spring.datasource.jdbc.driverClassName"));
//        dataSource.setUrl(environment.getProperty("spring.datasource.jdbc.url"));
//        dataSource.setUsername(environment.getProperty("spring.datasource.jdbc.user"));
//        dataSource.setPassword(environment.getProperty("spring.datasource.jdbc.password"));
//
//        return dataSource;
//    }
//
//    @Bean
//    @Autowired
//    public HibernateTransactionManager transactionManager(
//            SessionFactory sessionFactory) {
//
//        HibernateTransactionManager txManager
//                = new HibernateTransactionManager();
//        txManager.setSessionFactory(sessionFactory);
//
//        return txManager;
//    }
//
//    @Bean
//    public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
//        return new PersistenceExceptionTranslationPostProcessor();
//    }
//
//    Properties hibernateProperties() {
//        return new Properties() {
//            {
//                setProperty("hibernate.hbm2ddl.auto",
//                        environment.getProperty("hibernate.hbm2ddl.auto"));
//                setProperty("hibernate.dialect",
//                        environment.getProperty("hibernate.dialect"));
//                setProperty("hibernate.globally_quoted_identifiers",
//                        "true");
//                setProperty("hibernate.show_sql",
//                        environment.getProperty("hibernate.show_sql"));
//
//            }
//        };
//    }

}
