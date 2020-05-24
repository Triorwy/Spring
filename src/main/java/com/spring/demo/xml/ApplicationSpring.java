package com.spring.demo.xml;

import com.spring.demo.xml.service.CompactDisc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author liuzhao.liu
 * @date 2020/5/21 21:17 mobile phone：132-0145-6372
 */
public class ApplicationSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationSpring = new ClassPathXmlApplicationContext(
            "applicationContext-history.xml");

        CompactDisc bean = applicationSpring.getBean(CompactDisc.class);
        bean.play();
    }
}
