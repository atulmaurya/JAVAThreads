import java.util.Scanner;
public class Customer implements Runnable{
	private Account account;
	protected String name;
	Customer(Account acc, String name){
		this.account = acc;
		this.name = name;
	}
	public void run() {
		Scanner sc =new Scanner(System.in);
		
		// SOlving the concurrency problem 
		synchronized(account) {
			System.out.println(this.name+", enter the amount to withdraw: ");
			int amt = sc.nextInt();
			account.widthraw(amt);
		}
		
	}
	
}
