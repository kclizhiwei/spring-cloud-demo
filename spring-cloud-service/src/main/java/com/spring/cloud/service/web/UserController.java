package com.spring.cloud.service.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.cloud.service.domain.UserService;
import com.spring.cloud.service.model.User;
/**
 * <b>Description:</b><br>
 * <p>
 * 
 * </p>
 * <b>Create Time:</b><br>
 * <p>
 * 2016年8月21日 下午4:27:31
 * </p>
 * @author lizw
 */
@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	/**
	 * <b>Description:</b><br>
	 * <p>
	 * 
	 * </p>
	 * <b>Create Time:</b><br>
	 * <p>
	 * 2016年8月21日 下午4:27:43
	 * </p>
	 * @author lizw
	 * @return
	 */
	@RequestMapping(value="/user",method=RequestMethod.GET)
	public List<User> readUserInfo(){
		List<User> ls=userService.searchAll();		
		return ls;
	}
}