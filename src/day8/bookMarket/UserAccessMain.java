package Study.day8.bookMarket;

public class UserAccessMain {

  public static void main(String[] args) {
    User user1 = new User();

    user1.setId("ssg101");
    user1.setName("신세계");
    user1.setAddress("서울");
    user1.setMobileNumber("01012345678");
    user1.setPassword("101ssg");

    System.out.println(user1.getId());
    System.out.println(user1.getName());
    System.out.println(user1.getMobileNumber());
    System.out.println(user1.getPassword());
    System.out.println(user1.getAddress());

    System.out.println(user1);
  }
}
