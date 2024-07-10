package day12.account;

public class Account {
  protected String accId;
  protected long balance;
  protected String ownerName;

  public Account(){}
  public Account(String accId,long balance,String ownerName){
    this.accId = accId;
    this.balance = balance;
    this.ownerName = ownerName;
  }

  public void deposit(long money){
    this.balance = this.balance + money;
  }

  public void withdraw(long money){
    this.balance = this.balance - money;
  }

  public long getBalance(){
    return this.balance;
  }
}
