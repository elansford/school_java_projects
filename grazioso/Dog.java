public class Dog extends RescueAnimal {

    // Instance variable
    protected String breed;

    // Constructor
    public Dog(String name, String breed, String gender, String age,
    String weight, String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry) {
        setName(name);
        setBreed(breed);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);

    }	//end of Dog constructor

    // Accessor Method
    public String getBreed() {
        return breed;
    }

    // Mutator Method
    public void setBreed(String dogBreed) {
        breed = dogBreed;
    }

/*	I tried to format the toString() override output to fixed-width fields
 *  but I couldn't get it to work and I didn't want to spend too much time
 *  chasing rabbits so the output is not as neat as it could be.
 *  
 *  Commented out sample code is the technique I found on Stack Overflow, 
 *  which says it should work
 */
    // Output Method    
    public String toString() {
    	return name + "\t" + breed + "\t" + gender + "\t" + age + "\t" + weight + "\t"
  			+ acquisitionDate + "\t" + acquisitionCountry + "\t" + trainingStatus + "\t" + 
    			reserved + "\t" + inServiceCountry;
    	
    	
//    	return String.format("%10s\t%10s\t%6s\t%3s\t%4s\t%10s\t%15s\t%10s\t%b\t%15"), name, breed, gender,
//    			age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, 
//    			inServiceCountry);

    } //end of toString() override

} // End of public class Dog
