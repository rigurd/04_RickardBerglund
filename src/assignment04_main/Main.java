package assignment04_main;

import assignment04_subclasses.BankCustomer;
import assignment04_subclasses.PersonalAccount;
import assignment04_subclasses.SavingAccount;
import assignment04_superclasses.BankAccount;

/**
 * @author Rickard Berglund
 * @version 1.0
 * @since 2016-10-04
 */

public class Main {

	/**
	 * @param args
	 * Main method that calls for all the classes and methods
	 * and inserts values using a simple bank system
	 */
	
	public static void main(String[] args) {
		
		String account = "";
		
		// Creating a BankCustomer
		BankCustomer bc = new BankCustomer("Rickard", 24);
		// Instantiating new BankAccounts
		bc.addAccount(new BankAccount());
		bc.addAccount(new PersonalAccount());
		bc.addAccount(new SavingAccount());
		// Printing current Accounts
		System.out.println(bc.toString());
		
		// Assigning values to String account
		account = bc.getCustomerAccounts().get(0).getAccountNumber();
		// Printing the next action
		System.out.println("\nDepositing 30.0 to first account");
		// Performing said print action
		bc.depositToAccount(account, 30.0);
		// Printing the current values stored in bc
		System.out.println(bc.toString());
		
		System.out.println("\nWithdraw 50.0 from the secound account");
		account = bc.getCustomerAccounts().get(1).getAccountNumber();
		bc.withdrawFromAccount(account, 50.0);
		System.out.println(bc.toString());
		
		System.out.println("\nDepositing 200.0 to the third account");
		account = bc.getCustomerAccounts().get(2).getAccountNumber();
		bc.depositToAccount(account, 200.0);
		System.out.println(bc.toString());

	}

}
