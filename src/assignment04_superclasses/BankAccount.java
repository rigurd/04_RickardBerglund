package assignment04_superclasses;

import java.util.UUID;

import assignment04_interface.BankOperations;

/**
 * @author Rickard Berglund
 * @version 1.0
 * @since 2016-10-04
 */

public class BankAccount implements BankOperations{
	
	// Attributes
	private String accountNumber;
	private String accountType;
	private double balance;
	
	// Getters and Setters
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	/**
	 * Method that takes no parameters, creating an attribute using randomUUID
	 */
	// Methods
	public BankAccount() {
		super();
		this.accountNumber = UUID.randomUUID().toString().substring(0, 6);
		this.accountType = "Bank account";
		this.balance = 0;
	}
	/**
	 * @see assignment04_interface.BankOperations#withdrawMoney(double)
	 * 
	 * This method is for withdrawing money from a bank account
	 * Checking the input using an if statement to make sure its correct
	 */

	public void withdrawMoney(double amount){
		if (amount >=0){
			setBalance(getBalance() - amount);
		}else{
			System.out.println("You can't withdraw a negative amount");
		}
	}

	/** 
	 * @see assignment04_interface.BankOperations#depositMoney(double)
	 * This method is for depositing money to a bank account
	 * Checking the input using an if statement to make sure its correct
	 */
	public void depositMoney(double amount){
		if (amount <=0){
			System.out.println("You can't deposit a negative amount");
		}else{
			setBalance(getBalance() + amount);
		}
	}
	
	/** 
	 * @see java.lang.Object#toString()
	 * 
	 * This method posts everything we wanted showed as a string
	 */
	// toString
	public String toString() {
		return "\naccountNumber: " + accountNumber +", accountType: " + accountType + ", balance: " + balance;
	}
	

}
