package edu.monash.util;

import java.util.HashMap;
import java.util.Map;

import edu.monash.model.User;

public class DatabaseUtil {
	
	private static Map<String, User> db = new HashMap<String, User>();
	
	public static boolean addUser(String username, String pwd, int age, String gender) {
		
		if(db.containsKey(username)) {
			return false;
		} else {
			User user = new User(username, pwd, age, gender);
			db.put(username, user);
			
			return true;
		}
	}
	
	public static User verifyUser(String username, String password) {
		if(db.containsKey(username)) {
			User user = db.get(username);
			if(user.getPwd().equals(password)) {
				return user;
			} else {
				return null;
			}
		} else {
			return null;
		}
	}
}
