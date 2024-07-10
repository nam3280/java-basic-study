package Study.day8.section1;

public class EqualsExam {

  public static void main(String[] args) {
    String strv1 = "SSG"; //리터럴 : 사용자가 직접 입력한 값(고정값)
    System.out.println(strv1.hashCode());

    String strv2 = "SSG"; //상수 : 한번만 값을 저장 가능한 변수
    System.out.println(strv2.hashCode());

    strv1 = "SSG3";
    System.out.println(strv1.hashCode());
    //상수풀에 저장, 컴파일되는 시점

    String str3 = new String("SSG");
    String str4 = new String("SSG");

    System.out.println(str3 == str4);

    if (str3.equals(str4)) {
      System.out.println("같다");
    } else {
      System.out.println("다르다");
    }

    //String ssn = "9510103687516";
    String ssn = new String("9510103687516");

    char s = ssn.charAt(6);

    switch (s) {
      case '1':
      case '3':
        System.out.println("남");
        break;
      case '2':
      case '4':
        System.out.println("여");
        break;
    }

    for (int i = 0; i < ssn.length(); i++) {
      System.out.println(ssn.charAt(i));
    }
  }
}
