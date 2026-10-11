import java.util.Scanner;

/*	I couldn't make it work with "throw" statements in there
 * 	but on the w3schools website it shows an example without
 * 	them and it worked, so I'm not sure why zyBooks insists
 * 	on them being there.
 */
public class Paint1 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        
        final double squareFeetPerGallons = 350.0;
        
        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's height

        /* The instant check thing didn't like that I
         * broke the loops when the input was right, but
         * I thought that was the point, so if I messed 
         * up just let me know.
         */
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
        gallonsPaintNeeded = wallArea/squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");

        scnr.close();
    } // end of Main
} // end of Paint1