package javaSelenium;

import java.util.Scanner;

public class Waterusage {
	public static void main(String[] args) {
		System.out.println("Enter the usage");
		Scanner scn= new Scanner(System.in);
		int usage = scn.nextInt();
		System.out.println("the usage is "+usage);
		if(usage >0 && usage <=500)
		{
			System.out.println("there are no charges");
		}
		else if(usage >500 && usage <=1000) {
			System.out.println("The changes are "+(usage *4)+ "INR");
		}
		else if(usage >1000) {
			System.out.println("The changes are"+(usage *7)+ "INR");
		}
		else
			System.out.println("Invalid type");
	}
}		   

