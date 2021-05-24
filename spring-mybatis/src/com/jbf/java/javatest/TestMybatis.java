package com.jbf.java.javatest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jbf.java.mapper.UserDao;
import com.jbf.java.pojo.User;

public class TestMybatis {                                          
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("com/jbf/conf/applicationContext.xml");
	String[] beanDefinitionNames = context.getBeanDefinitionNames();
	for (String string : beanDefinitionNames) {
		System.out.println(string);
	}
	  UserDao userDAO = (UserDao) context.getBean("userDao");
      // ���� UserDAO �ķ���
      User user = userDAO.findUserById("Jack");
      // ����û���Ϣ
      System.out.println(user.getPassword() + ":" + user.getUsername());
}
}
