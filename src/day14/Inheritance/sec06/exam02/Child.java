package day14.Inheritance.sec06.exam02;

//부모 타입으로 promotion한 이후 부모 클래스의 선언된 필드, 메소드만 접근 가능
public class Child extends Parent {

  //메소드 오버라이딩
  public void method2() {
    System.out.println("Child의 메소드2");
  }

  public void method3() {
    System.out.println("Child의 메소드3");
  }
}