package day13.emp.vo;

public class Cat extends Animal{
  public Cat(){
    super();
  }
  //override : super class의 동일한 이름을 가진(파라미터, 파라미터 타입까지 같아야 함) 메소드를 재정의
  public void eat(){
    System.out.println("Cat eat!");
  }

  public void night(){
    System.out.println("밤에는 고양이눈이 무섭다.");
  }
}
