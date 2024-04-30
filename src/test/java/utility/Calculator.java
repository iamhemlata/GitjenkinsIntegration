package utility;

import org.testng.annotations.Test;

public class Calculator {
	
	@Test
	
	public void performCalculations()
	{
		System.out.println("Welcome to the Calculator App!");
		int num1=5;
		int num2=10;
		String operation ="+";
		int result=0;
		
		switch (operation) {
		case "+":
			System.out.println("Additin is being performe");
			result=num1+num2;
			break;
			
		case "-":
			System.out.println("Subtraction Additin is being performe");
			result=num1-num2;
			break;
			
		case "*":
			System.out.println("Multiplication Additin is being performe");
			result=num1*num2;
			break;
			
		case "/":
			System.out.println("divide Additin is being performe");
			result=num1/num2;
			break;
			default:
				
				System.out.println("Invalid operation. Please try again.");
		}
		System.out.println("Result: "+result);
		}
	}


