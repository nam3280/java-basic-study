package day10.section1;

public class CarMain {
  public static void main(String[] args) {
    Car volvo = new Car();

    System.out.println("company = " + volvo.company);
    System.out.println("model = " + volvo.model);
    System.out.println("color = " + volvo.color);

    Car myCar = new Car("현대기아", "뉴카니발", "White");
    System.out.println("company = " + myCar.company);
    System.out.println("model = " + myCar.model);
    System.out.println("color = " + myCar.color);
  }

}
