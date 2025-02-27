package streamswithcollections;

public class Account {
	String name;
	Integer id;
	Double balance;
	public Account(String name, Integer id, Double balance) {
		super();
		this.name = name;
		this.id = id;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [name=" + name + ", id=" + id + ", balance=" + balance + "]";
	}
	
}
