package com.model;

import com.fasterxml.jackson.annotation.JsonView;

public class LoginVO {

	
	public String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String pass;
	
	public String userType;
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	public String userStatus;
	public int loginValid;
	public int getLoginValid() {
		return loginValid;
	}
	public void setLoginValid(int loginValid) {
		this.loginValid = loginValid;
	}
}
