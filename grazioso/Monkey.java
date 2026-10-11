public class Monkey extends RescueAnimal {
	
	private String tailLength;
	private String height;
	private String bodyLength;
	private String species;
	
    public Monkey(String name, String species, String gender, String age,
    String weight, String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry, 
	String tailLength, String height, String bodyLength) {
        setName(name);
        setSpecies(species);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
        setTailLength(tailLength);
        setHeight(height);
        setBodyLength(bodyLength);

    }
    //Accessor Methods
    public String getTailLength() {
    	return tailLength;
    }
    
    public String getHeight() {
    	return height;
    }
    
    public String getBodyLength() {
    	return bodyLength;
    
    }
    
    public String getSpecies() {
    	return species;
    }
    
    //Mutator Methods
    public void setTailLength(String length) {
    	tailLength = length;
    }
    
    public void setHeight(String h) {
    	height = h;
    }
    
    public void setBodyLength(String length) {
    	bodyLength = length;
    }
    
    public void setSpecies(String s) {
    	species = s;
    }
    
 /*	I tried to format the toString() override output to fixed-width fields
  *  but I couldn't get it to work and I didn't want to spend too much time
  *  chasing rabbits so the output is not as neat as it could be.
  */
   // Output Method
    public String toString() {
    	return name + "\t" + species + "\t" + gender + "\t" + age + "\t" + weight + "\t"
    			+ acquisitionDate + "\t" + acquisitionCountry + "\t" + trainingStatus + "\t" + 
    			reserved + "\t" + inServiceCountry + "\t" + tailLength + "\t" + height + "\t" +
    			bodyLength;
    } //end of toString() override

} // end of public class Monkey
