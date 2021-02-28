package ie.gmit.testpackage;

public class LangStudent extends Student {
	
	// Instance Variable
	private String langOfStudy;

	// Getters and Setters
	public String getLangOfStudy() {
		return langOfStudy;
	}

	public void setLangOfStudy(String langOfStudy) {
		this.langOfStudy = langOfStudy;
	}
	
	// I speak method
	@Override
	public void iSpeak() {
		System.out.println("I speak " + langOfStudy + "!");
	}

	@Override
	public void myCountry() {
		System.out.println("I am not from Ireland");
	}
	
}
