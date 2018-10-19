//10.18.18
import java.util.Scanner;

public class areaCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the area calculator. " +
				" Type 1 to calculate the area of a rectangle, " +
				" Type 2 to calculate the area of a triangle, " +
				" Type 3 to calculate the area of a circle. ");
	
	int areaType = input.nextInt();
		switch(areaType) {
		case 1:
			System.out.println("You chose rectangle. Please type the lengths of the two separate sides.");
			break;
		case 2:
			System.out.println("You chose triangle. Please type the length of the base and the height");
			break;
		case 3:
			System.out.println("You chose circle. Please type the radius");
			break;
		default:
			System.out.println("Invalid answer. Please try again");
			//run loop again
		}
	
	
	
	input.close();
	}
	// write methods for each calculation type
	
}

