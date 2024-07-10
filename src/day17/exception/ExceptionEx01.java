package day17.exception;

public class ExceptionEx01 {
  public static void main(String[] args) {
    //printLengthString("JavaDATABASE_PROGRAMMING");
    printLengthString("null");
  }

  public static void printLengthString(String data){
    int result = 0;
    try {
      result = data.length();
      System.out.println("문자 수 = " + result);

      Class.forName("java.lang.Sting");
      System.out.println("String 클래스 존재");
    } catch (NullPointerException e) {
      //System.err.println(e.getMessage());
      //System.out.println(e.toString());
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
      System.out.println("null 예외 처리 완료");
    } catch (Exception e){
      e.printStackTrace();
    } finally {
      System.out.println("마무리 해");
    }
  }
}
