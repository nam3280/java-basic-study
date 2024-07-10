package day9.section5;

public class MultidimensionalArrayByValueListExample {

  public static void main(String[] args) {
    //2차원 배열 생성
    int[][] scores = {{80,90,96},{76,88}};
    //배열의 길이
    System.out.printf("1차원 배열 길이(반의 수) 출력 : %d\n",scores.length);
    System.out.printf("2차원 배열 길이(첫번째 반의 학생 수) 출력 : %d\n",scores[0].length);
    System.out.printf("2차원 배열 길이(두번째 반의 학생 수) 출력 : %d\n",scores[1].length);
    //첫번째 반의 세번째 학생의 점수 읽기
    System.out.println(scores[0][2]);
    //두번째 반의 두번째 학생의 점수 읽기
    System.out.println(scores[1][1]);
    //첫번째 반의 평균 점수 구하기
    int total1 = 0;
    double avg1 = 0;

    for (int i = 0; i < scores[0].length; i++) {
      total1 += scores[0][i];
    }

    avg1 = (double) total1 / scores[0].length;
    System.out.printf("%.1f\n",avg1);
    //두번째 반의 평균 점수 구하기
    int total2 = 0;
    double avg2 = 0;

    for (int i = 0; i < scores[1].length; i++) {
      total2 += scores[1][i];
    }

    avg2 = (double) total2 / scores[1].length;
    System.out.printf("%.1f\n",avg2);
    //전체 학생의 평균 점수 구하기
    int total = 0;
    double avg = 0;

    int totalStudent = 0;
    for (int i = 0; i < scores.length; i++) {
      for (int j = 0; j < scores[i].length; j++) {
        totalStudent++;
        total += scores[i][j];
      }
    }

    avg = (double) total / totalStudent;
    System.out.printf("%.1f\n",avg);
  }
}
