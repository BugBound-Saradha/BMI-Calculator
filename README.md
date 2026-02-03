BMI Calculator (Java)
📌 Overview

This is a simple Java console application that calculates a user’s Body Mass Index (BMI) based on their weight and height.
The program prompts the user for input, computes the BMI using the standard formula for U.S. units, and then displays both the BMI value and its corresponding category.

🧮 BMI Formula Used

The BMI is calculated using the following formula:

BMI = (weight / (height × height)) × 703


Weight is entered in pounds (lb)

Height is entered in inches (in)

🚀 Features

Takes user input via the console

Prevents division by zero by checking for invalid height

Formats BMI to one decimal place

Displays BMI category based on standard ranges:

Underweight

Healthy weight

Overweight

Obesity

📂 Project Structure
day3Package/
 └── BMICalculator.java

▶️ How to Run

Make sure you have Java (JDK) installed.

Compile the program:

javac BMICalculator.java


Run the program:

java BMICalculator


Enter:

Weight in pounds

Height in inches

📊 BMI Categories
BMI Range	Category
< 18.5	Underweight
18.5 – 24.9	Healthy weight
25 – 29.9	Overweight
≥ 30	Obesity
⚠️ Notes

Height cannot be zero (the program checks for this).

This calculator is for educational purposes only and should not replace professional medical advice.

🛠️ Technologies Used

Java

java.util.Scanner for user input
