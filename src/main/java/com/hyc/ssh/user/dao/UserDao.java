package com.hyc.ssh.user.dao;

import java.util.List;

import com.hyc.ssh.user.entity.User;

public interface UserDao {
	
	public void create(User entity);
	
	public List<User> list();
	
	public void delete(User entity);

	public User get(Integer id);
}
