package com.example.spel.test;

import org.springframework.stereotype.Component;

import com.example.spel.dto.User;


@Component
public class Validator2 {
	public boolean emailValidation(User user) {
		System.out.println("Inside emailValidation2 "+user.getEmail());
		return true;
	}

	public boolean usernameValidation(User user) {
		System.out.println("Inside usernameValidation2 "+user.getUsername());
		return true;
	}

	public boolean phoneNumberValidation(User user) {
		System.out.println("Inside phoneNumberValidation2 "+user.getPhone());
		return false;
	}
}
