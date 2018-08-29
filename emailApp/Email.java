package emailApp;

import java.util.Scanner;

public class Email {

	public Email() {
		// TODO Auto-generated constructor stub
	}
	private String firstName;
	private String lastName;
	private String password;
	private int defaultPasswordLength=10;
	private String department;
	private int mailBoxCapacity=500;
	private String alternateEmail;
	private String email;
	private String companySuffix="aeycompany.com";
	
	//constructor to receive the first and the last name
	
	public Email(String firstName, String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
		
		
		// call a method asking for the department and return the department
		
		this.department=setDepartment();
		
		
		//call a method that returns a password
		
		this.password=randomPassword(defaultPasswordLength);
		System.out.println("Your password is" +this.password);
		
		//combine elements to generate Email
		email=firstName.toLowerCase()+ "." + lastName.toLowerCase()+ "@"+ this.department+"."+companySuffix;
		
		
	}
	
	//Ask for the department
	
	private String setDepartment(){
		System.out.print("New Worker:" +firstName+ ". Department Codes: \n1 for Sales \n2 for Development \n3 for Accounting \n0 for None \nEnter Department Code");
		Scanner in=new Scanner(System.in);
		int deptChoice=in.nextInt();
		if(deptChoice==1) { return "Sales"; }
		else if(deptChoice==2){ return "dev"; }
		else if (deptChoice==3){ return "acct";   }
		else{return ""; }
		
		
	}
	
	//Generate a random password
	
	private String randomPassword(int length){
		String passwordSet= "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password=new char[length];
		for(int i=0;i<length;i++){
			int rand=(int) (Math.random()* passwordSet.length());
			password[i]=passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	//set the mailbox capacity
	
	public void setMailBoxCapacity(int capacity){
		this.mailBoxCapacity=capacity;
	}
	
	//set the alternate email
	
	public void setAlternateEmail(String altEmail){
		this.alternateEmail=altEmail;
	}

	//change the password
	
	public void changePassword(String password){
		this.password=password;
	}
	
	public int getMailBoxCapactiy (){ return mailBoxCapacity; }
	public String getAlternateEmail() { return alternateEmail; }
	public String getPassword() { return password; }
	
	public String showInfo(){
		return "DISPLAY NAME "+firstName+" "+lastName+
			    "\nCOMPANY EMAIL: "+ email + 
				"\nMAILBOX CAPACITY: "+ mailBoxCapacity + "mb";
	}
	
	
}

