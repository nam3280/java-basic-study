package day9.section1;

public class SbEx {
  public static void main(String[] args) {
    //stringBuffer, stringBuilder 클래스는 문자열 연산(연결, 변경, 수정)에 사용됨

    //String 클래스 +, concat() : 문자열을 이어 붙여서 사용함

    StringBuffer sb = new StringBuffer();

    sb.append("Hello1");
    sb.append(" Hello2");
    sb.append(" Hello3");
    sb.append(" Hello4");
    String result = sb.toString();
    //toString() 사용 이유 : buffer가 제공되어 문자열 연산을 해서 제공하여 최종 결과를 만들때 사용하므로 속도가 빠름
    System.out.println(result);

    String str = "ABCDEFGHIJKLMN";
    StringBuilder sb1 = new StringBuilder(str);
    System.out.println(sb1);

    String str2 = sb1.toString();
    String str3 = sb1.substring(3,10);

    sb1.insert(2,"OPQRSTU");
    String str4 = sb1.toString();
    System.out.println(str4);


    sb1.delete(2,16);
    String str5 = sb1.toString();
    System.out.println(str5);


    sb1.insert(sb1.length(),"OPQRSTU");
    String str6 = sb1.toString();
    System.out.println(str6);

    System.out.println(str6.length());  //길이

    System.out.println(sb1.capacity()); //용량

    System.out.println(sb1.reverse());// 거꾸로 출력
  }
}
//String
//(1)String str = new String("a"), String str1 = new String("a")
//(1)로 할당할 경우 str == str1은 false이다.
//heap 메모리에 서로 다른 "a"로 동적 할당이 되기 때문이다.
//(2)String str = "a", String str1 = "a"
//(2)로 할당할 경우 str == str1은 true이다.
//리터럴로 할당할 경우 heap 메모리에 String constant pool에 저장된다.
//만약 String constant pool안에 저장되어 있는 값을 사용하면 그 값을 쓰기 때문에 true가 나온다.

//StringBuffer vs StringBuilder
//String : 불변성(immutable) -> 할당된 공간이 변하지 않는 특성
//StringBuffer, StringBuilder : 가변성(mutable) -> 할당된 공간이 변하는 특성
//StringBuilder가 속도면에서는 더 빠르다.
//하지만 StringBuffer는 멀티스레드 부분에서 유리하다.(동기화)
//synchronized가 한 스레드가 돌면 다른 스레드가 접근할 수 없게 막기 때문
