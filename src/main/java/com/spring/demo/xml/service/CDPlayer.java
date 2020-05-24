package com.spring.demo.xml.service;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author:liuzhao
 * @phone:132-0145-6372
 * @date:2020/5/23 下午3:46
 */
public class CDPlayer {

  public CompactDisc getCompactDisc() {
    return compactDisc;
  }

  public void setCompactDisc(CompactDisc compactDisc) {
    this.compactDisc = compactDisc;
    System.out.println("cdplayer的" + this.toString() + "-set注入函数");
  }

  //@Autowired
  private CompactDisc compactDisc;

  public CDPlayer() {
    super();
    System.out.println("CD无参构造函数" + this.toString());
  }

  public CDPlayer(CompactDisc compactDisc) {
    this.compactDisc = compactDisc;
    System.out.println("CD有参构造函数" + this.toString());
  }

  public void play() {
    System.out.println("CdPlay:" + this.toString());
    compactDisc.play();
  }

}
