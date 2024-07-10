package day12.Inhertance.extendEx;

//한 파일에서 public은 클래스명.java인 클래스에만 public을 써야한다.
class Parent {
  String name = "홍길순";

  void details(){
    System.out.println(this.name);
  }
}

class Child extends Parent{
  String name = "홍길동";

  void details(){
    super.details();
    System.out.println(this.name);
  }

  void printDetails(){
    details();
    System.out.println("부모 이름 : " + super.name);
    System.out.println("자식 이름 : " + this.name);
  }
}

public class Inhertance04 {
  public static void main(String[] args) {
    Child objChild = new Child();
    objChild.printDetails();
  }
}