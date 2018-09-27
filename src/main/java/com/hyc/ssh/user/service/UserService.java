package com.hyc.ssh.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.hyc.ssh.user.dao.UserDao;
import com.hyc.ssh.user.entity.User;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class UserService {

	@Autowired
	private UserDao userDao;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void create(User entity) {
		userDao.create(entity);
	}
	
	public List<User> list(){
		return userDao.list();
	}
	
	public void delete(User entity) {
		userDao.delete(entity);
	}

	public User get(Integer id) {
		return userDao.get(id);
	}
}
