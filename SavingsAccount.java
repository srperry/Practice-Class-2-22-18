
public class SavingsAccount {
String Username;
int Pin;
double Balance;

public SavingsAccount(String Username2, int Pin2, double Balance2){
Username=Username2;
Pin=Pin2;
Balance=Balance2;
}
public double Withdrawl(double withdrawl){
Balance= Balance - withdrawl;
return Balance;
}
public double Deposit(int Deposit){
	Balance=Deposit+Balance;
	return Balance;
	}
}
