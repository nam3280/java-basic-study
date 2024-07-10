package day18.objectEx;

public class MemberCloneTest {
  public static void main(String[] args){
    Member member1 = new Member("ssg",30, new Address(10101,"서울시 영등포구"));

    try{


      Member member2 = member1.clone();

      Address address1 = member1.getAddr();
      Address address2 = member2.getAddr();

      //address2.setAddr("부산 해운대");

      System.out.println("Member1 = " + member1 + " addr = " + member1.getAddr());
      System.out.println("Member2 = " + member2 + " addr = " + member2.getAddr());
      System.out.println("address1 = " + address1 + " address1.getAddr() = " + address1.getAddr());
      System.out.println("address2 = " + address2 + " address2.getAddr() = " + address2.getAddr());

     /* System.out.println(member1);
      System.out.println(member2);

      Address address1 = new Address(10002,"서울시 동대문구");
      String addr = address1.getAddr();
      member2.setAddr(address1);
      System.out.println(member2);*/

    }catch (CloneNotSupportedException e){
      throw new RuntimeException(e);
    }

  }
}
