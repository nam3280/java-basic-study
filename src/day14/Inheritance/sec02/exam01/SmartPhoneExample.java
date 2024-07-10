package day14.Inheritance.sec02.exam01;

public class SmartPhoneExample {

  public static void main(String[] args) {
    SmartPhone smartPhone1 = new SmartPhone();
    smartPhone1.setModel("갤럭시");
    smartPhone1.setColor("검정색");
  System.out.println(smartPhone1.getModel() + " " + smartPhone1.getColor());
    //SmartPhone 객체 생성
    SmartPhone smartPhone2 = new SmartPhone("아이폰", "빨간색",true);
    smartPhone2.setWife(false);
    System.out.println(smartPhone2.getModel() + " " + smartPhone2.getColor() + " " + smartPhone2.getWifi());
  }
}