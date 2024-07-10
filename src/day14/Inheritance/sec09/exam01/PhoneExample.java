package day14.Inheritance.sec09.exam01;

public class PhoneExample {

  public static void main(String[] args) {
    Phone phone = new SmartPhone("SSG");//추상 메서드이므로 실체화될 수 없음
    phone.turnOn();
    phone.calling();
    phone.sendVoice();
    phone.receiveVoice();
    phone.turnOff();
  }
}