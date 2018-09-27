package com.hyc.ssh.user.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hyc.ssh.user.entity.Employee;
import com.hyc.ssh.user.entity.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void create(User entity) {
		sessionFactory.getCurrentSession().saveOrUpdate(entity);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> list() {
		// TODO Auto-generated method stub
		return (List<User>)sessionFactory.getCurrentSession().createCriteria(User.class).list();
	}

	@Override
	public void delete(User entity) {
		sessionFactory.getCurrentSession().createQuery("DELETE FROM User WHERE id = "+entity.getId()).executeUpdate();
	}

	@Override
	public User get(Integer id) {
		return (User) sessionFactory.getCurrentSession().get(User.class, id);
	}
 
}
