package object_oriented_programming;

public class Example4 {

	//encapsulation implementation
	//bank account example
	private static int accountNumber=0;
	private static int balance=0;
	
	Example4(int a,int b){
		accountNumber=a;
		balance=b;
	}
	
	//account number return 
	int get() {
		return accountNumber;
	}
	
	//check balance function 
	int getBalance() {
		return balance;
	}
	
	//deposit function
	void deposit(int amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println("Deposit Success!");
		}
	}
	
	//withdraw function
	void withdraw(int amount) {
		if(amount>0 && amount<=balance) {
			balance-=amount;
			System.out.println("withdraw Success!");
		}
	}
}
