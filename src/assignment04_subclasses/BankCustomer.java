package assignment04_subclasses;

import java.util.ArrayList;

import assignment04_superclasses.BankAccount;
import assignment04_superclasses.Human;

/**
 * @author Rickard Berglund
 * @version 1.0
 * @since 2016-10-04
 */
public class BankCustomer extends Human {
	
	// Instantiating an ArrayList called customerAccounts
	private ArrayList<BankAccount> customerAccounts = new ArrayList<BankAccount>();

	/**
	 * @param name
	 * @param age
	 * 
	 * Constructor that takes two parameters
	 */
	// Constructor
	public BankCustomer(String name, int age) {
		super(name, age);
	}	
	
	/**
	 * @param bankaccount
	 * Method that adds parameter to an ArrayList
	 */
	public void addAccount(BankAccount bankaccount){
		// Adding elements to ArrayList customerAccounts
		customerAccounts.add(bankaccount);
	}

	/**
	 * @param accountNumber
	 * @param amount
	 * 
	 * Method that takes two parameters, using a for loop to add one parameter to the other
	 * aswell as an if statement to check their values
	 */
	public void depositToAccount(String accountNumber, double amount){
		for (int i = 0; i < customerAccounts.size(); i++){
			if (customerAccounts.get(i).getAccountNumber().equals(accountNumber)){
				customerAccounts.get(i).depositMoney(amount);
			}
		}
	}
	
	/**
	 * @param accountNumber
	 * @param amount
	 * 
	 * Method that takes two parameters, using a for loop to add one parameter to the other
	 * aswell as an if statement to check their values
	 */
	public void withdrawFromAccount(String accountNumber, double amount){
		for (int i = 0; i < customerAccounts.size(); i++){
			if (customerAccounts.get(i).getAccountNumber().equals(accountNumber)){
				customerAccounts.get(i).withdrawMoney(amount);
			}
		}
	}
	
	/**
	 * @see java.lang.Object#toString()
	 * 
	 * Method that takes no parameter but manipulates the return string
	 */
	@Override
	public String toString() {
		String replace = customerAccounts.toString().replace("[", " ").replace("]", " ");
		return "BankCustomer : "+getName()+" "+getAge()+replace;
	}

	// Getters and Setters
	public ArrayList<BankAccount> getCustomerAccounts() {
		return customerAccounts;
	}

	public void setCustomerAccounts(ArrayList<BankAccount> customerAccounts) {
		this.customerAccounts = customerAccounts;
	}
	
	
	
	
}
