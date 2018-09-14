package bankAccount;

public class Savings extends Account {

	// List properties specific to savings account
	
	private int safetyDepositBoxId;
	private int safetyDepositBoxKey;
	// Constructor to initialize the settings for the savings properties
	
	public Savings(String name, String sSn, double initDeposit) {
		super(name, sSn, initDeposit);
		accountNumber="1"+accountNumber;
		setSafetyDepositBox();
	}
	
	public void setRate() {
		rate= getBaseRate() -0.25;
		
	}
	
	private void setSafetyDepositBox(){
		safetyDepositBoxId=(int)(Math.random()*Math.pow(10, 3));
		safetyDepositBoxKey= (int)(Math.random()* Math.pow(10, 4));
		
	}
	
	// List any methods specific to the savings account
	
	public void showInfo(){
		super.showInfo();
		System.out.println(""
				+ "your Savings Accounts Features"+
				"\n Safety Deposit Box ID: "+ safetyDepositBoxId+
				"\n Safety Deposit Box key"+ safetyDepositBoxKey 
				);
	}

	


}
