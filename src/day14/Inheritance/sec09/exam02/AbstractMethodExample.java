package day14.Inheritance.sec09.exam02;

public class AbstractMethodExample {
  public static void main(String[] args) {
    Animal animal = new Dog();
    animal.sound();
    animal = new Cat();
    animal.sound();
  }
}