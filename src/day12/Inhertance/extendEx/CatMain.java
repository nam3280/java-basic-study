package day12.Inhertance.extendEx;

public class CatMain {
  public static void main(String[] args) {
    BabyCat babyCat = new BabyCat();
    System.out.printf("%s %s\n",babyCat.color,babyCat.breed);
    babyCat.meow();
    babyCat.eat();
  }
}
