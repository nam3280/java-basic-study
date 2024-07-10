package day11.exec;

import day11.dao.CarDAO;
import day11.dto.CarVo;
import day11.util.Carutility;

public class CarMain {

  public static void main(String[] args) {
    CarVo volvo = new CarVo(1000,"volvo",10000000,"홍길동",2024,"A");

    CarDAO carDao = new CarDAO();

    carDao.carInsert(volvo);
    carDao.carSelect();

    Carutility carutility = new Carutility();

    carutility.carPrint(volvo);
  }
}
