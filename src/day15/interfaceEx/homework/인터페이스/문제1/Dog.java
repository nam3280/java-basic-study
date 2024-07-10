package day15.interfaceEx.homework.인터페이스.문제1;

public class Dog extends Animal {
  public Dog(int speed){
    super(speed);
  }

  @Override
  void run(int hours){
    this.setDistance((double)this.speed * hours / 2);
    System.out.printf("개의 이동거리 = %.1f\n",this.getDistance());
  }
}
