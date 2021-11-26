package com.rokot;

public class UserInfo {

	private String userName;
	private String country;
	private int post;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPost() {
		return post;
	}
	public void setPost(int post) {
		this.post = post;
	}
	
	public UserInfo(String userName, String country, int post) {
		super();
		this.userName = userName;
		this.country = country;
		this.post = post;
	}
	
	@Override
	public String toString() {
		return "UserInfo [userName=" + userName + ", country=" + country + ", post=" + post + "]";
	}
	
	


}
