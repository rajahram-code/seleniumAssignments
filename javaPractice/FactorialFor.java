package javaPractice;

import java.util.Scanner;

public class FactorialFor {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n;
		int fact=1;
		System.out.println("Enter Number: ");
		n=input.nextInt();
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
