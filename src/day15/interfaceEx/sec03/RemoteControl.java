package day15.interfaceEx.sec03;

public interface RemoteControl {
  //상수 필드
  int MAX_VOLUME = 30;
  int MIN_VOLUME = 0;

  //추상 메소드 : 구현부가 없는 메소드
  abstract void turnOn();
  abstract void turnOff();
  abstract void setVolume(int volume);
}