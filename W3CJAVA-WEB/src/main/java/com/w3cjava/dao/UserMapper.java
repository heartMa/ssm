package com.w3cjava.dao;

import org.springframework.stereotype.Component;

import com.w3cjava.common.base.dao.CrudDao;
import com.w3cjava.pojo.User;

@Component
public interface UserMapper extends CrudDao<User>{

}
