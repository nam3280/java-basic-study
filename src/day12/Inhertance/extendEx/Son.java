package day12.Inhertance.extendEx;

public class Son extends Father{
  String name = "홍길동";

  public void printDetails(){
    System.out.println("나의 이름은 " + name);
    System.out.println("나의 아버지는 " + familyName);
    System.out.println("나의 집은 " + houseAddress);
  }
}
