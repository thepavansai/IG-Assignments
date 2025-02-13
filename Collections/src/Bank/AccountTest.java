package Bank;

public class AccountTest {

	public AccountTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a= new Account(69,"Phantom",9000.0);
		AccountService services= new AccountService();
		services.addAccount(a);
		services.findAccount(6);
		services.addAccount(new Account(89,"Dracula",690.69));
		services.listAccounts();
		services.modifyAccount();
		services.addAccount(new Account(1345,"Batman",700.99));
		//services.modifyAccount();
		services.listAccounts();
		services.modifyAccount();
		services.listAccounts();
		services.modifyAccount();
		services.listAccounts();

	}

}
