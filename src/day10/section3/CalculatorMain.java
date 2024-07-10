package day10.section3;

public class CalculatorMain {
  public static void main(String[] args) {
    Calculator cal = new Calculator();

    cal.powerOn();

    int plusResult = cal.plus(1,2);
    System.out.println(plusResult);

    double divideResult = cal.divide(13,3);
    System.out.printf("%.1f\n",divideResult);

    cal.powerOff();
  }
}
