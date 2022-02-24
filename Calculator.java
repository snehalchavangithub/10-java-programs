package program;

import java.util.Scanner;


public class Calculator {

	public static void main(String[] args) {
		double num1;
		double num2;
		double result;
		char op;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter two no: ");
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		System.out.println("\nEnter an operator (+, -, *, /): ");
		
		op = sc.next().charAt(0);
		
		
	    switch(op) {
	    case '+' :
	    	result = num1 + num2;
	    	break;
	    case '-' :
	    	result = num1 - num2;
	    	
	    	break;
	    case '*' :
	    	result = num1 * num2;
	    
	    	break;
	    case '/' :
	    	result = num1 / num2;
	   
	    	break;
	    	default:
	    		System.out.println("Error");
	    		return;
	    	
	    }
	    System.out.println("\nThe result is: \n ");
	    System.out.println(num1 + " " + op + " " +num2 + "=" + result);
	    
		

	}

}
