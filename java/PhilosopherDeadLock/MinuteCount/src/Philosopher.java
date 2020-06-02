import java.util.Random;

// 运行一分钟之后，哲学家线程退出
// 统计哲学家一共吃了多少次饭，多少次吃饭成功，一共进行了多少次思考
public class Philosopher extends AbstractPhilosopher {

  private Chopsticks[] chopsticks;
  private int code;
  private int eatCount;
  private int successEatCount;
  private int thinkingCount;

  public Philosopher(int code, Chopsticks[] chopsticks) {
    this.code = code;
    this.setName("哲学家" + code + "");
    this.chopsticks = chopsticks;
    setLeft(chopsticks[code - 1]);
    setRight(chopsticks[code % 5]);
  }


  @Override
  public void run() {
    Random random = new Random();

    while (!interrupted()) {
      if (random.nextBoolean()) {
        try {
          if (eat()) {

          } else {

            thinking();
          }
        } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
      }

    }
  }

  @Override
  public boolean eat() throws InterruptedException{
    eatCount++;
    if(super.eat()){
      successEatCount++;
      return true;
    }
    else{
      return false;
    }
  }

  @Override
  public void thinking() throws InterruptedException{
    thinkingCount++;
    super.thinking();
  }

  public void results() {
    System.out.println(
        getName() + ":一共吃饭" + eatCount+ "次,成功" + successEatCount + "次,思考" + thinkingCount + "次");
  }

}
