package day10.section1;

public class UserMain {
  public static void main(String[] args) {
    User user = new User("대한민국", "남윤호", "123456789");
    System.out.println(user.nationality);
    System.out.println(user.name);
    System.out.println(user.number);
  }
}
