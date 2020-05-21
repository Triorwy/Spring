package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author triorwy
 */
@Component
public class CDPlayer {

  @Autowired(required = false)
  private CompactDisc cd;

  @Autowired
  private Power power;

//  @Autowired
//  public void setCd(CompactDisc cd) {
//    this.cd = cd;
//    System.out.println("diaoyong");
//  }
//
//  @Autowired
//  public void setPower(Power power) {
//    this.power = power;
//    System.out.println("diaoyong22");
//
//  }

  public CDPlayer() {
    super();
    System.out.println("CAplay午餐构造函数");
  }

//  @Autowired
//  public void CDPlayer(CompactDisc compactDisc) {
//    this.cd = compactDisc;
//    System.out.println("CDplayer有参数构造函数");
//  }
//
  @Autowired
  public void CDPlayer(CompactDisc compactDisc, Power power) {
    this.cd = compactDisc;
    this.power = power;
    System.out.println("CDplayer多参数构造函数");
  }

//  @Autowired
//  public void prepare(CompactDisc cd, Power power) {
//    this.cd = cd;
//    this.power = power;
//    System.out.println("diaoyongperpare");
//  }

  public void play() {
    cd.play();
    power.supply();
  }
}
