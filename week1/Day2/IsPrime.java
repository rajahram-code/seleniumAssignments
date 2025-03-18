package week1.Day2;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {

		boolean isPrime = true;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number to check: ");
		int n = input.nextInt();

		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				isPrime=false;
				break;
			}
		}

		if(isPrime==true) 
			System.out.println(n+" is a Prime Number");

		else System.out.println(n+" is not a Prime Number");
	}

}
