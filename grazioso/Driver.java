import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashSet;

public class Driver {

	public static String list = null;
	public static int i = -1;
    public static String checkInput = "not set";
    public static String s = "not set";
    public static String t = "not set";
    
	private static Scanner scnr = new Scanner(System.in);

	//Define Array Lists
	private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    
    public static void main(String[] args) {
 
    	initializeDogList();
    	initializeMonkeyList();
    	
        //Menu Loop
        String menuChoice = "null";
     	while (!menuChoice.equals("Q")) {
    		displayMenu();
    		menuChoice = scnr.nextLine();
    		switch(menuChoice) {
    		case "1": 
    			intakeNewDog(scnr);
    			break;
    		case "2": 
    			intakeNewMonkey(scnr);
    			break;
    		case "3": 
    			reserveAnimal(scnr);
    			break;
    		case "4": 
    			list = "Dog";
    			printAnimals();
    			break;
    		case "5": 
    			list = "Monkey";
    			printAnimals();
    			break;
    		case "6": 
    			list = "All";
    			printAnimals();
    			break;
    		default: // If user inputs "q", system will return to main menu
    			if(!menuChoice.equalsIgnoreCase("Q")) {
    System.out.println("\nInvalid input, please try again. Enter 1-6 or q to quit.");
    			}
    			break;
    			} // End of switch
    		} // End of loop
    System.out.println("Goodbye. \nThank you for using the Grazioso Salvare system.");
    } // end of main

    
    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[Q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }

    public static void intakeNewDog(Scanner scnr) {
        System.out.println("What is the dog's name?");
        String name = scnr.nextLine();
        for(Dog dog: dogList) {							// Prevents duplicate entries
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }
    	System.out.println("Breed?");
    	String breed = scnr.nextLine();
    	System.out.println("Gender? ('male' or 'female'");
    	String gender = scnr.nextLine();
    	System.out.println("Age?");
    	String age = scnr.nextLine();
    	System.out.println("Weight?");
    	String weight = scnr.nextLine();
    	System.out.println("Date of acquisition? mm-dd-yyy");
    	String acquisitionDate = scnr.nextLine();
    	System.out.println("Acquisition country?");
    	String acquisitionCountry = scnr.nextLine();
    	checkInput = "stop";
    	//	Validates input for allowed statuses
    	do {
        	System.out.println("Training status?");
        	String t = scnr.nextLine();
    		if (t.equals("Intake")) {
    			checkInput = "go";
    		}
    		else if (t.equals("Phase I")) {
    			checkInput = "go";
    		}
    		else if (t.equals("Phase II")) {
    			checkInput = "go";
    		}
    		else if (t.equals("Phase III")) {
    			checkInput = "go";
    		}
    		else if (t.equals("Phase IV")) {
    			checkInput = "go";
    		}
    		else if (t.equals("Phase V")) {
    			checkInput = "go";
    		}
    		else if (t.equals("In-service")) {
    			checkInput = "go";
    		}
    		else if (t.equals("Farm")) {
    			checkInput = "go";
    		}
    		else {
    			System.out.println("Invalid status.");
    			System.out.println("Valid statuses are: Intake, Phase I - Phase V, In-service,"
    					+ " and Farm.");
    			checkInput.equals("stop");
    		}
    	} while (checkInput.equals("stop")); //end of training validation loop
    	String trainingStatus = t;
    	System.out.println("Reserved? True or False");
    	boolean reserved = scnr.nextBoolean();
    	scnr.nextLine();
    	System.out.println("In service country?");
    	String inServiceCountry = scnr.nextLine();
    	
    	//Create new dog based on validated user input
    	Dog newDog = new Dog(name, breed, gender, age, weight,
    			acquisitionDate, acquisitionCountry, trainingStatus, reserved,
    			inServiceCountry);

    	//Adds dog to Array List
    	dogList.add(newDog);
    	System.out.println("The animal has successfully been added to our system. Thank you!");
    } // end of intakeNewDog 


    public static void intakeNewMonkey(Scanner scnr) {
    	//Prompts for new monkey information
    	System.out.println("Name?");
    	String name = scnr.nextLine();
    	for (Monkey monkey: monkeyList) {
    	if (monkey.getName().equalsIgnoreCase(name)) {			//Prevents duplicates
    		System.out.println("This animal already exists.");
    		return;
    		}
    	}
    	String checkInput = "stop";
    	// Validates input for allowed species
    	do {													
    	System.out.println("Species?");							
    	s = scnr.nextLine();
    		if (s.equals("Capuchin")) {
    			checkInput = "go";
    		}
    		else if (s.equals("Guenon")) {
    			checkInput = "go";
    		}
    		else if (s.equals("Macaque")) {
    			checkInput = "go";
    		}
    		else if (s.equals("Marmoset")) {
    			checkInput = "go";
    		}
    		else if (s.equals("Squirrel Monkey")) {
    			checkInput = "go";
    		}
    		else if (s.equals("Tamarin")) {
    			checkInput = "go";
    		}
    		else {
    			System.out.println("Invalid species.");
    			System.out.println("Valid choices are Capuchin, Guenon, Macaque, Marmoset,");
    			System.out.println("Squirrell Monkey, or Tamarin.");
    			checkInput = "stop";
    		}
    	} while (checkInput.equals("stop")); //end of species validation loop
		String species = s;
    	System.out.println("Gender? ('male' or 'female'");
    	String gender = scnr.nextLine();
    	System.out.println("Age?");
    	String age = scnr.nextLine();
    	System.out.println("Weight?");
    	String weight = scnr.nextLine();
    	System.out.println("Date of acquisition? mm-dd-yyy");
    	String acquisitionDate = scnr.nextLine();
     	System.out.println("Country of acquisition?");
    	String acquisitionCountry = scnr.nextLine();
    	checkInput = "stop";
    	//	Validates input for allowed statuses
    	do {
        	System.out.println("Training status?");
        	String t = scnr.nextLine();
    		if (t.equals("Intake")) {
    			checkInput = "go";
    		}
    		else if (t.equals("Phase I")) {
    			checkInput = "go";
    		}
    		else if (t.equals("Phase II")) {
    			checkInput = "go";
    		}
    		else if (t.equals("Phase III")) {
    			checkInput = "go";
    		}
    		else if (t.equals("Phase IV")) {
    			checkInput = "go";
    		}
    		else if (t.equals("Phase V")) {
    			checkInput = "go";
    		}
    		else if (t.equals("In-service")) {
    			checkInput = "go";
    		}
    		else if (t.equals("Farm")) {
    			checkInput = "go";
    		}
    		else {
    			System.out.println("Invalid status.");
    			System.out.println("Valid statuses are: Intake, Phase I - Phase V, In-service,"
    					+ " and Farm.");
    			checkInput.equals("stop");
    		}
    	} while (checkInput.equals("stop")); //end of training validation loop
    	String trainingStatus = t;
    	System.out.println("Reserved? True or False?");
    	boolean reserved = scnr.nextBoolean();
    	scnr.nextLine();
    	System.out.println("Country of service?");
    	String inServiceCountry = scnr.nextLine();
    	System.out.println("Height?");
    	String height = scnr.nextLine();
    	System.out.println("Tail length?");
    	String tailLength = scnr.nextLine();
    	System.out.println("Body length?");
    	String bodyLength = scnr.nextLine();
    	
    	//Create new monkey based on validated user input
    	Monkey newMonkey = new Monkey(name, species, gender, age, weight, acquisitionDate,
    			acquisitionCountry, trainingStatus, reserved, inServiceCountry,
    			tailLength, height, bodyLength);

    	//Adds monkey to Array List
    	monkeyList.add(newMonkey);
    	System.out.println("The animal has successfully been added to our system. Thank you!");
    	
    } // end of intakeNewMonkey

    
        public static void reserveAnimal(Scanner scanner) {
        	String inputCheck = "stop";    		
        	HashSet<String> dogCountryList = new HashSet<String>();
        	HashSet<String> monkeyCountryList = new HashSet<String>();
        	int dogNum = 0;
        	int monkeyNum = 0;
        	for (Dog dog : dogList) {
        		String status = dog.getTrainingStatus();
				if ((dog.getReserved() == false) && (status.equals("In-service"))) { 
					dogNum = dogNum + 1;
					String country = dog.getInServiceLocation();
					dogCountryList.add(country);
				}
        	}
        	for (Monkey monkey : monkeyList) {
        		String status = monkey.getTrainingStatus();
        		if ((monkey.getReserved() == false) && (status.equals("In-service"))) {
        			monkeyNum = monkeyNum + 1;
        			String country = monkey.getInServiceLocation();
        			monkeyCountryList.add(country);
        		}
        	}
        	System.out.println("There are " + dogNum + " dogs available in " + dogCountryList);
        	System.out.println("There are " + monkeyNum + " monkeys available in " + 
        						monkeyCountryList);
        	System.out.println("");
        	//	Loops to reserve either a dog or monkey by name, presents valid choices from
    		//	ArrayLists Dog and Monkey
    		do {
    			System.out.println("Do you want to reserve a dog or a monkey?");
    			String animal = scnr.nextLine();
    			System.out.println("What country is it needed in?");
    			String country = scnr.nextLine();
    			if (animal.equalsIgnoreCase("Dog")) {
    				// Lists available dogs
    				for (Dog dog : dogList) {							
    					String status = dog.getTrainingStatus();
    					String tempCountry = dog.getInServiceLocation();
    					if ((dog.getReserved() == false) && (status.equals("In-service")) && 
    							(tempCountry.equalsIgnoreCase(country))) {
    						System.out.println(dog);
    					}
    				}
    				//	Reserves dog by name
    				System.out.println("Which dog do you want to reserve? (Name)");
    				String dogName = scnr.next();
            		for (Dog dog : dogList) {							            		
            			if (dog.getName().equals(dogName)) {
            				dog.setReserved(true);
            				System.out.println(dogName + " is now Reserved");
            				inputCheck = "go";
            			}
           			}
  				}
    			//	Lists available monkeys
    			else if (animal.equalsIgnoreCase("Monkey")) {
            		for (Monkey monkey : monkeyList) {							
            			String status = monkey.getTrainingStatus();
            			String tempCountry = monkey.getInServiceLocation();
            			if ((monkey.getReserved() == false) && (status.equals("In-service")) &&
            					(tempCountry.equalsIgnoreCase(country))) {
            				System.out.println(monkey);
            			}
            		}
            		System.out.println("Which monkey do you want to reserve? (Name)");
            		String monkeyName = scnr.next();
            		// Reserves monkey by name
            		for (Monkey monkey : monkeyList) {							            		
            			if (monkey.getName().equals(monkeyName)) {
            				monkey.setReserved(true);
            				System.out.println(monkeyName + " is now Reserved");
            				inputCheck = "go";
            			}
            		}
  				}
    			//	Exits to main menu
//    			else if (animal.equalsIgnoreCase("Q")) {
//    				System.out.println("Returning to main menu.");
//    				inputCheck = "go";
//    			}
    			// If input is not recognized continues the loop
    			else {
    				System.out.println("Invalid input");
    				inputCheck = "stop";
    			}
    		} while (inputCheck.equals("stop"));
    		scnr.nextLine();
        } // end of reserveAnimal

        public static void printAnimals() {
        	// Prints all information for all dogs in ArrayList Dog
        	if (list.equals("Dog")) {								
        		for (Dog dog : dogList) {							
        		System.out.println(dog);
        		}
        	}
        	//	Prints all information for all dogs in ArrayList Monkey
        	else if (list.equals("Monkey")) {						
        		for (Monkey monkey : monkeyList) {					
        			System.out.println(monkey);
        		}
        	}
        	//	Prints all information for available animals from their respective
        	//	ArrayLists, dogs first then monkeys
        	else if (list.equals("All")) {							        					
        		for (Dog dog : dogList) {														
        			String status = dog.getTrainingStatus();		
        			if ((dog.getReserved() == false) && (status.equals("In-service"))) {
        			System.out.println(dog);
        			}
        		}
        		for (Monkey monkey : monkeyList) {	
        			String status = monkey.getTrainingStatus();
        			if ((monkey.getReserved() == false) && (status.equals("In-service"))) {
        			System.out.println(monkey);
        			}
        		}
        	} // end of print Available

        } // end of printAnimals

/*	These two methods were originally directly beneath 'main' and made the code
 * 	nearly unreadable. They are only used once to populate the ArrayLists for
 * 	testing so they've been moved here to be out of the way.
 * 
 * 	Before the program is put in service the calls on these methods should
 * 	be removed and the methods themselves deleted. */        

        // Adds dogs to a list for testing
        public static void initializeDogList() {
            Dog dog1 = new Dog("Jacob", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "Intake", false, "United States");
            Dog dog2 = new Dog("Edward", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United Kingdom");
            Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "In-service", false, "Canada");
            Dog dog4 = new Dog("Esme", "Cocker Spaniel", "female", "2", "15", "12-01-2020", "United Kingdom", "In-service", false, "Argentina");

            dogList.add(dog1);
            dogList.add(dog2);
            dogList.add(dog3);
            dogList.add(dog4);
        } // end of initializeDogList

        // Adds monkeys to a list for testing
        public static void initializeMonkeyList() {
        	Monkey monkey1 = new Monkey("Micky", "Capuccin", "male", "1", "24", "05-12-2021", "United States", "Intake", false, "United States", "3.5", "2", "2");
            Monkey monkey2 = new Monkey("Michael", "Marmoset", "male", "2", "15.6", "11-15-2021", "Zimbabwe", "Phase V", false, "United States", "3.5", "2", "2");
            Monkey monkey3 = new Monkey("Peter", "Marmoset", "male", "1", "5.2", "08-11-2021", "El Salvador", "In-service", false, "United States", "3.5", "2", "2");
            Monkey monkey4 = new Monkey("Davy", "Squirrel Monkey", "male", "2", "5", "08-11-2020", "United Kingdom", "In-service", false, "United States", "2.5", "3", "2");

            monkeyList.add(monkey1);
            monkeyList.add(monkey2);
            monkeyList.add(monkey3);
            monkeyList.add(monkey4);
        } // end of initializeMonkeyList
 
} // end of public class Driver