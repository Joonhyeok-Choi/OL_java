package ch5;

public class Account {
	private String owner;
	private long balance;
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public Account(String owner){
		this.owner=owner;
	}
	public Account(long balance){
		this.balance=balance;
	}
	public Account(String owner, long balance){
		this.owner=owner;
		this.balance=balance;
	}
	public long deposit(long amount){
		return balance+=amount;
	}
	public long withdraw(long amount){
		//long bal;
		//bal=balance;
		if((balance-amount)<0){
			System.out.println("잔액 부족");
			return 0;
		}			
		else
			return balance-=amount;
	}
/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a = new Account("Joon", 200000);
		a.balance = a.deposit(2000);
		a.balance = a.withdraw(12000);
		System.out.println(a.balance);
	}*/

}
