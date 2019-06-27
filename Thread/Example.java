import java.util.Scanner;

class Account{
	private int bal;

	public Account(int b){
		this.bal = b;
	}

	public boolean isSufficientBalance(int w){
		if(bal > w){
			return true;
		}else{
			return false;
		}
	}

	public void withdraw(int amt){
		bal = bal - amt;
		System.out.println("withdrawl  money: " + amt);
		System.out.println("current balance: " + bal);
	}
}

class Customer implements Runnable {
	private Account acnt;
	private String name;
	public Customer(Account a, String n){
		this.acnt = a;
		this.name = n;
	}

	public void run(){
		Scanner kb = new Scanner(System.in);
		synchronized(acnt){
			System.out.println(name+ ", Enter amount to withdaw");
			int amt = kb.nextInt();
			if(acnt.isSufficientBalance(amt)){
				System.out.println(name+ ", withdr .. complete");
				acnt.withdraw(amt);
			}else{
				System.out.println(name+ ", Insufficient balance");
			}
		}
	}
}

public class Example{
	public static void main(String []args){
		Account a1 = new Account(1000);
		Customer c1 = new Customer(a1, "Raj"), c2 = new Customer(a1, "Simran");
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		t1.start();
		t2.start();
	}
}