package day18;

import java.util.StringTokenizer;

public class StringTokenizerEx {
  public static void main(String[] args) {
    String data1 = "김창완&정수민&김지훈";

    StringTokenizer st = new StringTokenizer(data1,"&");
    int i = 1;
    while (st.hasMoreTokens()) {
      System.out.println(i + " " + st.nextToken());
      i++;
    }

    String[] arr = data1.split("&");

    int j = 1;
    for (String s : arr) {
      System.out.println(j + " " + s);
      j++;
    }
  }
}
