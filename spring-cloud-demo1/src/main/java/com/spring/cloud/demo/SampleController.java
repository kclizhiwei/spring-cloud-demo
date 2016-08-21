package com.spring.cloud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
/*@RestController
@EnableAutoConfiguration*/
@Controller
@SpringBootApplication
public class SampleController {
	
	/**
	 * <b>Description:</b><br>
	 * <p>
	 * 
	 * </p>
	 * <b>Create Time:</b><br>
	 * <p>
	 * 2016年8月21日 下午2:35:11
	 * </p>
	 * @author lizw
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/")
	public String home() {
		return "hello world!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SampleController.class, "--server.port=8081");
	}
}
