package arraylist;

/**
 * @author Zakir Hossain
 * Jan 25, 2020
 * This is the Bank class. It has default and parameterized constructors.
 * The object starts with a name and an amount of balance.
 *  Later, the amount get manipulated through the use of certain methods, such as deposit and withdraw.
 */
public class Bank {
    private String name;
    private double balance;

    public Bank(){
        name = "";
        balance = 0;
    }
    public Bank(String name, double balance){
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
      Deposits money into the bank account.
      @param amount the amount to deposit
   */
	public void deposit(double amount){
	    balance+=amount;
    }
   /**
      Withdraws money from the bank account.
      @param amount the amount to withdraw
   */
	public void withdraw(double amount){
	    balance-=amount;
    }
   /**
      Transfers money from the bank account to another account
      @param other the other account
      @param amount the amount to transfer
   */
	public void transfer(Bank other, double amount){
	    other.deposit(amount);
	    this.withdraw(amount);
    }
   /**
   	Determines if two BankAccounts are equal
   	@param other the other account
   	@return true if names and balances are equal
    */
	public boolean equals (Bank other){
        return other.name.equals(this.name) && other.balance == this.balance;
    }
   /**
   	Compares if two BankAccounts
   	@param other the other account
   	@return 0 if BankAccounts are equal
   		  <0 if this.balance is less than other.balance
   		  >0 if this.balance is greater than other.balance
   */
	public int compareTo(Bank other){
	    if (this.equals(other)){
	        return 0;
        }
	    else if(this.balance<other.balance){
	        return -1;
        }
	    else {
	        return 1;
        }
    }

    public String toString(){
	    return "\nName: "+name+" \nAvailable Balance: $"+balance;
    }
}
