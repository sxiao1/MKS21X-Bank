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
  private boolean authenticate(String password){
    if (password.equals(this.password)){
      return boolean;
    }
    else{
      return boolean;
    }
  }
  public boolean transferTo(BankAccount other, double amount, String password){
    if(authenticate(password) && amount > 0 && amount =< balance){
      return (this.withdraw(amount) && other.deposit(amount));
    }
    else{
      return false;
    }
  }
}
