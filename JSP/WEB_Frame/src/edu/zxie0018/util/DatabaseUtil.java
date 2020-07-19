package edu.zxie0018.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.zxie0018.model.Good;
import edu.zxie0018.model.User;

public class DatabaseUtil {
	public static Map<String, User> userMap = new HashMap<String, User>();
	
	public static List<Good> goodsList = new ArrayList<Good>();
	
	static {
		addUser(new User("kk", "123", 10, "male", true));
		addUser(new User("bob", "bob", 13, "male", true));
		
		goodsList.add(new Good("Apple", "Great Apple", 10, 100));
		goodsList.add(new Good("Cherry", "Great Cherry", 11, 200));
		goodsList.add(new Good("Banana", "Great Banana", 12, 300));
		goodsList.add(new Good("Orange", "Great Orange", 13, 400));
		goodsList.add(new Good("Pear", "Great Pear", 14, 500));
		goodsList.add(new Good("Peach", "Great Peach", 15, 600));
		goodsList.add(new Good("Watermelon", "Great Watermelon", 16, 700));
		goodsList.add(new Good("Kiwi", "Great Kiwi", 17, 800));
		goodsList.add(new Good("Mango", "Great Mango", 18, 900));
		goodsList.add(new Good("Blueberry", "Great Blueberry", 19, 1000));
	}
	
	private static void addUser(User user) {
		userMap.put(user.getUsername(), user);
	}
}
