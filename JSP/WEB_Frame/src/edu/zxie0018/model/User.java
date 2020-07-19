package edu.zxie0018.model;

public class User {
	private String username;
	private String password;
	private int age;
	private String gender;
	private boolean isAdmin = false;
	
	public User(String username, String password, int age, String gender, boolean isAdmin) {
		super();
		this.username = username;
		this.password = password;
		this.age = age;
		this.gender = gender;
		this.isAdmin = isAdmin;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public boolean isAdmin() {
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", age=" + age + ", gender=" + gender
				+ ", isAdmin=" + isAdmin + "]";
	}

}
