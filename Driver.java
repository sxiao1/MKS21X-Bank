public class Driver{
  public static void main(String[] args){
  BankAccount a = new BankAccount(209698, 200, "hello");
  System.out.println(a.getBalance());
  System.out.println(a.getAccountID());
  a.setPassword("hihi");
  System.out.println(a.deposit(10));
  System.out.println(a.withdraw(250));
  }
}
