package hello;

import org.springframework.stereotype.Component;

/**
 * 打印服务
 * @author triorwy
 */
@Component
public class MessageService {

  public MessageService() {
    super();
    System.out.println("MessageService");
  }

  /**
   * 执行打印功能
   * @return
   */
  public String getMessage() {
    return "Change world!";
  }

}
