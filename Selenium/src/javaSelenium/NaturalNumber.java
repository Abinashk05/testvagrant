package javaSelenium;

import java.util.Scanner;

public class NaturalNumber {

	public static void main(String[] args) {

		    Scanner sc = new Scanner(System.in);
		    int num = 0;
		    int sum = 0;

		    System.out.println("Enter a number: ");
		    num = sc.nextInt();

		    for (int i = 1; i <= num; i++) {
		      sum = sum + i;
		    }

		    System.out.println("The sum of all natural numbers up to " + num + " is: " + sum);
		  }
}
		


	


