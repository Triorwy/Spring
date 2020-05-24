package com.spring.demo.xml.service;

import java.util.List;

/**
 * @author liuzhao.liu
 * @date 2020/5/21 21:29 mobile phone：132-0145-6372
 */
public class CompactDisc {

  private String title;

  private String artist;


  private List<Music> tracks;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
    System.out.println("在" + this.toString() + "中注入构造函数是主题");

  }

  public String getArtist() {
    return artist;
  }

  public void setArtist(String artist) {
    this.artist = artist;
    System.out.println("在" + this.toString() + "中注入构造函数是作曲家");

  }

  public List<Music> getTracks() {
    return tracks;
  }

  public void setTracks(List<Music> tracks) {
    this.tracks = tracks;
    System.out.println("在" + this.toString() + "中注入构造函数是歌曲");
  }


  public CompactDisc() {
    super();
    System.out.println("CD的构造方法" + this.toString());
  }

  public CompactDisc(String title, String artist) {

    this.title = title;
    this.artist = artist;
    System.out.println("CD有参构造函数" + this.toString());
  }

  public CompactDisc(String title, String artist, List<Music> tracks) {
    this.title = title;
    this.artist = artist;
    this.tracks = tracks;
    System.out.println("Cd三个参数的构造函数" + this.toString());
  }

  public void play() {
    System.out.println("CD播放音乐..." + this.toString() + "-唱片:"
        + this.title + "-作曲家:");

    for (Music track : this.tracks) {
      System.out.println("歌曲:" + track.getSinger() + "时长：" + track.getTime());
    }
  }
}
