package day12.account;

public class CheckingAccount extends Account {
  private String cardNo;

  public CheckingAccount(String accId, String ownerName, long balance, String cardNo){
    super();
    this.accId = accId;
    this.ownerName = ownerName;
    this.balance = balance;
    this.cardNo = cardNo;
  }

  public String getCardNo() {
    return cardNo;
  }

  public void pay(String cardNo, long amount){
    if (this.cardNo.equals(cardNo) && this.balance >= amount)
      this.withdraw(amount);
    else
      System.out.println("지불이 불가능합니다.");
  }
}