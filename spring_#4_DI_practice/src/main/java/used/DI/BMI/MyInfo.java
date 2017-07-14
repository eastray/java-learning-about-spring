package used.DI.BMI;

import java.util.ArrayList;

public class MyInfo {

	private String name;
	private double height;
	private double weight;
	private ArrayList<String> hobby;
	private BMICalculator bmiCalculator;

	public MyInfo(String name, double height, double weight, ArrayList<String> hobby, BMICalculator bmiCalculator) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.hobby = hobby;
		this.bmiCalculator = bmiCalculator;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public ArrayList<String> getHobby() {
		return hobby;
	}

	public void setHobby(ArrayList<String> hobby) {
		this.hobby = hobby;
	}

	public BMICalculator getBmiCalculator() {
		return bmiCalculator;
	}

	public void setBmiCalculator(BMICalculator bmiCalculator) {
		this.bmiCalculator = bmiCalculator;
	}

	public void bmiCalculation() {
		bmiCalculator.bmicalculation(weight, height);
	}

	public void getInfo() {
		System.out.println("이름: " + name);
		System.out.println("키: " + height);
		System.out.println("몸무게: " + weight);
		System.out.println("취미: " + hobby);
		bmiCalculation();

	}

}
