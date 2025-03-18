package javaPractice;

import java.util.Scanner;

public class ArmsrongFor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		System.out.println("Enter Number: ");
		n=input.nextInt();
		int counter=n;
		int count=0;
		int rem;
		int arm=0;
		int arm1=n;
		for(int i=0;i<counter;) {
			counter=counter/10;
			count=count+1;
		}
		System.out.println(count);

		for(int i=0;i<n;) {
			rem = n%10;
			arm =  (int) (arm+Math.pow(rem,count));
			n=n/10;

		}

		if(arm==arm1) {
			System.out.println(arm+" is a Armstrong Number");
			}
		else System.out.println(arm+" is not a ArmStrong Number");
	}

}
