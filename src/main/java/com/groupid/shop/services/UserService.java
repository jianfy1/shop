package com.groupid.shop.services;

/**
 * @author Fu Yingjian
 * @date 2017/11/22
 */

public interface UserService {
	public boolean login(String userId, String password);

	public boolean register(String phoneNumber, String password);
}
