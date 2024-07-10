package day10.section2;

public class UserMain {
  public static void main(String[] args) {
    User me = new User("대한민국", "남윤호", "123456789");

    me.setName("홍길동");
    me.setNumber("1111111111111");

    System.out.println(me.getName());
    System.out.println(me.getNumber());
  }
}
