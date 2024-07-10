package day9.section5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MultidimensionalArrayByNewExample {

  public static void main(String[] args) throws IOException {
    // 각 반의 학생 수가 3명으로 동일할 경우 점수 저장을 위한 2차원 배열 생성
    int[][] engScores = new int[2][3];
    // 배열 항목 초기값 출력
    for(int i = 0; i < engScores.length; i++){
      for(int j = 0; j < engScores[i].length; j++){
        System.out.printf("engScores[%d][%d] = %d\n",i ,j,engScores[i][j]);
      }
    }
    System.out.println();
    // 배열 항목 값 변경
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("영어 점수 입력 : ");
    StringTokenizer st = new StringTokenizer(br.readLine()," ");

    int total = 0;
    int student = 0;

    while (st.hasMoreTokens()){
      for(int i = 0; i < engScores.length; i++){
        for(int j = 0; j < engScores[i].length; j++){
          student++;

          engScores[i][j] = Integer.parseInt(st.nextToken());

          total += engScores[i][j];

          System.out.printf("engScores[%d][%d] = %d\n",i ,j,engScores[i][j]);
        }
      }
    }

    System.out.println("total = " + total);
    // 전체 학생의 영어 평균 구하기
    double avg = 0;

    avg = (double) total / student;

    System.out.printf("avg = %.1f\n",avg);
    // 각 반의 학생 수가 다를 경우 점수 저장을 위한 2차원 배열 생성
    int[][] mathScores = new int[3][];

    int stuNum = 0;//각 반의 학생수

    System.out.print("1반부터 3반까지 각 반의 인원수 차례대로 입력 : ");

    StringTokenizer st1 = new StringTokenizer(br.readLine()," ");
    while(st1.hasMoreTokens()) {
      for (int i = 0; i < mathScores.length; i++) {
        mathScores[i] = new int[Integer.parseInt(st1.nextToken())];
      }
    }

    System.out.println();
    // 배열 항목 값 변경

    // 전체 학생의 영어 평균 구하기

  }
}
