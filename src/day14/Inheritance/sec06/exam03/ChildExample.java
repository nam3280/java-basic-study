package day14.Inheritance.sec06.exam03;

public class ChildExample {

  public static void main(String[] args) {
    //객체 생성 및 자동 타입 변환
    Parent parent = new Child();

    //Parent 타입으로 필드와 메소드 사용
    parent.field1 = "data1";
    parent.method1();
    parent.method2();
		/*
		parent.field2 = "data2";      	//(불가능)
		parent.method3();         		//(불가능)
		*/

    //강제 타입 변환
    Child child = (Child) parent;

    //Child 타입으로 필드와 메소드 사용
    child.field2 = "data2";      //(가능)
    child.method3();          //(가능)
  }
}
//다형성 : 사용 방법은 동일하지만, 실행 결과가 다양하게 나오는 성질
//사용 방법은 동일 : 동일한 메소드를 가지고 있음
//다형성을 구현하기 위해서는 상속, promotion, overriding, 실행 시점에서 메소드의 실행 여부 결정(동적바인딩) 필요