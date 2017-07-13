package used.DI.calculator;

public class Calculator {

	public void add(int firstNum, int secondNum) {
		System.out.println("add()");
		System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
	}

	public void sub(int firstNum, int secondNum) {
		System.out.println("sub()");
		System.out.println(firstNum + " - " + secondNum + " = " + (firstNum - secondNum));
	}

	public void mult(int firstNum, int secondNum) {
		System.out.println("mult()");
		System.out.println(firstNum + " * " + secondNum + " = " + (firstNum * secondNum));
	}

	public void div(int firstNum, int secondNum) {
		System.out.println("div()");
		System.out.println(firstNum + " / " + secondNum + " = " + (firstNum / secondNum));
	}

}
