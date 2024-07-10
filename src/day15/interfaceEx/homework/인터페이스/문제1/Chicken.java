package day15.interfaceEx.homework.인터페이스.문제1;

public class Chicken extends Animal implements Cheatable {
  public Chicken(int speed){
    super(speed);
  }

  @Override
  void run(int hours){
    this.setDistance((double)this.speed * hours);
    System.out.printf("닭의 이동거리 = %.1f\n",this.getDistance());
  }

  @Override
  public void fly(int hours) {
    this.setDistance((double)this.speed * hours * 2);
    System.out.printf("날으는 닭의 이동거리 = %.1f\n",this.getDistance());
  }
}
