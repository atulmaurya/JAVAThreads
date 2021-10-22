
public  class Account {
	private int balance;
	Account(int a){
		this.balance = a;
	}
	protected void widthraw(int amount) {
		
		if(this.isBalanceSufficient(amount)) {
			int previousBal=this.balance;
			this.balance = this.balance-amount;
			System.out.println(this.toString(previousBal,amount,this.balance));// printing withdrawl details
		}
		else {
			System.out.println("Insufficient Balance");
		}
	}
	// this method can't be override and accessed outside this class
	private boolean isBalanceSufficient(int amount) {
		int bal = this.balance;
		if((bal-amount)>=0) {
			return true;
		}
		else {
			return false;
		}
	}
	public final String toString(int previousBal , int amount, int balance) {
		String statement = "Previous bal. :"+String.valueOf(previousBal)+"\nDebited amt. :"+String.valueOf(amount)+"\nCurrent bal. :"+String.valueOf(balance);
		return statement;
	}

}
