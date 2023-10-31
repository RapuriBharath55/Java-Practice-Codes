package com.second;
//Calculation if Number is Power of 2 and returning True if Yes
import java.util.*;
class PowerCalculation {
	public boolean powerCalculation(double n) {
		for(int i =0;i<=n;i++) {
			if(n == Math.pow(2, i)) {
				return true;	
			}
		}
		return false;}
}
public class PowerOfTwoWithMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PowerCalculation pc = new PowerCalculation();
		System.out.println("Please, Enter the Number to check if it is Power of 2 or Not:");
		double n = sc.nextInt();
		pc.powerCalculation(n);
		if(pc.powerCalculation(n)) {
			System.out.println("Yes, The Entered Number is Power of 2");
		}
		else {
			System.out.println("Oh oh Sorry!, The Entered Number is Not Power of 2");
		}
		sc.close();
	}
}
