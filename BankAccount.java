public class BankAccount{
  private double balance;
  private int accountID;
  private String password;
  public BankAccount(int newAccountID, double newBalance, String newPassword){
    accountID = newAccountID;
    balance = newBalance;
    password = newPassword;
  }
  public double getBalance(){
    return balance;
  }
  public int getAccountID(){
    return accountID;
  }
  public void setPassword(String newPass){
    password = newPass;
  }
  public String toString(){
    return accountID+ "\t" + balance;
  }
  public boolean deposit(double amount){
    if (amount > 0){
      balance += amount;
      return true;
    }
    else{
      return false;
    }
  }
  public boolean withdraw(double amount){
    if (amount <= balance){
      balance -= amount;
      return true;
    }
    else{
      return false;
    }
  }
}
