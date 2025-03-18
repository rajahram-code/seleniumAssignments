package javaPractice;

import java.util.Scanner;

public class OddEvenFor {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number to check: ");
		int n=input.nextInt();

		if(n%2==0) {
			System.out.println(n+" is an even number");
		}
		else System.out.println(n+" is an odd number");
	}

}
