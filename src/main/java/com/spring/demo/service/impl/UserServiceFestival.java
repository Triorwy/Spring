package com.spring.demo.service.impl;

import com.spring.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceFestival implements UserService {

  @Override
  public void add() {
    System.out.println("添加节日");
  }
}
