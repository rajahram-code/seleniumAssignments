package javaPractice;

import java.util.Scanner;

public class ListOfPrimeNumbersFor {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter number to check: ");
		int n = input.nextInt();

		for(int i=2;i<=n;i++) {
			boolean isPrime = true;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
			}

			if(isPrime==true) {
				System.out.println(i+" is a Prime Number");
			}
			//else System.out.println(i+" is not a Prime Number");
		}
	}
}
