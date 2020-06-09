package com.yst.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication(scanBasePackages="com.yst")
@ImportResource({"classpath:spring-mybatis.xml"})
public class BusinessManagerWebStartup {

	public static void main(String[] args) {
		SpringApplication.run(BusinessManagerWebStartup.class, args);
	}

}
