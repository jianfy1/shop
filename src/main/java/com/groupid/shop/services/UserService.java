package com.groupid.shop.services;

import com.groupid.shop.domain.User;

/**
 * @author Fu Yingjian
 * @date 2017/11/22
 */

public interface UserService {
	public boolean login(String userId, String password);
	public boolean register(String phoneNumber, String password);
	public User getUser(String userId);
}
