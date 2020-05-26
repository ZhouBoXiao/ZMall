package com.devotion.zmall.seckill.service;

import com.devotion.zmall.seckill.dao.UserDao;
import com.devotion.zmall.seckill.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserDao userDao ;
	
	public User getById(int id) {
		return userDao.getById(id);
	}



}
