package day15.interfaceEx.sec01;

public class RemoteControlExample {

  public static void main(String[] args) {
    RemoteControl rc;
    //rc 변수에 Television 객체를 대입
    rc = new Television();
    rc.turnOn();
    //rc 변수에 Audio 객체를 대입(교체시킴)
    //인터페이스 변수를 통해서 메소드가 호출되면 실제로
    rc = new Audio();
    rc.turnOn();
  }
}