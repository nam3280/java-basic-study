package day9.section3;

public class CharAtExample {

  public static void main(String[] args) {
    String ssn = "0106241230123";

    for(int i = 6; i < ssn.length(); i++){
      char ch = ssn.charAt(i);
      System.out.printf("%s",ch);
    }

    System.out.println();

    for(int i = 0; i < ssn.length(); i++){
      char ch = ssn.charAt(i);

      if (ch == '1' || ch == '3') {
        System.out.printf("%d 남성\n",i);
      }
      else if(ch == '2' || ch == '4'){
        System.out.printf("%d 여성\n",i);
      }
    }
  }
}
