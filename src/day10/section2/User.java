package day10.section2;

public class User {
  private String nationality;
  private String name;
  private String number;

  User(){
  }

  User(String nationality, String name, String number){
    this.nationality = nationality;
    this.name = name;
    this.number = number;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }
}
