package ie.gmit.testpackage;

/**
 * The Main class holds the main method.
 */
public class Main {
	
	// Main method containing print statement.
	public static void main(String[] args) {
		
		Student[] arrayOfStudents = new Student[10];
		int randomAge = 0;
		int maxAge = 23;
		int minAge = 17;
		float randomWeight = 0.0f;
		float minWeight = 50.0f;
		float maxWeight = 120.0f;
		
		for (int i = 0; i < arrayOfStudents.length; i++) {
			arrayOfStudents[i] = new ScienceStudent();
			randomAge = (int)(Math.random() * (maxAge - minAge + 1) + minAge);
			arrayOfStudents[i].setAge(randomAge);
			randomWeight = (float)(minWeight + Math.random() * (maxWeight - minWeight));
			arrayOfStudents[i].setWeight(randomWeight);
			System.out.print("Student " + i + " - ");
			System.out.print("Age: " + arrayOfStudents[i].getAge() + ", ");
			System.out.println("Weight: " + arrayOfStudents[i].getWeight());
		}
		
		System.out.println("This is the main method, inside the Main calss.");
		
		// Create an object of type Student
		Student scienceStudent1 = new ScienceStudent();
		
		// Execute the run method for Student object
		scienceStudent1.iSpeak();
		scienceStudent1.myCountry();
		
		LangStudent langStudent1 = new LangStudent();
		langStudent1.setAge(20);
		langStudent1.setLangOfStudy("French");
		langStudent1.iSpeak();
		
	} // End main method
	
} // End Main Class
