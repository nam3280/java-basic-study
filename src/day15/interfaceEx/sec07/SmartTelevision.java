package day15.interfaceEx.sec07;
public class SmartTelevision implements RemoteControl,Searchable{
  //구현 객체는 여러개의 인터페이스를 implements 할 수 있다.
  //구현 객체가 인터페이스 A와 인터페이스 B를 구현하고 있다면 인터페이스를 통해 구현 객체를 사용할 수 있다.
  //turnOn() 추상 메소드 오버라이딩
  private int volume;

  @Override
  public void turnOn() {

  }
  //turnoff() 추상 메소드 오버라이딩
  @Override
  public void turnOff() {

  }
  //search() 추상 메소드 오버라이딩
  @Override
  public void search(String url) {
    System.out.println(url);
  }

  @Override
  public void setVolume(int volume) {
    this.volume = volume;
    System.out.println(this.volume);
  }

  @Override
  public void setMute(boolean mute) {
    if(mute){
      System.out.println("쉿");
      this.volume = 0;
    }
    else{
      System.out.println(this.volume);
    }
  }
}