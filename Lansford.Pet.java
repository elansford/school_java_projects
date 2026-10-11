public class Pet {
	
	//Instance Fields - variables declared
	private String petType;
	private String petName;
	private int petAge;
	private int dogSpaces;
	private int catSpaces;
	private int daysStay;
	private double amountDue;
	
	//Default Constructor - variables initialized
	public Pet() {
		petType = "Type Not Set";
		petName = "Name Not Set";
		petAge = -1;
		dogSpaces = -1;			//These two may have to change based on maintaining
		catSpaces = -1;			//an accurate count of spaces available/in use
		daysStay = -1;
		amountDue = 0.0;			
	}
	
	//Mutators
	public void setPetType(String t) {
		petType = t;
	}
	
	public void setPetName(String n) {
		petName = n;
	}
	
	public void setPetAge(int a) {
		petAge = a;
	}
	
	public void setDogSpaces(int ds) {
		dogSpaces = ds;
	}
	
	public void setCatSpaces(int cs) {
		catSpaces = cs;	
	}
	
	public void setDaysStay(int d) {
		daysStay = d;
	}
	
	public void setAmountDue(double amt) {	//This method will expand in the
		amountDue = amt;			//final version due to the calculations
	}					//and branching involved.
	
	//Accessors
	public String getPetType() {
		return petType;	
	}
	
	public String getPetName() {
		return petName;
	}
	
	public int getPetAge() {
		return petAge;
	}
	
	public int getDogSpaces() {
		return dogSpaces;
	}
	
	public int getCatSpaces() {
		return catSpaces;
	}
	
	public int getDaysStay() {
		return daysStay;
	}
	
	public double getAmountDue() {
		return amountDue;
	}
	
}

