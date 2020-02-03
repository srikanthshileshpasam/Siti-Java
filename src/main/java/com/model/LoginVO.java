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
}
