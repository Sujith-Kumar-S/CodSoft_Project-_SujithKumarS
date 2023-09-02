package practice;
import java.util.Scanner;

public class AtmMachine {
public static void main(String[] args) {
		
		BankAccount myBankAccount = new BankAccount(100000);
		AtmMachine myAtm = new AtmMachine(myBankAccount);
		myAtm.displayMenu();
	}
	
private BankAccount bankAccount;
	public AtmMachine(BankAccount bankAccount) {
	this.bankAccount = bankAccount;
	}
	
public void displayMenu(){
	
	Scanner scan = new Scanner(System.in);
	int option;
	System.out.println("Welcome to the ATM!");
	do {
	System.out.println("ATM Menu:\n1.Withdraw\n2.Deposit\n3.Check balance\n4.Exit");
	System.out.println("Enter your option");
	option = scan.nextInt();
	switch(option) {
	case 1:
		System.out.println("Enter the amount to withdraw");
		double withdrawAmount = scan.nextDouble();
		withdraw(withdrawAmount);
		break;
	case 2:
		System.out.println("Enter the amount to deposit");
		double depositAmount = scan.nextDouble();
		deposit(depositAmount);
		break;
	case 3:
		balance();
		break;
	case 4:
		System.out.println("Thank you for using the ATM.");
		break;
	}
	}while(option != 4);
	
	scan.close();
}

public void withdraw(double amount){
	if(bankAccount.withdraw(amount))
	System.out.println("Succesfully withdrew Rs." +amount);
	else
	System.out.println("Invalid Input or Insufficient Balance");
}
public void deposit(double amount){
	if(bankAccount.deposit(amount))
	System.out.println("Succesfully deposited Rs." +amount);
	else
	System.out.println("Invalid Input");
}
public void balance(){
	System.out.println("Your Account balance is Rs." +bankAccount.getBalance());
}
}
