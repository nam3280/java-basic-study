package day15.interfaceEx.sec10.exam01;

public class CarExample {

  public static void main(String[] args) {
    Tire tire1 = new HankookTire();
    Tire tire2 = new KumhoTire();
    //자동차 객체 생성
    Car car = new Car(tire1);
    //run() 메소드 실행
    car.run();
    //타이어 객체 교체
    car.tire = tire2;
    //run() 메소드 실행(다형성: 실행 결과가 다름)
    car.run();
  }
}