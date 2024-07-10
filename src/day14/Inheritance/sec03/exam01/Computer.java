package day14.Inheritance.sec03.exam01;

public class Computer extends Calculator {

  @Override //어노테이션(Annotation) : 컴파일 시 오버라이딩이 정확히 되었는지 체크하는 표시
  public double areaCircle(double radius) {
    System.out.println("computer의 areaCircle() 실행");
    return radius * radius * Math.PI;
  }
//메소드 오버라이딩

}