package com.spring.demo.xml.service;

/**
 * @author liuzhao.liu
 * @date 2020/5/21 21:29 mobile phone：132-0145-6372
 */
public class CompactDisc {
    public CompactDisc() {
        super();
        System.out.println("CD的构造方法" + this.toString());
    }

    public void play() {
        System.out.println("CD播放音乐..." + this.toString());
    }
}
