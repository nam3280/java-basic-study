package day17.exception;

public class ExceptionEx02 {
  public static void main(String[] args) {
    String[] arr = {"1000","l000",null,"200"};

//    for (String s : arr)
//      System.out.println(s);

    try {
      for (int i = 0; i < 10; i++){
        int value = Integer.parseInt(arr[i]);
        System.out.printf("array[%d] : %d\n",i,value);
      }
    } catch (ArrayIndexOutOfBoundsException e){
      System.err.println(e.getMessage());
    } catch (NullPointerException | NumberFormatException e) {
      e.printStackTrace();
    }
    System.out.println("프로그램 안전 종료");
  }
}
