package com.spring.cloud.service.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.cloud.service.model.User;

/**
 * <b>Description:</b><br>
 * <p>
 * 
 * </p>
 * <b>Create Time:</b><br>
 * <p>
 * 2016年8月21日 下午4:23:52
 * </p>
 * @author lizw
 */
@Repository("userDao")
public interface UserDao {

	/**
	 * <b>Description:</b><br>
	 * <p>
	 * 
	 * </p>
	 * <b>Create Time:</b><br>
	 * <p>
	 * 2016年8月21日 下午4:23:56
	 * </p>
	 * @author lizw
	 * @return
	 */
	List<User> findAll();
}