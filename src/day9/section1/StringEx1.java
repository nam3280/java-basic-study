package day9.section1;

public class StringEx1 {
  public static void main(String[] args) {
    String str1 = "자바 프로그래밍";
    String result = "";

    for (int i = str1.indexOf('프'); i < str1.length(); i++) {
      char ch = str1.charAt(i);
      result = result.concat(String.valueOf(ch));
      System.out.print(ch);
    }
  }
}
