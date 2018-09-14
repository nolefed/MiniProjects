package bankAccount;

public class Checking extends Account {

	//List properties specific to a checking account
	private int debitCardNumber;
	private int debitCardPin;
	
	// Constructor to initialize checking account properties
	
	public Checking(String name, String sSn, double initDeposit) {
		super(name, sSn, initDeposit);
		accountNumber="2"+accountNumber;
		setDebitCard();
	}
	
	
	public void setRate(){
		rate= getBaseRate() * 0.15;
	}
	
	
	
	//List any methods specific to the checking account
	
	private void setDebitCard(){
		debitCardNumber=(int)(Math.random()*Math.pow(10, 12));
		debitCardPin=(int)(Math.random()*Math.pow(10, 4));
		
	}
	
	public void showInfo(){
		super.showInfo();
		System.out.println("Your Checking Account Features "+
		"\n Debit Card Number: " +debitCardNumber+
		"\n Debit Card PIN " + debitCardPin
		);
	}
	
	
	

}
