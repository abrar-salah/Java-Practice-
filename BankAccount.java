import java.util.Scanner;
class BankAccount {
  private String name;
  private double balance;
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public double getBalance() {
    return balance;
  }
  public void deposit(double money) {
    this.balance = this.balance + money;
    System.out.println("Hello " + this.name + "! \n" + "your current balance is " + this.balance);
  }
  public void withdraw(double money) {
    this.balance = this.balance - money;
    System.out.println("Hello " + this.name + "! \n" + "your current balance is " + this.balance);
  }

}
class Main {
  public static void main(String[] args) {
    double amount;
    int operation;
    boolean keep_in = true;
    BankAccount A = new BankAccount();
    Scanner input = new Scanner(System.in);
    System.out.println("Please inter your Account Name");
    A.setName(input.nextLine());
    while (keep_in != false) {
      System.out.println("For deposit inter 1 and for withdraw inter 2");
      operation = input.nextInt();
      if (operation == 1) {
        System.out.println("Please inter The deposit amount");
        A.deposit(input.nextDouble());
      } else if (operation == 2) {
        System.out.println("Please inter The withdraw amount");
        A.withdraw(input.nextDouble());
      } else {
        System.out.println("please inter a valid operation ");
      }
      System.out.println(" Do you want to make any other operations? please answer with true or false.");
      keep_in = input.nextBoolean();
    }
  }
}
