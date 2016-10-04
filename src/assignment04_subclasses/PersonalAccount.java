package assignment04_subclasses;

import java.util.UUID;

import assignment04_superclasses.BankAccount;

/**
 * @author Rickard Berglund
 * @version 1.0
 * @since 2016-10-04
 */

public class PersonalAccount extends BankAccount{
	
	/**
	 * This method uses randomUUID to set a random number as AccountNumber
	 * for a PersonalAccount, also includes a SetBalance aswell as a setAccountType
	 * 
	 */
	public PersonalAccount(){
		this.setAccountNumber(UUID.randomUUID().toString().substring(0, 6));
		this.setBalance(0.0);
		this.setAccountType("Personal account");
	}

}
