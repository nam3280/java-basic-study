package day9.section4;

public class ArrayCreateByNewExample {
  public static void main(String[] args) {
    //배열 변수 선언과 배열 생성
    int[] arr1 = new int[3];
    //배열 항목의 초기값 출력
    for (int i : arr1) {
      System.out.println(i);
    }

    for (int i = 0; i < arr1.length; i++) {
      arr1[i] = (i + 1) * 10;
      System.out.printf("%d ", arr1[i]);
    }

    System.out.println();
    //배열 항목의 값 변경
    String[] str = new String[4];
    //배열 항목의 변경값 출력
    str[0] = "봄";
    str[1] = "여름";
    str[2] = "가을";
    str[3] = "겨울";
    for (String s : str) {
      System.out.println(s);
    }
    //배열 변수 선언과 배열 생성

    //배열 항목의 초기값 출력

    System.out.println();
    //배열 항목의 값 변경

    //배열 항목의 변경값 출력

    //배열 변수 선언과 배열 생성

    //배열 항목의 초기값 출력

    System.out.println();
    //배열 항목의 값 변경

    //배열 항목의 변경값 출력

  }
}
