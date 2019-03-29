package com.example.spel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.expression.AccessException;

import com.example.spel.dto.User;
import com.example.spel.test.Test;

@SpringBootApplication
public class SpelPocApplication {

	public static void main(String[] args) throws AccessException {
		ApplicationContext context = SpringApplication.run(SpelPocApplication.class, args);
		Test t = context.getBean(Test.class);
		User user = new User();
		user.setEmail("test@test.com");
		user.setPhone("213123222");
		user.setUsername("testing");
		t.check(user);
	}

}
