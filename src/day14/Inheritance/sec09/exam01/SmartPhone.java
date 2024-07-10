package day14.Inheritance.sec09.exam01;

public class SmartPhone extends Phone{
  //생성자 선언
  SmartPhone(String owner){
    super(owner);
  }
  //메소드 선언
  void internetPlay(){
    System.out.println("인터넷 검색 기능을 실행합니다.");
  }

  void sendVoice(){}
  void receiveVoice(){}
}