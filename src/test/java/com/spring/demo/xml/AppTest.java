package com.spring.demo.xml;

import com.spring.demo.xml.service.CompactDisc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author liuzhao.liu
 * @date 2020/5/21 21:48 mobile phone：132-0145-6372
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AppTest {
    @Autowired
    private CompactDisc compactDisc;

    @Autowired
    private CompactDisc compactDisc2;

    @Test
    public void test(){
        compactDisc.play();
        compactDisc2.play();
    }
}
