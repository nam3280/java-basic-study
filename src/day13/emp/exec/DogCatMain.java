package day13.emp.exec;

import day13.emp.vo.Animal;
import day13.emp.vo.Cat;
import day13.emp.vo.Dog;

public class DogCatMain {
  public static void main(String[] args) {
    Animal x = new Cat();//업캐스팅
    x.eat();
    Cat cat1 = (Cat)x;//다운캐스팅
    cat1.night();//night()는 자식에만 존재하기 때문에 다운캐스팅을 통해 출력시킴

    x = new Dog();
    x.eat();

    Animal cat2 = new Cat();//업캐스팅
    cat2.eat();
    cat2 = (Cat)cat2;//다운캐스팅
    ((Cat)cat2).night();
  }
}
// 공통적으로 할 수 있는 부분을 만들어 간단하게 다루기 위해서 사용
//예시 코드
//업캐스팅 안할 때
//Rectangle[] r = new Rectangle[];
//r[0] = new Rectangle();
//
//Triangle[] t = new Triangle[];
//t[0] = new Triangle();
//
//Circle[] c = new Circle[];
//c[0] = new Circle();

//업캐스팅 할 때
//Shape[] s = new Shape[];
//s[0] = new Rectangle();
//s[1] = new Triangle();
//s[2] = new Circle();

//다운캐스팅은 타입이 다르면 불가

//다형성 전제조건 4가지 : 상속관계, 오버라이딩, 동적 바인딩, 캐스팅