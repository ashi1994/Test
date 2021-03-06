package OopsConcept;
/**
 * Encapsulation in java is a process of wrapping code and data together into a single unit, 
 * We can create a fully encapsulated class in java by making all the data members of the class private.
 * Now we can use setter and getter methods to set and get the data in it
 * The Java Bean class is the example of fully encapsulated class
 * By providing only setter or getter method, you can make the class read-only or write-only.
 * Encapsulation can be achieved by: Declaring all the variables in the class as private and writing public
 *  methods in the class to set and get the values of variables.
 */
public class Encapsulation {
	
	private String name;//Here, the variable �name� is kept private or �encapsulated.�
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
}

//https://www.geeksforgeeks.org/encapsulation-in-java/


//Encapsulation is data hiding(information hiding) while Abstraction is detail hiding(implementation hiding).