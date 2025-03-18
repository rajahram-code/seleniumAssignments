package week1.Day2;

import java.util.Scanner;

public class CheckNumberIsPositive {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("Enter a number to validate: ");
		num = input.nextInt();
		
		if(num>0) {
			System.out.println(num+" Is a positive Number");
		}
		
		else {
			System.out.println(num+" is not a Positive Number");
		}
		
		input.close();
	}

}
