package com.labcodes;
//Program to Print the sum of Cubes of given Digits using sumOfCubesOfDigits Method
import java.util.Scanner;
public class SumOfCubesOfDigits {
	public static double sumOfCubesOfDigits(int userIntputValues) {
		return Math.pow(userIntputValues, 3);
	}
	public static void main(String[] args) {
		Scanner inputValue = new Scanner(System.in);
		System.out.println("Please enter the length of digits: ");
		int length = inputValue.nextInt();
		int userIntputValues = 0;
		int SumValue=0;
		System.out.println("Please, Enter digits to Add them: ");
		for(double i = 1;i<=length;i++) {
			userIntputValues = inputValue.nextInt();
			 SumValue+=sumOfCubesOfDigits(userIntputValues);
		}
		System.out.print("The sum of cubes of given digits is: "+SumValue);
		inputValue.close();
	}
}
