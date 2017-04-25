
public class TomCat extends Cat implements ISoundProducible {

	public TomCat(int age, String name, String species) {
		super(age, name, species);
		setAnimalGender("male");
	}
	public void produceSound() {
		System.out.println("meow meow");

	}

}
