package com.spring.demo.xml;

import com.spring.demo.xml.service.CDPlayer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author:liuzhao
 * @phone:132-0145-6372
 * @date:2020/5/23 下午9:06
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AppSetTest {

  @Autowired
  private CDPlayer cdPlatyer;

  @Test
  public void test() {
    cdPlatyer.play();
  }
}
