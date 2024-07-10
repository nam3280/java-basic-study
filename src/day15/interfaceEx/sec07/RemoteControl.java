package day15.interfaceEx.sec07;

public interface RemoteControl {
  //추상 메소드
  void turnOn();

  void turnOff();

  default void setVolume(int volume){}
  default void setMute(boolean mute){}
}