package day11.exec.aa;

public class B extends A{
  protected String bb = "B클래스의 bb";

  public void bb(){
    System.out.println(bb + "실행");
  }

  @Override
  public String toString() {
    return "B{" +
        "bb='" + bb + '\'' +
        '}';
  }
}
