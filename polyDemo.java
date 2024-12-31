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





public class polyDemo
{

	public static void main(String[] args) {
		RBIbank bank=null;
		System.out.println("SBI Bank");
		bank=new SBIbank(10000);
		bank.checkbalance();
		bank.deposit(20000);
		bank.withdraw(5000);
		bank.checkbalance();
		//icici
		System.out.println("ICICI Bank");
		bank=new ICICIbank(20000);
		bank.checkbalance();
		bank.deposit(50000);
		bank.withdraw(23000);
		bank.checkbalance();
		//HDFCbank
		System.out.println("HDFC Bank");
		bank=new HDFCbank(49000);bank.checkbalance();
		bank.deposit(40000);
		bank.withdraw(29546);
		bank.checkbalance();
		

	}

}
