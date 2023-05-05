package javaSelenium;

public class AssignmentOperator {

	int number;
	int number1;
	int number2;
	int number3;
	int number4;
	int number5;
	int number6;
	int number7;
	int number8;
	int number9;
	int number10;
	String name;

	public static void main(String[] args) {
		AssignmentOperator op = new AssignmentOperator();
		op.simpleassignment();
		op.plusEqualTo();
		op.subEqualTo();
		op.mulEqualTo();
		op.divEqualTo();
		op.modEqualTo();
	}

	public void simpleassignment() {

		number = 10;
		name = "abinash";

		System.out.println(number);
		System.out.println(name);
	}

	public void plusEqualTo() {
		number1 = 10;
		number2 = 20;
		System.out.println("num1 = " + number1);
		System.out.println("num2 = " + number2);
		number1 += number2;
		System.out.println("result of plusequal to " + number1);
	}

	public void subEqualTo() {
		number3 = 20;
		number4 = 10;
		System.out.println("num3 = " + number3);
		System.out.println("num4 = " + number4);
		number3 -= number4;
		System.out.println("result of subequalto " + number3);
	}

	public void mulEqualTo() {
		number5 = 20;
		number6 = 10;
		System.out.println("num5 = " + number5);
		System.out.println("num6 = " + number6);
		number5 *= number6;
		System.out.println("result of mulequalto " + number5);
	}

	public void divEqualTo() {
		number7 = 20;
		number8 = 10;
		System.out.println("num7 = " + number7);
		System.out.println("num8 = " + number8);
		number7 /= number8;
		System.out.println("result of divequalto " + number7);
	}

	public void modEqualTo() {
		number9 = 20;
		number10 = 10;
		System.out.println("num9 = " + number9);
		System.out.println("num10 = " + number10);
		number9 %= number10;
		System.out.println("result of modequalto " + number9);

	}

}
