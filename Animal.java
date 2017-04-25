public abstract class Animal {
	private int age;
	private String gender;
	private String name;

	public Animal(int age, String gender, String name) {
		this.age = age;
		this.gender = gender;
		this.name = name;
	}

	public Animal(int age, String name) {
		this.age = age;
		this.name = name;
	}

	// getters
	public int getAnimalAge() {
		return age;
	}

	public String getAnimalGender() {
		return gender;
	}

	public String getAnimalName() {
		return name;
	}

	// setters
	public void setAnimalAge(int age) {
		this.age = age;
	}

	public void setAnimalGender(String gender) {
		this.gender = gender;
	}

	public void setAnimalName(String name) {
		this.name = name;
	}
}
