package com.spring.demo.xml.service;

/**
 * @author:liuzhao
 * @phone:132-0145-6372
 * @date:2020/5/23 下午6:14
 */

public class Music {

  public Music() {
    super();
    System.out.println("Music的w无参构造函数"+this.toString());
  }

  private String singer;

  public Music(String singer, String time) {
    this.singer = singer;
    this.time = time;
  }

  public String getSinger() {
    return singer;
  }

  public void setSinger(String singer) {
    System.out.println("在" + this.toString() + "中注入构造函数是singer");
    this.singer = singer;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
    System.out.println("在" + this.toString() + "中注入构造函数是timer");
  }

  private String time;
}
