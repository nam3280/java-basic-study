package day10.section1;

public class Car {
  String company = "volvo";
  String model = "V3-1003";
  String carNumber = "1234567";
  String color = "black";
  int speed;

  //생성자 오버로딩
  Car(){
  }//디폴트 생성자

  Car(String company, String model, String color){
    this.company = company;
    this.model = model;
    this.color = color;
  }
}
