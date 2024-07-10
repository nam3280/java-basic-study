package day13.emp.vo;

public class Dog extends Animal{
  public Dog(){
    super();
  }
  //override : super class의 동일한 이름을 가진(파라미터, 파라미터 타입까지 같아야 함) 메소드를 재정의
  public void eat(){
    System.out.println("Dog eat!");
  }
}
