package bmicalculator;
import java.util.*;

public class Calculator_BMI {
	
	double height;
	double weight;
	double BMI;
	
	public Calculator_BMI(){
		greeting();
		scan();
	}
	
	private void greeting() {
		System.out.println("Welcome! this is a BMI calulator.");
		System.out.println("Please enter your height in inches: ");
	}
	
	private void scan() {
		Scanner input = new Scanner(System.in);
		height = input.nextDouble();
		System.out.println("Please enter your weight in pounds: ");
		weight = input.nextDouble();
		input.close();
	}
	
	public double calculateBMI() {
		BMI = ((703*weight)/(height*height));
		return BMI;
	}
	
	public String BMI() {
		calculateBMI();
		String s;
		s = "Your BMI is: " + BMI;
		if (BMI < 18.5) {
			s += "\nyou are underweight.";
		} else if(BMI >= 18.5 && BMI <= 24.9) {
			s+= "\nyou are within a healthy weight range.";
		} else if(BMI >= 25 && BMI <= 29.9) {
			s += "\nyou are overweight.";
		}
		return s;
	}
	
	

	public static void main(String[] args) {
		
//		//getting the user input
//		System.out.println("Welcome! this is a BMI calulator.");
//		System.out.println("Please enter your height in inches: ");
//		Scanner input = new Scanner(System.in);
//		double height = input.nextDouble();
//		System.out.println("Please enter your weight in pounds: ");
//		double weight = input.nextDouble();
//		
//		//calculating the BMI
//		double BMI = ((703*weight)/(height*height));
//		System.out.println("Your BMI is: " + BMI);
//		if (BMI < 18.5) {
//			System.out.println("you are underweight.");
//		} else if(BMI >= 18.5 && BMI <= 24.9) {
//			System.out.println("you are within a healthy weight range.");
//		} else if(BMI >= 25 && BMI <= 29.9) {
//			System.out.println("you are overweight.");
//		}
//		input.close();
		
		Calculator_BMI bmieo = new Calculator_BMI();
		System.out.println(bmieo.BMI());
		System.out.println(bmieo.calculateBMI());
	}

}
