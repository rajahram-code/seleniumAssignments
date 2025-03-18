package javaPractice;

import java.util.Scanner;

public class SumOfDigitsForWhile {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n;
		int rem;
		int sum = 0;
		int rev=0;
		n=input.nextInt();
		System.out.println("Enter number: ");
		while(n>0) {
			rem=n%10;
			rev = (rev*10)+rem;
			sum=sum+rem;
			n=n/10;
		}
		
		System.out.println("Sum of the digits: "+sum);
		
		System.out.println("Reversed Number: "+rev);
	}

}
