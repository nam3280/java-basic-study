package day18.MathEx;

public class MathEx01 {
  public static void main(String[] args) {
    System.out.println(Math.abs(-1));
    System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
    System.out.println(Math.round(1.4));
    System.out.println(Math.round(1.6));
    System.out.println(Math.round(-1.5));
    System.out.println(Math.round(1));
    System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");//올림
    System.out.println(Math.ceil(1.4));
    System.out.println(Math.ceil(1.6));
    System.out.println(Math.ceil(-1.5));
    System.out.println(Math.ceil(1));
    System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");//내림
    System.out.println(Math.floor(1.4));
    System.out.println(Math.floor(1.6));
    System.out.println(Math.floor(-1.5));
    System.out.println(Math.floor(1));
    System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
    System.out.println((int)Math.sqrt(9));
    System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
    //System.out.println((int)(Math.random() * 10 + 1));
    double random = Math.floor((Math.random() * 10) + 1);
    System.out.println((int)random);
  }
}
