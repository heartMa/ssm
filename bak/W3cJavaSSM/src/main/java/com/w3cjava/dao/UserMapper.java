package com.w3cjava.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.w3cjava.pojo.User;

@Component
public interface UserMapper {
	public List<User> getAllUsers();
	public User findById(String id);
}
