package com.w3cjava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.w3cjava.dao.UserMapper;
import com.w3cjava.pojo.User;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;
	
	public List<User> getAllUsers(){
		return userMapper.getAllUsers();
	}
	
	public User findById(String id){
		return userMapper.findById(id);
	}
}
