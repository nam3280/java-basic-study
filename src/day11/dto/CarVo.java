package day11.dto;

public class CarVo {
  public int carSn;
  public String carName;
  public int carPrice;
  public String carOwner;
  public int carYear;
  public String carType;

  public CarVo(int carSn, String carName, int carPrice, String carOwner, int carYear, String carType){
    this.carSn = carSn;
    this.carName = carName;
    this.carPrice = carPrice;
    this.carOwner = carOwner;
    this.carYear = carYear;
    this.carType = carType;
  }
}
