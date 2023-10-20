package com.second;
//Difference Between Sum of Squares and Square of Sums of N Natural Numbers
import java.util.Scanner;
class SumOfNaturalNumberss {
	public void calculateDifference(double n) {
		double sum = 0;
		double sum1 = 0;
		for(int i=1;i<=n;i++) {
			sum+=Math.pow(i, 2);
		}
		System.out.println("The Sum of Squares of N Natural is: "+sum);
		for(int j=1;j<=n;j++) {
			sum1=sum1+j;
		}
		double sum2 = Math.pow(sum1, 2);
		System.out.println("The Square of Sum of N Natural Numbers is: "+sum2);
		double finalDifferenceValue = sum - sum2;
		System.out.println("Final Difference Between both values is: "+finalDifferenceValue);
	}
}
public class SumDifference {
	public static void main(String[] args) {
		SumOfNaturalNumberss sNN = new SumOfNaturalNumberss();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N natural number");
		double n = sc.nextInt();
		System.out.println(n);
		sNN.calculateDifference(n);	
	}
}
