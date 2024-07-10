package day14.Inheritance.sec03.exam01;

public class ComputerExample {
  public static void main(String[] args) {
    int radius = 10;
    Calculator calculator1 = new Calculator();
    System.out.println("원 면적 : " + calculator1.areaCircle(radius));
    System.out.printf("원 면적 : %.1f", calculator1.areaCircle(radius));

    Calculator calculator2 = new Computer();
    double area= calculator2.areaCircle(20);
    System.out.println("원 면적 : " + area);
    System.out.printf("원 면적 : %.1f", area);
  }
}