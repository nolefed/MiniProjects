package bankAccount;

public abstract class Account implements IBaseRate{

	// List common properties for savings and chequing accounts
	
	private String name;
	private String sSn;
	private double balance;
	
	private static int index=10000;
	protected String accountNumber;   // available to child class but hidden from the outside world(classes/packages so protected)
	protected double rate;     // available to child class but hidden from the outside world(classes/packages so protected)
	
	//Constructor to set base properties and initialise the account
	
	public Account(String name, String sSn, double initDeposit ){
		this.name=name;
		this.sSn=sSn;
		balance=initDeposit;
		
		
		// set account number
		index++;
		this.accountNumber=setAccountNumber();
		
		setRate();
	}
	
	
	public abstract void setRate();
	
	private String setAccountNumber(){
		String lastTwoOfSsn=sSn.substring(sSn.length()-2,sSn.length());
		int uniqueId=index;	
		int randomNumber=(int)(Math.random()*Math.pow(10, 3));
		return lastTwoOfSsn+uniqueId+randomNumber;
	}
	
	public void compound(){
		double accruedInterest=balance*(rate/100);
		balance=balance+accruedInterest;
		System.out.println("Accrued Interest: $" +accruedInterest);
		printBalance();
	}
	
	//List common methods - transactions
	
	public void deposit(double amount){
		balance=balance+amount;
		System.out.println("Depositing $" + amount);
		printBalance();
	}
	
	public void withdraw(double amount){
		balance=balance-amount;
		System.out.println("Withdrawing $" + amount);
		printBalance();
	}
	
	public void transfer(String toWhere, double amount){
		balance=balance-amount;
		System.out.println("Transferring $" +amount+ "to"+ toWhere);
		printBalance();
	}
	
	public void printBalance(){
		System.out.println("Your Balance is now: $" + balance);
	}
	
	public void showInfo(){
		System.out.println(
				"NAME: "+name +
				"\nACCOUNT NUMBER: " + accountNumber +
				"\nBALANCE: "+ balance +
				"\nRATE: "+rate + "%"
				);
	}
	
	
	
	
	

}
