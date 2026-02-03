package day3Package;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		// Get user details to calculate BMI
		System.out.println("Enter weight in pounds (lb) : ");
		Scanner scan = new Scanner(System.in);
		float weight = scan.nextFloat();
		System.out.println("Enter height in inches (in) : ");
		float height = scan.nextFloat();
		scan.close();
		float bmi = 0.0f;
		// Check for height != 0 because division by 0 is not allowed
		if (height == 0)
			System.out.println("Height cannot be 0");
		else {

			bmi = (weight / (height * height)) * 703; // calculate BMI using formula
			String result = "0.0";
			result = String.format("%.1f", bmi); // Limit resulting decimal values to 2
			System.out.print("Your BMI : " + result + "\nBMI Category : "); // Display user's BMI and BMI category
			if (bmi < 18.5)
				System.out.print("Underweight");
			else if (bmi >= 18.5 && bmi < 25)
				System.out.print("Healthy weight");
			else if (bmi >= 25 && bmi < 30)
				System.out.print("Overweight");
			else if (bmi > 30)
				System.out.print("Obesity");
		}
	}

}
