package com.arka.back_arka_core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@ConfigurationPropertiesScan
@SpringBootApplication
public class BackArkaCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackArkaCoreApplication.class, args);
	}

}
