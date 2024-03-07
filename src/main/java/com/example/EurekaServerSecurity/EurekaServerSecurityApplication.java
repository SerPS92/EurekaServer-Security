package com.example.EurekaServerSecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.core.SpringVersion;

import javax.swing.*;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerSecurityApplication.class, args);
		System.out.println(SpringVersion.getVersion());
	}

}
