package mx.tusoft.market.intservice.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;

public class PersistenceConfig {

	@Autowired
	private Environment environment;
	
	@Bean
	public DataSource dataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl(environment.getProperty("markint.db.url"));
		dataSource.setUsername(environment.getProperty("markint.db.username"));
		dataSource.setPassword(environment.getProperty("markint.db.password"));
		return dataSource;
	}
	
	@Bean
	public LocalSessionFactoryBean localSessionFactoryBean() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setHibernateProperties(getHibernateProperties());
		String[] mappingResources = new String[] {
				"/mx/tusoft/market/intservice/pojos/TRol.hbm.xml",
				"/mx/tusoft/market/intservice/pojos/TUsuario.hbm.xml",
				"/mx/tusoft/market/intservice/pojos/TUsuarioRol.hbm.xml"
		};
		sessionFactory.setMappingResources(mappingResources);
		return sessionFactory;
	}
	
	private Properties getHibernateProperties() {
		Properties props = new Properties();
		props.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		props.setProperty("connection.isolation", "2");
		return props;
	}
}