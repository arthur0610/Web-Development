package edu.zxie0018.dao;


import edu.zxie0018.model.User;
import edu.zxie0018.util.DatabaseUtil;

public class UserDao {
	public boolean isExist(String username) {
		return DatabaseUtil.userMap.containsKey(username);
	}
	
	public boolean addUser(String username, String password, int age, String gender) {
		if(isExist(username)) {return false;}
		
		User newUser = new User(username, password, age, gender, false);
		DatabaseUtil.userMap.put(username, newUser);
		return true;
	}
	
	public User getUserByUserPWD(String username, String password) {
		if(isExist(username) == false) { return null; }
		User user = DatabaseUtil.userMap.get(username);
		if(user.getPassword().equals(password)) {return user;}
		else {return null;}	
		
	}
}
