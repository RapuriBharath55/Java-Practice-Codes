 package com.second;
//Trendy Number Program
 import java.util.*;
public class TrendyNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to Check if it is Trendy Number or Not");
		int n = sc.nextInt();
		String str = Integer.toString(n);
		if (str.length()==3 && str.charAt(1)%3 ==0){
			System.out.println("The Entered Number is a Trendy number");
		}
		else {
			System.out.println("The Entered Number is Not a Trendy Number");
	}
		sc.close();
	}
}
