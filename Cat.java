public class Cat extends Animal implements ISoundProducible {
	private String species;

	public Cat(int age, String gender, String name, String species) {
		super(age, gender, name);
		this.species = species;
	}

	public Cat(int age, String name, String species) {
		super(age, name);
		this.species = species;
	}

	public String getDogSpecies() {
		return species;
	}

	public void setDogSpecies(String species) {
		this.species = species;
	}

	public void produceSound() {
		System.out.println("meow meow");

	}
}
