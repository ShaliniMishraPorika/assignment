package com.capgemini.springmvcassign.config;

import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Controller;
@Controller
public class EntityManagerFactoryConfig {
	@Bean
	public LocalContainerEntityManagerFactoryBean getEntityManager() {
		LocalContainerEntityManagerFactoryBean factoryBean=new
				LocalContainerEntityManagerFactoryBean();
		factoryBean.setPersistenceUnitName("emsPersistence");
		
		return factoryBean;
		
	}

}
