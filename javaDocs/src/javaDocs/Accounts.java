package javaDocs;

public class Accounts {

	int Deposit=100;
	int balance=10000;
	int withdraw=1000;
	
	
	 public void Deposit() {
		 
		 balance=balance+Deposit;
		 
	 }
    
	 /**
	 * It deposit the amount
	 * balance will be updated
	 * print balance if we want to
	 */
	public void Withdraw() {
		 

		 /**
		 * It withdraw the amount
		 * balance will be updated
		 * print balance if we want to
		 */
		
		 balance=balance-withdraw;
	 }
	
}
