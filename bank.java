
public abstract class bank implements Runnable{

	public static void main(String[] args) {
	Thread t1,t2;
	Customer c1,c2;
	Account a1 = new Account(1000);
	c1 = new Customer(a1,"Raj");
	c2 = new Customer(a1,"Simran");
	t1 = new Thread(c1);
	t2 = new Thread(c2);
	t1.start();
	t2.start();

	}
	

}
