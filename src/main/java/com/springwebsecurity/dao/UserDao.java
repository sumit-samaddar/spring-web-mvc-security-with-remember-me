package com.springwebsecurity.dao;

import com.springwebsecurity.model.User;

public interface UserDao {

	User findById(int id);

	User findBySSO(String sso);

}
