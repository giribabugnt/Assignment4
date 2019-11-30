package giri.assignment4.dao;

import java.util.List;

import giri.assignment4.model.User;


public interface UserDao {

	User findByName(String name);
	
	List<User> findAll();
	
	 public int save(User user) ;
	 public int update(User user) ;

}