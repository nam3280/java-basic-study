package day9.section4;

public class ArrayCreateByVaueListExample1 {

  public static void main(String[] args) {
    //배열 변수 선언과 배열 생성
    String[] season = {"Spring", "Summer", "Fall", "Winter"};

    //배열의 항목값 읽기
    for (String s : season) {
      System.out.printf("%s ",s);
    }
    //인덱스 1 항목의 값 변경
    season[1] = "여름";
    for (String s : season) {
      System.out.printf("%s ",s);
    }
    System.out.println();
    //배열 변수 선언과 배열 생성
    int[] scores = new int[]{90,80,75,93,100};
    //총합과 평균 구하기
    int total = 0;
    int avg = 0;

    for (int score : scores) {
      total += score;
    }

    avg = total / scores.length;

    System.out.println(avg);
  }
}