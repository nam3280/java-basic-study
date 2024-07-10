package day15.interfaceEx.sec06;

public class ServiceExample {
  public static void main(String[] args) {
    //인터페이스 변수 선언과 구현 객체 대입
    Service service = new ServiceImpl();
    //디폴트 메소드 호출
    service.defaultMethod1();
    service.defaultMethod2();
    //정적 메소드 호출
    Service.staticMethod1();
    Service.staticMethod2();

//static은 인스턴스 객체로 접근이 안된다.
//    service.staticMethod1();

  }
}