package com.spring.cloud.service.domain;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.cloud.service.dao.UserDao;
import com.spring.cloud.service.model.User;
/**
 * <b>Description:</b><br>
 * <p>
 * 
 * </p>
 * <b>Create Time:</b><br>
 * <p>
 * 2016年8月21日 下午4:25:38
 * </p>
 * @author lizw
 */
@Service
@Transactional
public class UserService {

	
	@Autowired
	private UserDao userDao;
	
	/**
	 * <b>Description:</b><br>
	 * <p>
	 * 
	 * </p>
	 * <b>Create Time:</b><br>
	 * <p>
	 * 2016年8月21日 下午4:25:43
	 * </p>
	 * @author lizw
	 * @return
	 */
	public List<User> searchAll(){
		List<User> list = userDao.findAll();
		return list;
	}
}
