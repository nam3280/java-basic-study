package day10.section3;

public class Calculator {
  public void powerOn(){
    System.out.println("전원을 켭니다.");
  }
  public void powerOff(){
    System.out.println("전원을 끕니다.");
  }

  public int plus(int num1, int num2){
    int plusResult = num1 + num2;
    return plusResult;
  }

  public double divide(double num1, double num2){
    double divideResult = num1 / num2;
    return divideResult;
  }
}
