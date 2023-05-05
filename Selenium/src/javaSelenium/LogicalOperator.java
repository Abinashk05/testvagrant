package javaSelenium;

public class LogicalOperator {

	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;
		boolean c = !a;
		boolean d = a && b;
		boolean e = a || b;
		boolean f = a ? true : false;

		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("d: " + d);
		System.out.println("e: " + e);
		System.out.println("f: " + f);
	}
}
