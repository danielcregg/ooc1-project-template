package ie.gmit.testpackage;

public class ScienceStudent extends Student {
	
	// Instance Variable
	private String langOfStudy;

	// Getters and Setters
	public String getLangOfStudy() {
		return langOfStudy;
	}

	public void setLangOfStudy(String langOfStudy) {
		this.langOfStudy = langOfStudy;
	}
		
	public void myCountry() {
		System.out.println("I am from Ireland");
	}

}
