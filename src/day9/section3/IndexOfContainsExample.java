package day9.section3;

public class IndexOfContainsExample {
  public static void main(String[] args) {
    String subject = "자바 객체 프로그래밍 과목입니다.";

    String str1 = subject.substring(subject.indexOf('객'),subject.indexOf('밍') + 1);
    System.out.println(str1);

    int start = subject.indexOf("프로그래밍");
    System.out.println(subject.substring(start));

    if (subject.contains("자바")) {
      System.out.println("자바 관련 과목이군요!");
    }
    else{
      System.out.println("자바와 관련 없는 과목이군요");
    }

    String[] str2 = subject.split(" ");
    boolean b = false;
    for (String s : str2) {
      if(s.equals("자바")){
        b = true;
      }
    }
    if(b){
      System.out.println("자바 관련 과목이군요!");
    }
    else{
      System.out.println("자바와 관련 없는 과목이군요");
    }
  }
}
