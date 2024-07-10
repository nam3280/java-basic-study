package day9.section1;

public class StringSplitTokenizerEx {
  public static void main(String[] args) {
    //public String[] split(String regex, int limit);
    //반환을 String 배열로 받는다.
    //구분 기호를 문자열이 아닌 정규표현식으로 받는다.

    //split보다 java.util.stringtokenizer의 성능(속도)가 빠르다.
    //반환을 배열로 받는 것보다 객체로 받는 것이 더 빠르기 때문이다.

    String str1 = "mycaptain0771@gmail.com";
    String[] splitCh = str1.split("@");
    int index = 1;

    for (String s : splitCh) {
      System.out.println(index + " " + s);
      index++;
    }

    for (int i = 0; i < splitCh.length; i++) {
      System.out.printf("%d %s\n", i + 1, splitCh[i]);
    }

    String str2 = "mycaptain0771@gmail.com@http://github.com/thatzcool@notion.so/thatzcool";

    String[] splitCh1 = str2.split("@",3);

    index = 1;
    for (String s : splitCh1) {
      System.out.println(index + " " + s);
      index++;
    }

    for (int i = 0; i < splitCh1.length; i++) {
      System.out.printf("%d %s\n", i + 1, splitCh1[i]);
    }

    String str3 = "ssg-in&c%https://github.com";
    String[] result1 = str3.split("[-&%]");

    index = 1;
    for (String s : result1) {
      System.out.println(index + " " + s);
      index++;
    }

    for (int i = 0; i < result1.length; i++) {
      System.out.printf("%d %s\n", i + 1, result1[i]);
    }

    String str4 = "ssg|in|c|https://github.com";
    String[] result2 = str4.split("\\|");

    index = 1;
    for (String s : result2) {
      System.out.println(index + " " + s);
      index++;
    }

    for (int i = 0; i < result2.length; i++) {
      System.out.printf("%d %s\n", i + 1, result2[i]);
    }
  }
}
