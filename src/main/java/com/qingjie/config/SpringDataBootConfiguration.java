package com.qingjie.config;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages = "com.qingjie.repository")
@ComponentScan("com.qingjie")
public class SpringDataBootConfiguration {

	@PostConstruct
	protected void iamAlive() {
		System.out.println("@PostConstruct " + this.getClass().getName());
	}

}
