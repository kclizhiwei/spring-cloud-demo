package com.spring.cloud.config.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.cloud.config.demo.model.DataSourceConfig;
import com.spring.cloud.config.demo.model.RedisConfig;

@RestController
public class SimpleConfigController {
	@Autowired
	private RedisConfig redisConfig;
	@Autowired
	private DataSourceConfig dataSourceConfig;

	@RequestMapping(value = "/redis")
	public String redis() {
		String host = redisConfig.getHost();
		String port = redisConfig.getPort();
		return "redis.host:" + host + 
				" ,redis.port:" + port;
	}

	@RequestMapping(value = "/db")
	public String db() {
		String url = dataSourceConfig.getUrl();
		String username = dataSourceConfig.getUsername();
		String password = dataSourceConfig.getPassword();
		return "dataSource.url:" + url 
				+ " ,dataSource.username:" + username 
				+ " ,dataSource.password:" + password;
	}
}
