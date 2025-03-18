package javaPractice;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		int n;
		System.out.println("Enter Number: ");
		n=input.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<5-i-1;j++) {
				System.out.print(" ");
			}
			
			for(int j=0;j<2*i+1;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
