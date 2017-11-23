package com.groupid.shop.services.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.groupid.shop.dao.UserDao;
import com.groupid.shop.services.UserService;

/**
 * @author Fu Yingjian
 * @date 2017/11/22
 */

@Service
public class UserServiceImpl implements UserService {

	@Resource
	UserDao userDao;

	@Override
	public boolean login(String userId, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean register(String phoneNumber, String password) {
		// TODO Auto-generated method stub
		return false;
	}

}
