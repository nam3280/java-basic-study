package day14.Inheritance.sec04.exam02;

public class Car {

  //필드 선언
  public int speed;

  //메소드 선언
  public void speedUp() {
    speed += 1;
  }

  //final 메소드 : 메서드 앞에 final이 붙으면 최종메소드 이므로 오버라이딩 불가
  public final void stop() {
    System.out.println("차를 멈춤");
    speed = 0;
  }
}