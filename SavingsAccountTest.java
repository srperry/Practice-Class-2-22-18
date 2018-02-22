import java.util.Scanner;
public class SavingsAccountTest {
	public static void main(String[] args) {
		
SavingsAccount sA1=new SavingsAccount("Jay",100134,100);
SavingsAccount sA2=new SavingsAccount("Aileen",100190,1000);
SavingsAccount sA3=new SavingsAccount("John",100153,3213);

Scanner scanner=new Scanner(System.in);

	System.out.println("Please enter your name, pin#, and balance for Current Account.");
		SavingsAccount cA1=new SavingsAccount(scanner.nextLine(),scanner.nextInt(),scanner.nextDouble());
		
	System.out.println("Please enter your name, pin#, and balance for OverDraft Account");
		SavingsAccount oA1=new SavingsAccount(scanner.next(),scanner.nextInt(),scanner.nextDouble());
	System.out.println("Please enter the amount you want to withdraw.");
		System.out.println(sA2.Withdrawl(scanner.nextDouble()));
	}

}
