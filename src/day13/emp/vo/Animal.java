package day13.emp.vo;

public class Animal extends Object{
  public Animal(){
    super();  //new와 같이 Object를 메모리에 생성
  }

  public void eat(){
    System.out.println("Animal eat!");//추상적인 개체(대분류)
  }
}
