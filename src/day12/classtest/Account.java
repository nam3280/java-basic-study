package day12.classtest;

public class Account {
  static final int MIN_BALANCE = 0;
  static final int MAX_BALANCE = 1000000;//상수(값이 정해져서 변경 불가능한 수) -> static final로 정의
  private int balance;

  public int getBalance() {
    return this.balance;
  }

  public void setBalance(int balance) {
    if(balance < Account.MIN_BALANCE || balance > Account.MAX_BALANCE)
      return;

    this.balance = balance;
  }
}
