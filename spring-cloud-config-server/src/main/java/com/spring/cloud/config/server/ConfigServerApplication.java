package com.spring.cloud.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * <b>Description:</b><br>
 * <p>
 * 
 * </p>
 * <b>Create Time:</b><br>
 * <p>
 * 2016年8月21日 下午2:15:01
 * </p>
 * @author lizw
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, "--server.port=8081");
	}
}
