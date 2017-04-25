public class Dog extends Animal implements ISoundProducible {
	private String species;

	public Dog(int age, String gender, String name, String species) {
		super(age, gender, name);
		this.species = species;
	}

	public String getDogSpecies() {
		return species;
	}

	public void setDogSpecies(String species) {
		this.species = species;
	}

	public void produceSound() {
		System.out.println("Haw Haw Haw");
	}

}
