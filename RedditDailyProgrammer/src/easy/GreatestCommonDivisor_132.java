/**
*	Author: Jason
*	Date : Nov 17, 2013
*	Description : 
*	Solution for Reddit Daily Programmer #132 - Greatest Common Divisor
*	http://www.reddit.com/r/dailyprogrammer/comments/1hvh6u/070813_challenge_132_easy_greatest_common_divisor/
*
*	Can be executed via command line with argument input, or via Eclipse/Netbeans project
*/

package easy;

import java.util.Scanner;

public class GreatestCommonDivisor_132 {

	public static void main(String[] args) {
		
		if (args.length == 0) 
			getConsoleInput();
		
		else 
			parseArgsInput(args);
	}
	
	//project is executed via command line, need to parse the arguments.
	private static void parseArgsInput(String[] args) {
		try {
			
			System.out.println("GCD is: " + gcd(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
			
		} catch (NumberFormatException e) {
			System.out.println("Program needs two integers to run.  Try again");
			System.exit(1);
		}
	}
	
	//project is executed as an IDE Java application, prompt user for input
	private static void getConsoleInput() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Jason's GCD program.\n\nEnter two numbers\n");
		String inputValues = input.nextLine();
		String[] values = inputValues.split(" ");
		input.close();
		
		if (values.length > 2) 
			System.out.println("You entered more than two values, but only using the first two.");
		
		try {
			
			System.out.println("GCD is: " + gcd(Integer.parseInt(values[0]), Integer.parseInt(values[1])));
			
		} catch (NumberFormatException e) {
			System.out.println("[" + values[0] + ", " + values[1] + "] are not valid integer inputs.  Try again");
			System.exit(1);
		}
		
	}
	
	//Condensed recursion version of Euclid's Algorithm for greatest common divisor.
	private static int gcd(int x, int y) {
		return (y == 0) ? x : gcd(y, x % y);
	}

}

