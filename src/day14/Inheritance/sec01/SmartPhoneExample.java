package day14.Inheritance.sec01;

public class SmartPhoneExample {

  public static void main(String[] args) {
    //SmartPhone 객체 생성
    SmartPhone smartPhone1 = new SmartPhone("갤럭시", "검정색");
    //Phone으로부터 상속받은 필드 읽기
    System.out.println(smartPhone1.model + " " + smartPhone1.color);
    //SmartPhone의 필드 읽기
    smartPhone1.bell();
    smartPhone1.sendVoice("몇시에 만날래?");
    smartPhone1.receiveVoice("2시");
    smartPhone1.hangUp();
    //Phone으로부터 상속받은 메소드 호출

    //SmartPhone의 메소드 호출

  }
}