package assignment04_subclasses;

import java.util.UUID;

import assignment04_superclasses.BankAccount;

/**
 * @author Rickard Berglund
 * @version 1.0
 * @since 2016-10-04
 */
public class SavingAccount extends BankAccount{

	/**
	 * This method uses randomUUID to set a random number to an accountNumber
	 * for a SavingAccount, also includes a setBalance aswell as a setAccountType
	 * 
	 */
	public SavingAccount(){
		this.setAccountNumber(UUID.randomUUID().toString().substring(0, 6));
		this.setBalance(0.0);
		this.setAccountType("Saving account");
	}
	
}
