package javaPractice;

import java.util.Scanner;

public class SumOfDigitsFor {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Eneter Number to Sum: ");
		int n=input.nextInt();
		int rem;
		int sum=0;
		int rev=0;
		for(int i=0;i<n;) {
			rem = n%10;
			sum=sum+rem;
			rev = (rev*10)+rem;
			n=n/10;

		}
		System.out.println("Sum of the digits: "+sum);

		System.out.println("Reversed Number: "+rev);
	}

}
