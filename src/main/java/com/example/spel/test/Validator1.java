package com.example.spel.test;

import org.springframework.stereotype.Component;

import com.example.spel.dto.User;

@Component
public class Validator1 {

	public boolean emailValidation(User user) {
		System.out.println("Inside emailValidation "+user.getEmail());
		return true;
	}

	public boolean usernameValidation(User user) {
		System.out.println("Inside usernameValidation "+user.getUsername());
		return true;
	}

	public boolean phoneNumberValidation(User user) {
		System.out.println("Inside phoneNumberValidation "+user.getPhone());
		return false;
	}

}
