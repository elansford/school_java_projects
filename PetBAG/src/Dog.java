
public class Dog {
	
	//Instance Fields - variables declared
	private int dogSpaceNumber;
	private int dogWeight;
	private String grooming;
	
	//default constructor - variables initialized
	public Dog() {
		dogSpaceNumber = -1;
		dogWeight = -1;
		grooming = "not set";			
	}
	
	//Mutators - values set according to user input
	public void setDogSpaceNumber(int s) {
		dogSpaceNumber = s;
	}
	
	public void setDogWeight(int w) {
		dogWeight = w;
	}
	
	public void setGrooming(String g) {
		grooming = g;
	}
	
	//Accessors - values set by user returned
	public int getDogSpaceNumber() {
		return dogSpaceNumber;
	}
	
	public int getDogWeight() {
		return dogWeight;
	}
	
	public String getGrooming() {
		return grooming;
	}
	
}


