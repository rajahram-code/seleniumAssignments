package javaPractice;

import java.util.Scanner;

public class SymmetricPattern {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n;
		System.out.println("Enter Number: ");
		n=input.nextInt();
		for(int i=1;i<=2*n-1;i++) {

			int star=i;

			if(i>n) { star=2*n-i; }


			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
