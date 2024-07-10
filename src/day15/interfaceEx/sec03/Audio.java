package day15.interfaceEx.sec03;

public class Audio implements RemoteControl {
  //필드
  private int volume;

  //turnOn() 추상 메소드 오버라이딩
  @Override
  public void turnOn(){
    System.out.println("오디오 킨다.");
  }
  //turnOff() 추상 메소드 오버라이딩
  @Override
  public void turnOff(){
    System.out.println("오디오 끈다.");
  }
  //setVolume() 추상 메소드 오버라이딩
  @Override
  public void setVolume(int volume){
    if(volume > RemoteControl.MAX_VOLUME)
      this.volume = RemoteControl.MAX_VOLUME;
    else if(volume < RemoteControl.MIN_VOLUME)
      this.volume = RemoteControl.MIN_VOLUME;
    else
      this.volume = volume;

    System.out.println("volume = " + this.volume);
  }
}