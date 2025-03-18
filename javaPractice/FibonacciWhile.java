package javaPractice;

import java.util.Scanner;

public class FibonacciWhile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Eneter Number to Sum: ");
		int n=input.nextInt();
		int fib1=0;
		int fib2=1;
		int fib3=0;
		int i=0;
		while(n>i) {
			System.out.print(fib1+" ");
			//System.out.println(fib2+" ");
			fib3=fib1+fib2;
			fib1=fib2;
			fib2=fib3;
			i++;
		}
	}
}
