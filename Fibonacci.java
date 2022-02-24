package fibonacci.com;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int n, a = 0, b = 1, c;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		n = input.nextInt();
		System.out.println("Fibonqacci series is: ");
		
		for(int i=1; i<=n; i++)
			{
				c = a+b;
				System.out.println(a+" ");
				a=b;
				b=c;
			}
		
		}

}
