package Assignment;

class BankAccount
{
	private String AccHolderName;
	private int Balance;
	
	 public String getAccHolderName()
	 {
		return AccHolderName;
	 }
	 public void setAccHolderName(String AccHolderName)
	 {
		 this.AccHolderName=AccHolderName;
	 }
	 
	 
	 public int getBalance()
	 {
		return Balance;
	 }
	 public void setBalance(int Balance)
	 {
		this.Balance=Balance;
	 }
	 
	 public void Deposit(double amount)
	 {
		 if(amount>100)
		 {
			 Balance+=amount;
			 System.out.println("Deposited amount: "+amount);
		 }
		 else {
			 System.out.println("Deposit amount should be more than 100");
		 }
	 }
	 public void Withdraw(double amount)
	 {
		 if(amount>100 && amount<=Balance)
		 {
			 Balance-=amount;
			 System.out.println("Withdrawn amount: "+amount);
		 }
		 else {
			 System.out.println("Withdraw amount should be more than 100 and Less than "+Balance);
		 }
	 }
	 
}


public class EncapDemo 
{
	public static void main(String[] args) 
	{
		BankAccount ba=new BankAccount();
		ba.setAccHolderName("Big Boss");
		ba.setBalance(500000);
		System.out.println("Account Holder Name: "+ba.getAccHolderName());
		System.out.println("Initial Available Balance: "+ba.getBalance());
		
		ba.setAccHolderName("Monu Sahu");
		ba.Deposit(5000);
		ba.Withdraw(10000);
		
		System.out.println("Updated Account Holder Name: "+ba.getAccHolderName());
		System.out.println("Current Balance: "+ba.getBalance());
		
	}

}
