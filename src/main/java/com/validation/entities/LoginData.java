package com.validation.entities;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class LoginData {
    
	@NotBlank(message="User Name Can Not be Empty!!")
	@Size(min = 3, max = 12, message = "User Name must be between 3 - 12 characters !")
	private String userName; 
	
	@Email(regexp="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message="Invalid Email !!")
	private String userEmail;
	
	@AssertTrue(message="Must agree terms and conditions")
	private boolean agreed;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	

	public boolean isAgreed() {
		return agreed;
	}

	public void setAgreed(boolean agreed) {
		this.agreed = agreed;
	}

	@Override
	public String toString() {
		return "LoginData [userName=" + userName + ", userEmail=" + userEmail + "]";
	}
	
	

}
