package javaPractice;

import java.util.Scanner;

public class IsPrimeWhile {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter number to check: ");
		int n = input.nextInt();
		int i=2;
		boolean isPrime = true;
		while(i<=n/2) {
			if(n%i==0) {
				isPrime = false;
				break;
			}
			i++;
		}

		if(isPrime==true) {
			System.out.println(n+" is a Prime Number");
		}
		else System.out.println(n+" is not a Prime Number");
	}

}
