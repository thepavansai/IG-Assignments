
public class Account {
	Integer id;
	String name;
	Double balance;

	public Account() {
	}

	public Account(Integer id, String name, Double balance) {
		this.name = name;
		this.id = id;
		this.balance = balance;
	}

	public String toString() {
		return "Name :" + name + "\t" + "Account Id :" + id + "\t" + "Available Balance :" + balance + "\n";

	}

}
