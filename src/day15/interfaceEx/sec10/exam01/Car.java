package day15.interfaceEx.sec10.exam01;

public class Car {
  //필드
  Tire tire;
  //메소드
  public Car(Tire tire){
    this.tire = tire;
  }

  void run() {
    tire.roll();
  }
}