package com.spring.demo.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = AppConfig.class)
@ContextConfiguration("classpath:applicationContext-history.xml")
public class UserServiceTest {

  @Autowired
  @Qualifier("userServiceFestival")
  private UserService userService;

  @Test
  public void test(){
    userService.add();
  }
}
