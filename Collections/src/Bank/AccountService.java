package Bank;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountService {
	static ArrayList<Account>accounts=new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	public void addAccount(Account account) {
		accounts.add(account);
		System.out.println(account+" is successfully created.\n");
	}
	public void listAccounts() {
		System.out.println("All Accounts Details\n");
		accounts.forEach(x->System.out.println(x));
		System.out.println("End\n");
	}
	public Account findAccount(Integer id) {
		boolean flag=false;
		Account x=null;
		for(Account a: accounts) {
			if(a.id.equals(id)) {
				flag=true;
				x=a;
			}
		}
		if(flag)
			System.out.println(x);
		else
			System.out.println("Account with id "+id+" doesn't exists.\n");
		return x;
	}
	public void modifyAccount() {
		Integer id;
		System.out.println("Enter the Account Id : \n");
		id=sc.nextInt();
		Account a=findAccount(id);
		if(a!=null) {
			System.out.println("Enter 1 for Deposit 2 for Withdrwal 3 for Account deletion.\n");
			int ch;
			ch=sc.nextInt();
			Double amt;
			switch(ch) {
				case 1:
					System.out.println("Enter Amount to be deposited: ");
					amt=sc.nextDouble();
					a.balance+=amt;
					System.out.println(a);
					break;
				case 2:
					System.out.println("Enter Amount to be withdrawn: ");
					amt=sc.nextDouble();
					if(a.balance>amt)
						a.balance-=amt;
					else
						System.out.println("Insufficient Funds");
					System.out.println(a);
					break;
				case 3:
					accounts.remove(a);
					break;
				default:
					System.out.println("Invalid choice.");
					break;
			}
		}
		//sc.close();
	}
	
}
