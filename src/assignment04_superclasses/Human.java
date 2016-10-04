package assignment04_superclasses;

/**
 * @author Rickard Berglund
 * @version 1.0
 * @since 2016-10-04
 *
 */
public class Human {
	
	// Attributes
	private String name;
	private int age;
	
	/**
	 * @param name
	 * @param age
	 * 
	 * Constructor with two parameters
	 */
	// Constructor
	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	

}
