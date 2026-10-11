import java.util.Scanner;

public class Paint1 {

    public static void main(String[] args) {
    	// Open Scanner and declare variables
    	Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        int wholeGallonsNeeded = 0;
        
        final double squareFeetPerGallons = 350.0;
        
        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's height

        do {
        	System.out.println("Enter wall height (feet): ");
        	try{ 
        		wallHeight = scnr.nextDouble();
        	}
        	catch (Exception excpt) {
        		System.out.println("Invalid entry, please enter a numeric value greater than 0");
        		scnr.next();
        	}
        } while (wallHeight <=0);
        
        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's width
        do {
        	System.out.println("Enter wall width (feet): ");
        	try {	
        		wallWidth = scnr.nextDouble();
        	}
        	catch (Exception excpt) {
        		System.out.println("Invalid entry, please enter a numeric value greater than 0");
        		scnr.next();
        	}
        } while (wallWidth <=0);

        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + " square feet");

        // Calculate and output the amount of paint (in gallons) needed to paint the wall
        // Added line to round the Double value up to the nearest Int        
        gallonsPaintNeeded = wallArea/squareFeetPerGallons;
        wholeGallonsNeeded = (int)Math.ceil(gallonsPaintNeeded);
        System.out.println("Paint needed: " + wholeGallonsNeeded + " gallons");
        
        //	Close Scanner because Eclipse is fussy about it
        scnr.close();
    } // end of Main
} // end of Paint1