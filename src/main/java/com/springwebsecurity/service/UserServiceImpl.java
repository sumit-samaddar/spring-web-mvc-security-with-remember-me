package com.springwebsecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springwebsecurity.dao.UserDao;
import com.springwebsecurity.model.User;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao dao;

	public User findById(int id) {
		return dao.findById(id);
	}

	public User findBySso(String sso) {
		return dao.findBySSO(sso);
	}

}
