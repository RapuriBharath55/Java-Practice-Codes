package com.second;
//Calculating the Sum of N natural Numbers Divisible by 3 or 5
import java.util.Scanner;

class CalculateSum {
	public CalculateSum() {
		
	}
	public static void calculateSum(int n) {
		int sum = 0;
		for(int i = 1;i<=n;i++) {
			if(i%3==0 || i%5==0) {
				sum = sum + i;
			}
		}
		System.out.println("The Sum of Natural Numbers for Entered Number Which is Divisible by 3 or 5 is: "+sum);
	}
}
public class SumOfNaturalNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Natural Number to Get its Sum: ");
		int n = sc.nextInt();
		CalculateSum.calculateSum(n);
		sc.close();
		}
}
