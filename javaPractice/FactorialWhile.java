package javaPractice;

import java.util.Scanner;

public class FactorialWhile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		int fact=1;
		System.out.println("Enter Number: ");
		n=input.nextInt();
		int i=1;
		while(i<=n) {
			fact=fact*i;
			i++;
		}
		System.out.println(fact);
	}

}
