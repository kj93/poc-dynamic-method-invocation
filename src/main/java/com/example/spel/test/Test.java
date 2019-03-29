package com.example.spel.test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.expression.BeanFactoryResolver;
import org.springframework.core.env.Environment;
import org.springframework.expression.AccessException;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.stereotype.Component;

import com.example.spel.dto.User;

@Component
public class Test implements BeanFactoryAware {

	BeanFactory beanFactory;

	@Autowired
	Environment env;

	public void check(User user) throws AccessException {
		ExpressionParser expressionParser = new SpelExpressionParser();
		StandardEvaluationContext context = new StandardEvaluationContext();
		context.setBeanResolver(new BeanFactoryResolver(beanFactory));
		context.setVariable("user", user);
		String[] methods = env.getProperty("method.names").split(",");
		for (int i = 0; i < methods.length; i++) {
			System.out.println(expressionParser.parseExpression("@" + methods[i]+"(#user)").getValue(context));
		}
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
	}

}
