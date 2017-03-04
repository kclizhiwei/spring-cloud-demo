package com.spring.cloud.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@EnableAutoConfiguration
@RestController
@SpringBootApplication
@RefreshScope
public class SampleController {
	
	@Value("${mysqldb.datasource.url}")
	private String url;
	@Value("${redis.host}")
	private String host;
 	@Value("${redis.port}")
	private String port;
	@RequestMapping(value = "/db")
	public String db() {
		return "DB url:" + url;
	}
	@RequestMapping(value = "/redis")
	public String redis() {
		return "redis.host:" + host + " ,redis.port:" + port;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SampleController.class, "--server.port=8081");
	}
}
