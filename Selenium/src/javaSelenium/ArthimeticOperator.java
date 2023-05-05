package javaSelenium;

import java.util.Scanner;

public class ArthimeticOperator {
	Scanner s = new Scanner(System.in);
	double a = s.nextDouble();
	double b = s.nextDouble();
	double c;

	public static void main(String[] args) {
		System.out.println("enter two numbers");
		ArthimeticOperator obj = new ArthimeticOperator();
		obj.mul();
		obj.div();
		obj.add();
		obj.sub();
		obj.mod();
				

	}
	public void mul() {
		c= a*b;
		System.out.println("result of multiplication = "+c);
	}
	
	public void div() {
		c= a/b;
		System.out.println("result of division = "+c);
	}
	
	public void add() {
		c=a+b;
		System.out.println("result of addition = "+c);
	}
	
	public void sub() {
		c= a-b;
		System.out.println("result of subtraction = "+c);
	}
	
	public void mod() {
		c= a%b;
		System.out.println("result of modulus = "+c);
	}
	

}
