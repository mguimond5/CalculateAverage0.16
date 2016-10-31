/**
 * 
 */

/**
 * @author m.guimond3
 *
 */
import java.util.Scanner;

public class CalculateAverage2 {

	/**

	*

	* Name: Marsha Guimond

	* Teacher: Mr.Hardman

	* Assignment 3, Program 1

	* Date Last Modified: October 26, 2016

	*

	*/
	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		double markone;
		double marktwo;
		double markthree;
		double markfour;
		double markfive;
		double totalAverage;
		
		System.out.println("Enter your current grades below.");

		System.out.print("Grade 1: ");
		markone = userInput.nextDouble();
		
		System.out.print("Grade 2: ");
		marktwo = userInput.nextDouble();
		
		System.out.print("Grade 3: ");
		markthree = userInput.nextDouble();
		
		System.out.print("Grade 4: ");
		markfour = userInput.nextDouble();
		
		System.out.print("Grade 5: ");
		markfive = userInput.nextDouble();

		totalAverage = (markone + marktwo + markthree + markfour + markfive) / 5;
		
		System.out.println("\n" + String.format("Mark one: %11.2f", markone) ); 
		System.out.println( String.format("Mark two: %11.2f", marktwo) );
		System.out.println( String.format("Mark three: %9.2f", markthree) );
		System.out.println( String.format("Mark four: %10.2f", markfour) ); 
		System.out.println( String.format("Mark five: %10.2f", markfive) );
		
		System.out.println( String.format("Average: %12.2f", totalAverage) );
		
		userInput.close();

	}

}
