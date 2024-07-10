package day13.emp.exec;

import day13.emp.vo.Animal;
import day13.emp.vo.Cat;
import day13.emp.vo.Dog;

public class PolyMethodTest {
  public static void main(String[] args) {
    Dog d = new Dog();
    display(d);
    Cat c = new Cat();
    display(c);
    Animal[] animals = new Animal[2];
    animals[0] = d;
    animals[1] = c;
    display1(animals);
  }

  //다형성 인수 : 하나의 타입으로 여러가지 타입을 받을 수 있다.
  public static void display(Animal ani){
    ani.eat();

    //객체의 타입을 검사할 때 instanceof 연산자 사용
    if(ani instanceof Cat)//파라미터가 Cat인지 묻는 코드
      ((Cat)ani).night();
  }

  public static void display1(Animal[] animals){
    //객체의 타입을 검사할 때 instanceof 연산자 사용
    for (int i = 0; i < animals.length; i++) {
      if (animals[i] instanceof Cat)//파라미터가 Cat인지 묻는 코드
        ((Cat) animals[i]).night();
    }
  }
}
