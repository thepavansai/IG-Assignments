package Bank;

public class Account {
	Integer id;
	String name;
	Double balance;
	
	public Account() {
		// TODO Auto-generated constructor stub	
	}
	public Account(Integer id,String name,Double balance) {
		this.name=name;
		this.id=id;
		this.balance=balance;
	}
	
	public String toString() {
		return "Name :"+name+"\t"+"Account Id :"+id+"\t"+"Available Balance :"+balance+"\n";
		
	}

}
