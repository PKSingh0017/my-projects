import java.util.*;

class Account{
	public String name;
	public int acc;
       	public String acctype;
	public int bal;


	Account ( String n, int a,String b,int c){
		this.name = n;
		this.acc = a;
		this.acctype = b;
		this.bal = c;
		System.out.println("Account Created...");
	}
        
	void deposit(int amt){
		bal += amt;
		System.out.println(amt+" is deposited to the acc number "+acc);
	}

	void disp(){
		System.out.println("Name		:"+name+"\nAccont No.	:"+acc+"\nType		:"+acctype+"\nBalance		:"+bal);

	}
	void withdraw(int amt){
		if(amt <= bal){
			System.out.println("Withdraw Suscessful");
			bal -= amt;
		}
		else
			System.out.println("Balance Insuficient ");
	}
}
class Test{
	public static void main(String...k){
                Account ac = new Account("Priyanshu",51571377,"SB",2327);
              
                ac.deposit(1000);
		ac.withdraw(500);
		ac.disp();
        }

}
