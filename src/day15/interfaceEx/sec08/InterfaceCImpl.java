package day15.interfaceEx.sec08;

public class InterfaceCImpl implements InterfaceC{
//인터페이스의 다중 상속
  @Override
  public void methodB() {
    System.out.println("B");
  }

  @Override
  public void methodA() {
    System.out.println("A");
  }

  @Override
  public void methodC() {
    System.out.println("C");
  }
}