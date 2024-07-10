package day11.dao;

import day11.dto.CarVo;
import day11.util.Carutility;

public class CarDAO {
  public void carInsert(CarVo car){
    System.out.println("car 정보가 DB에 저장되었습니다.");
  }

  public void carSelect(){
    System.out.println("car 정보가 조회 되었습니다. 모든 Car 객체 초회");
  }
}
