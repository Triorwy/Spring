package soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//单元测试注解，自动初始化spring上下文环境
@RunWith(SpringJUnit4ClassRunner.class)
//自动注入到Spring中
@ContextConfiguration(classes=AppConfig.class)
public class AppTest {

  @Autowired
  private CDPlayer player;

  @Autowired
  private CompactDisc compactDisc;

  @Test
  public void testPlay(){

    compactDisc.play();
  }

}
