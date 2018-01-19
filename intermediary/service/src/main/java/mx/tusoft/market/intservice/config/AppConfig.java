package mx.tusoft.market.intservice.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = {
		"classpath:settings_app.properties"		
},
name = "environment")
@ComponentScan(basePackages = {
		"mx.tusoft.market.intservice.dao"		
})
@Import(value = {
	PersistenceConfig.class
})
public class AppConfig {
	
}