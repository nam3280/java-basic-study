package Study.day7.section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodEx1 {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  static void getPlayerInfo(int group, int player) {
    String diceGroupName = new String("");
  }

  public static void main(String[] args) throws IOException {
    MethodEx1 mex1 = new MethodEx1();

    int group = mex1.settingGroup();
    int player = mex1.playerSetting();

    mex1.dicePlay(group, player);

    getPlayerInfo(group, player);
  }

  int settingGroup() throws IOException {
    System.out.print("몇 개의 그룹으로 진행할까요? ");

    int group = Integer.parseInt(br.readLine());

    return group;
  }

  int playerSetting() throws IOException {
    System.out.print("인원수 입력 : ");

    int player = Integer.parseInt(br.readLine());

    return player;
  }

  public void dicePlay(int group, int player) {
    for (int i = 1; i <= group; i++) {
      System.out.printf("그룹%d\n", i);

      for (int j = 1; j <= player; j++) {
        int num = (int) (Math.random() * 6) + 1;

        if (num == 1) {
          System.out.println("1번이 나왔습니다.");
        } else if (num == 2) {
          System.out.println("2번이 나왔습니다.");
        } else if (num == 3) {
          System.out.println("3번이 나왔습니다.");
        } else if (num == 4) {
          System.out.println("4번이 나왔습니다.");
        } else if (num == 5) {
          System.out.println("5번이 나왔습니다.");
        } else {
          System.out.println("6번이 나왔습니다.");
        }
      }
    }
  }
}
