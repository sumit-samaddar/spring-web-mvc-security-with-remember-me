package com.springwebsecurity.service;

import com.springwebsecurity.model.User;

public interface UserService {

	User findById(int id);

	User findBySso(String sso);

}