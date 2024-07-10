package day17.exception;

public class TryWithResourceEx {
  public static void main(String[] args) {
    try(MyResource re = new MyResource("VICRORY")) {
      String data = re.readOne();
      int value = Integer.parseInt(data);
    }catch (Exception e){
      System.out.println("숫자로 바꿀 수 없음");
      e.getMessage();
    }
    System.out.println();
  }
}
