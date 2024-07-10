package day18.wrapperEx;

public class WrapEx01 {
  public static void main(String[] args) {
    //100값을 객체로 생성하는 과정(박싱)
    Integer value = 100; //AutoBoxing 자동박싱
    Boolean b1 = true;
    boolean b2 = b1.booleanValue();

    int v = value.intValue();//언박싱
    int v1 = value; //AutoUnBoxing 자동언박싱
    v = v + 100;

    //재포장(박싱)
    value = v;
    System.out.println(value);

    Integer num1 = 10;
    Integer num2 = 20;
    Integer result = num1 + num2;
    System.out.println(result);

    //객체 값 비교(equals()로 비교해야 한다.)
    System.out.println(num1.equals(num2));
    System.out.println(num1 < num2);
    System.out.println(num1 + num2);//자동언박싱

    String str1 = "10";
    String str2 = "10.5";

    int value2 = Integer.parseInt(str1);
    double value3 = Double.parseDouble(str2);

    //AutoBoxing과 기본 타입의 연산 과정을 for 100만 건 이상으로 성능평가 코드 돌려보기
  }
}
