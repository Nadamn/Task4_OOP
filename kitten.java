public class kitten extends Cat implements ISoundProducible {

	public kitten(int age, String name, String species) {
		super(age, name, species);
		setAnimalGender("female");
	}
	public void produceSound() {
		System.out.println("meow meow");

	}

}
