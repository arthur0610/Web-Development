package edu.monash.model;

public class User {
	private String username;
	private String pwd;
	private int age;
	private String gender;
	
	
	public User(String username, String pwd, int age, String gender) {
		this.username = username;
		this.pwd = pwd;
		this.age = age;
		this.gender = gender;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
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
	
}
