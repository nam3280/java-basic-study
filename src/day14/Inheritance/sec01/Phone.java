package day14.Inheritance.sec01;

public class Phone {

  //필드 선언
  protected String model;
  protected String color;

  public Phone(){}
  public Phone(String model, String color){
    this.model = model;
    this.color = color;
  }

  //메소드 선언
  public void bell() {
    System.out.println("벨이 울립니다.");
  }

  public void sendVoice(String message) {
    System.out.println("자기: " + message);
  }

  public void receiveVoice(String message) {
    System.out.println("상대방: " + message);
  }

  public void hangUp() {
    System.out.println("전화를 끊습니다.");
  }
}