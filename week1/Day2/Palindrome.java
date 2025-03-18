package week1.Day2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n;
		int rem;
		int rev = 0;
		System.out.println("Enter number to reverse: ");
		n=input.nextInt();
		int originalNum=n;
		while(n>0) {
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		
		System.out.println(rev);
		
		if(originalNum==rev) {
			System.out.println("Number is Palindrome");
		}
		
		else System.out.println("Number is not a Palindrome");
	}

}
