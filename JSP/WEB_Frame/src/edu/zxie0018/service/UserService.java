package edu.zxie0018.service;

import edu.zxie0018.dao.UserDao;
import edu.zxie0018.model.User;

public class UserService {
	public boolean register(String username, String password, int age, String gender) {
		UserDao userDao = new UserDao();
		if(userDao.isExist(username)) {return false;}
		else {
			userDao.addUser(username, password, age, gender);
			return true;
		}
	}
	
	
	public User login(String username, String password) {
		return new UserDao().getUserByUserPWD(username, password);
	}
	
	public boolean isExist(String username) {
		return new UserDao().isExist(username);
	}
}
