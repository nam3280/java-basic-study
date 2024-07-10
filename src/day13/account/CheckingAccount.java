package day13.account;

public class CheckingAccount extends Account{
  private String cardNo;

  public CheckingAccount(String accId, String ownerName, long balance, String cardNo){
    super(accId, balance, ownerName);
    this.cardNo = cardNo;
  }

  public String getCardNo() {
    return cardNo;
  }

  public void setCardNo(String cardNo) {
    this.cardNo = cardNo;
  }

  @Override
  public void calcRate() {}

  public void pay(String cardNo, long amount){
    if (cardNo.equals(getCardNo()))
      withdraw(amount);
    else
      System.out.println("지불이 불가능합니다.");
  }
}