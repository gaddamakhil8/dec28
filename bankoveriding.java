package dec28;
class RBIbank{
	int balance;
	void deposit(int amt) {
		this.balance=this.balance+amt;
		System.out.println("from RBI successfully deposited----amount---"+amt);}
	void withdraw(int amt) {
		this.balance=this.balance-amt;
		System.out.println("from RBI successfully withdraw----amount---"+amt);}
	void checkbalance() {
		System.out.println("from RBI avl balance----->"+this.balance);
	}
}
class SBIbank extends RBIbank{
	public SBIbank(int balance) {
		this.balance=balance;
		
	}
	void deposit(int amt) {
		if(amt<50000) {
			this.balance=this.balance+amt;
			System.out.println("from sbi successfully deposited---amount----"+amt);}
		else {
			System.out.println("day limit has exceed");
		}
		}
	void withdraw(int amt) {
		if(amt<50000) {
			this.balance=this.balance-amt;
			System.out.println("from sbi successfully withdraw---amount----"+amt);}
		else {
			System.out.println("day limit has exceed");
		}
		}
	
}
class ICICIbank extends RBIbank{
	public ICICIbank(int balance) {
		this.balance=balance;
		
	}
	void deposit(int amt) {
		if(amt<200000) {
			this.balance=this.balance+amt;
			System.out.println("from icici successfully deposited---amount----"+amt);}
		else {
			System.out.println("day limit has exceed");
		}
		}
	void withdraw(int amt) {
		if(amt<200000) {
			this.balance=this.balance-amt;
			System.out.println("from icici successfully withdraw---amount----"+amt);}
		else {
			System.out.println("day limit has exceed");
		}
		
		}
		}
	
class HDFCbank extends RBIbank{
	public HDFCbank(int balance) {
		this.balance=balance;
		
	}
	void deposit(int amt) {
		if(amt<300000) {
			this.balance=this.balance+amt;
			System.out.println("from hdfc successfully deposited---amount----"+amt);}
		else {
			System.out.println("day limit has exceed");
		}
		}
	void withdraw(int amt) {
		if(amt<300000) {
			this.balance=this.balance-amt;
			System.out.println("from hdfc successfully withdraw---amount----"+amt);}
		else {
			System.out.println("day limit has exceed");
		}
		}
	
}


public class bankoveriding {

	public static void main(String[] args) {
		SBIbank sbi=new SBIbank(10000);
		ICICIbank icici=new ICICIbank(50000);
		HDFCbank hdfc=new HDFCbank(30000);
		System.out.println("sbi start");
		sbi.deposit(2000);
		sbi.checkbalance();
		sbi.withdraw(200000);
		sbi.checkbalance();
		System.out.println("sbi end");
		System.out.println("icici start");

		icici.deposit(20000);
		icici.checkbalance();
		icici.withdraw(200000);
		icici.checkbalance();
		System.out.println("icici end");
		System.out.println("hdfc start");


		hdfc.deposit(20000);
		hdfc.checkbalance();
		hdfc.withdraw(150000);
		hdfc.checkbalance();
		System.out.println("hdfc end");



	}

}
