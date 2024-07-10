package day15.interfaceEx.sec06;

public interface Service {
  //디폴트 메소드
  default void defaultMethod1(){
    System.out.println("default Method1");
    defaultCommon();
  }

  default void defaultMethod2(){
    System.out.println("default Method2");
    defaultCommon();
  }
  //private 메소드(클래스 내부용)
  private void defaultCommon(){
    System.out.println("default Common");
  }
  //정적 메소드
  static void staticMethod1(){
    System.out.println("static Method1");
  }

  static void staticMethod2(){
    System.out.println("static Method2");
  }
  //private 정적 메소드(클래스 내부용)
  private static void staticCommon(){
    System.out.println("static Common");
  }
}