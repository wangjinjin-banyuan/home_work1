public class AbstractPhilosopher extends Thread {

  private Chopsticks left;
  private Chopsticks right;

  public boolean eat() throws InterruptedException {
    if (!left.take(500)) {
      System.out.println("没拿到筷子，不吃了");
      return false;
    }
   // try {
      Thread.sleep(200);
   // } catch (InterruptedException e) {
     // e.printStackTrace();
   // }
    if (!right.take(500)) {
      System.out.println("没拿到筷子，不吃了");
      left.put();
      return false;
    }
    System.out.println(getName() + ",吃饭");
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    left.put();
    right.put();
    System.out.println(getName() + ",吃饭结束");
    return true;
  }

  public void thinking() throws InterruptedException {
    System.out.println(getName() + ",思考");
    try {
      Thread.sleep(200);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println(getName() + ",思考结束");
  }

  public Chopsticks getLeft() {
    return left;
  }

  public void setLeft(Chopsticks left) {
    this.left = left;
  }

  public Chopsticks getRight() {
    return right;
  }

  public void setRight(Chopsticks right) {
    this.right = right;
  }
}
