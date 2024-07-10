package day15.interfaceEx.sec01;

public class Audio implements RemoteControl{

  @Override
  public void turnOn(){
    System.out.println("오디오 전원 온");
  }
}