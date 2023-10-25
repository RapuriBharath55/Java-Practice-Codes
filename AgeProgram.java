package com.cg;
//Age checking with help of Exception Handling
import java.util.Scanner;
public class AgeProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, Enter the age of person");
		int age = sc.nextInt();
		if(age < 12) {
			System.out.println("Your age is - "+age+" Years and you are Kid.");	
		}
		if(age > 12) {
			System.out.println("Your age is - "+age+" Years and you are adult.");
		}try {
			if(age==12) {
				System.out.println("You have entered "+age+" Years.Please, Enter above or below "+age+" Years.");
			}//if close
		}//try block close
		catch(Exception ex) {
				ex.getMessage();
			}//catch block close
		sc.close();
		}//main close
}//class close
