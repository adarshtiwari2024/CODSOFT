import java.util.*;
public class atm {
    



	String name;
	String userName;
	String password;
	String accountNo;
	float balance = 10000f;
	int transactions = 0;
	String transactionHistory = "";

	public void register() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter your Name: ");
		this.name = sc.nextLine();
		System.out.println("\nEnter your Username: ");
		this.userName = sc.nextLine();
		System.out.println("\nEnter your Password: ");
		this.password = sc.nextLine();
		System.out.println("\nEnter your Account Number: ");
		this.accountNo = sc.nextLine();
		System.out.println("\nRegistration Successful. Please Log in to your Bank Account");
	}
	public boolean login() {
		boolean isLogin = false;
		Scanner sc=new Scanner(System.in);
		while( !isLogin) {
			System.out.println("\nEnter your username: ");
			String Username = sc.nextLine();
			if (Username.equals(userName)) {
				while(!isLogin) {
					System.out.println("\nEnter your password: ");
					String Password = sc.nextLine();
					if(Password.equals(password)) {
						System.out.println("\nLogin Successful");
						isLogin = true;
					}
					else {
						System.out.println("\nIncorrect Password");
					}
				}
			}else {
				System.out.println("\nUsername not found");
			}
		}
		return isLogin;
	}

	public void withdraw() {
		System.out.println("\nEnter Amount to Withdraw: ");
		Scanner sc=new Scanner(System.in); 
		float amount = sc.nextFloat();
		try {
			if(balance >= amount) {
				transactions++;
				balance -= amount;
				System.out.println("\nWithdral Successful.");
				String str = amount + "Rs Withdrawn\n";
				transactionHistory = transactionHistory.concat(str);
			}else {
				System.out.println("\nInsufficient Balance.");
			}
		}catch(Exception e) {

		}
    }
}
