package day11.exec;

import day11.model.Person;
import java.util.Scanner;

public class PersonMain {
  public static void main(String[] args) {
    day11.model.Person hong = new day11.model.Person();

//    hong.name = "홍길동";
//    hong.age = 20;
//    hong.phone = "010-1234-5678";
//    System.out.println(hong.toString());
    Scanner sc = new Scanner(System.in);

    System.out.print("이름 : ");
    String name = sc.nextLine();
    sc.nextLine();

    System.out.print("나이 : ");
    int age = sc.nextInt();

    System.out.print("이름 : ");
    String phone = sc.nextLine();

//    personInfoPrint(name, age, phone);
    personInfoPrintObject(hong);
    
    hong.eat();
    hong.walk();
    hong.play();

    day11.model.Person na = new day11.model.Person("나주인","010-4444-9898");
    na.age = 25;
    na.eat();
    na.walk();
    na.play();
  }

  public static void personInfoPrint(String name, int age, String phone){
    System.out.println("이름 : " + name + " 나이 : " + age + " 번호 : " + phone);
  }

  public static void personInfoPrintObject(Person person){
    System.out.println("이름 : " + person.name + " 나이 : " + person.age + " 번호 : " + person.phone);
  }
}
