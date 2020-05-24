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
 * @date:2020/5/23 下午3:51
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-history.xml")
public class CdPlayerTest {

  @Autowired
  private CDPlayer cdPlayer1;

  @Autowired
  private CDPlayer cdPlayer2;



  @Test
  public void play(){
    cdPlayer1.play();
  }

  @Test
  public void play2(){
    cdPlayer2.play();
  }
}
