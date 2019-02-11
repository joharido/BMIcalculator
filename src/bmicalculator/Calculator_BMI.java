package bmicalculator;
import java.util.*;

public class Calculator_BMI {

	public static void main(String[] args) {
		
		//getting the user input
		System.out.println("Welcome! this is a BMI calulator.");
		System.out.println("Please enter your height in inches: ");
		Scanner input = new Scanner(System.in);
		double height = input.nextDouble();
		System.out.println("Please enter your weight in pounds: ");
		double weight = input.nextDouble();
		
		//calculating the BMI
		double BMI = ((703*weight)/(height*height));
		System.out.println("Your BMI is: " + BMI);
		if (BMI < 18.5) {
			System.out.println("you are underweight.");
		} else if(BMI >= 18.5 && BMI <= 24.9) {
			System.out.println("you are within a healthy weight range.");
		} else if(BMI >= 25 && BMI <= 29.9) {
			System.out.println("you are overweight.");
		}
		input.close();
	}

}
