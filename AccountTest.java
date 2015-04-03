package ch5;

public class AccountTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a = new Account("Joon", 20000);
		a.deposit(15000);
		System.out.println(a.getBalance());
		a.withdraw(20000);
		System.out.println(a.getBalance());
		a.withdraw(16000);
		
	}

}
