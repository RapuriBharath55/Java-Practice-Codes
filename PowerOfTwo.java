package com.second;
import java.util.*;
public class PowerOfTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, Enter the Number to check if it is Power of 2 or Not:");
		double n = sc.nextInt();
		for(int i =0;i<=n;i++) {
			if(n == Math.pow(2, i)) {
				System.out.println("Wow! The given number is power of 2.");
				break;
			}else if(n < Math.pow(2, i)){
				System.out.println("oh oh Sorry!,The Entered number is not power of 2.");
				break;
				}
		}sc.close();
	}

}
