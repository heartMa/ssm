package com.w3cjava.service;

import org.springframework.stereotype.Service;

import com.w3cjava.common.base.service.CrudService;
import com.w3cjava.dao.UserMapper;
import com.w3cjava.pojo.User;

@Service
public class UserService extends CrudService<UserMapper,User>{
	
}
