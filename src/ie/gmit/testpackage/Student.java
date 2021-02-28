package ie.gmit.testpackage;

public abstract class Student {
	
	// Instance Variables
	private int age;
	private float weight;
	
	//Getters and Setters
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public float getWeight() {
		return weight;
	}
	
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	// Abstract method (does not have a body)
	public abstract void myCountry();
	
	// MyMethod
	public void iSpeak() {
		System.out.println("I speak English!");
	}
	
} // End class
