package firstSpringProject.calculation;

public class MainClass {

	public static void main(String[] args) {
		Calculation cal = new Calculation();
		
		cal.setFirstNum(20);
		cal.setSecondNum(10);
		
		cal.add();
		cal.sub();
		cal.div();
		cal.mult();
		System.out.println("Finished Calculate!");

	}

}
