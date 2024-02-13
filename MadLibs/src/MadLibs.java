// by Mateo Vizcarra and Lance Dee-Hoskins
// 2/13/24
import java.util.Scanner; //you have to import the scanner to be able to use it

public class MadLibs {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //implementing scanner
    	String Fruit, Car, Name; //Strings made for User Input
    	int FavoriteNumber; // integer made for User Input
    	double Fraction;  // a number with a floating point made for user input (For Fraction)
    	
    	//creating inputs w scanner
    	System.out.print("Enter your name\n");
    	Name = in.nextLine(); //user's input = "Name"
    
    	System.out.print("What's your favorite number?\n");
    	FavoriteNumber = in.nextInt(); //user's choice of number  = "Favorite Number"
    	
    	in.nextLine(); //making new line so the integer doesn't get rid of the next string
    	
    	System.out.print("What's your favorite fruit?\n");
    	Fruit = in.nextLine(); // User's choice of fruit = "Fruit"
    
    	System.out.print("What's your dream car?\n");
    	Car = in.nextLine(); // User choice of car = "Car"
    
    	System.out.print("Enter a random fraction, e.g .5.\n");
    	Fraction = in.nextDouble(); // User selected decimal = "Fraction"
    	
    	in.nextLine(); //same logic as before, double/integer will negate the following string.

        
    	System.out.print("Here's a story based on the answers given\n");
    	
    	System.out.printf("\n%s walked home from the grocery store.\nThey tripped on a banana peel on the way and fell face first on the ground."
    			+ "\nThey got so angry they picked up %d %s from their groceries and threw them as hard as they could into the street.\nUnluckily,"
    			+ "they hit a very expensive %s and ended up paying debt for the rest of their lives.\nThey paid %.3fth of the debt and then died before they could finish paying.", Name, FavoriteNumber, Fruit, Car, Fraction);
    	//The line above can be one singular line but it got too annoying to scroll through so I separated it into multiple lines.
    	in.close();
    	
    	//end of project
    	
    }
    
}
