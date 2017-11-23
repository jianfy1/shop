package com.groupid.shop.dao;

import org.springframework.stereotype.Repository;

import com.groupid.shop.domain.User;

@Repository
public interface UserDao {
	public User getUser(String userName);
}