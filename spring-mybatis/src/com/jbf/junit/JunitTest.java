package com.jbf.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import com.jbf.java.mapper.UserDao;
import com.jbf.java.pojo.User;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:com/jbf/conf/applicationContext.xml"})
public class JunitTest {
@Autowired
UserDao userDao;
@Test
public void test(){
      // ���� UserDAO �ķ���
      User user = userDao.findUserById("Jack");
      // ����û���Ϣ
      System.out.println(user.getPassword() + ":" + user.getUsername());
}
}
