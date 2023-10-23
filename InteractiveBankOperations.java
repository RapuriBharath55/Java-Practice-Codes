package com.second;
//Bank Operations - Balance Display,Amount Deposit and Amount Withdrawal Program using Switch
import java.util.*;
class AccountDetails {
	double accountBalance;
	double depositAmount;
	double withdrawAmount;
	public void displayBalance(double accountBalance) {
		System.out.println("The current Balance in your Account is: "+accountBalance);
	}
	public void depositMoney(double depositAmount) {
		System.out.println(depositAmount+" has been Successfully Deposit into your account");
		this.accountBalance = this.accountBalance + depositAmount;
		System.out.println("Balance After Deposit is: "+accountBalance);
	}
	public void withdrawMoney(double withdrawAmount) {
		System.out.println("You have successfully withdrawn Rupees: "+withdrawAmount);
		this.accountBalance = this.accountBalance - withdrawAmount;
		System.out.println("Balance After Withdrawal of Amount is: "+accountBalance);
	}
}//class close
public class InteractiveBankOperations {

	public static void main(String[] args) {
		AccountDetails ad = new AccountDetails();
		Scanner sc = new Scanner(System.in);
		int option;
		do {
			System.out.println("Please select the option from below Menu\n 1.Balance Enqury \n 2.Deposit Money \n 3.Withdraw Money \n 4.Exit");
			option = sc.nextInt();
			if(option != 4){
		switch(option) {
			case 1: System.out.println("You have opted for Balance Enqury Option, Enter the Current Balance in your Account");
					ad.accountBalance= sc.nextInt();
					ad.displayBalance(ad.accountBalance);
						break;
			case 2: System.out.println("You have opted for Deposit Money Option, Please enter the amount to be Deposited");
					ad.depositAmount=sc.nextInt();
					ad.depositMoney(ad.depositAmount);
						break;
			case 3: System.out.println("You have opted for Withdraw Money Option, Please enter the amount to be Withdrawn");
					ad.withdrawAmount= sc.nextInt();
					ad.withdrawMoney(ad.withdrawAmount);
						break;
			default: System.out.println("Oops! Sorry, Invalid input. Please choose the correct input from the Menu");
						break;
		}//switch close
	}//if close
	}while(option !=4);//do close
		sc.close();
		System.out.println("Successfully Exited from the Menu");
	}//main close
}//class close

