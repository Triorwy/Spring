package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 * 组件扫描
 * @author triorwy
 */
@ComponentScan
public class AppSpring
{

    public static void main( String[] args )
    {
        System.out.println("ApplicationSpring");
        ApplicationContext context = new ClassPathXmlApplicationContext(
            "applicationContext.xml");

        MessagePrinter printer = context.getBean(MessagePrinter.class);

        printer.printMessage();

    }

}
