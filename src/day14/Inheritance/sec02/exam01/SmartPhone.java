package day14.Inheritance.sec02.exam01;

public class SmartPhone extends Phone {
  private boolean wifi;
  //기본 생성자 선언
  public SmartPhone(){}
  //자식 생성자 선언
  public SmartPhone(String model, String color, boolean wifi){
    super(model,color);
    this.wifi = wifi;
  }

  public String getWifi(){
    String message = "";
    if(this.wifi)
      message = "wifi 사용중";
    else
      message = "wifi 꺼짐";
    return message;
  }

  public void setWife(boolean wifi){
    this.wifi = wifi;
    if (this.wifi)
      System.out.println("wifi on");
    else
      System.out.println("wifi false");
  }
}