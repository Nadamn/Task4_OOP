public class main {

	public static void main(String[] args) {
		Dog dogo = new Dog(3, "male", "mike", "Gray Wolf");
		dogo.produceSound();
		System.out.println(dogo.getAnimalAge());
		System.out.println(dogo.getAnimalGender());
		System.out.println(dogo.getAnimalName());
		System.out.println(dogo.getDogSpecies());

		Frog frogo = new Frog(3, "male", "frogo", "green");
		frogo.produceSound();

		Cat lameAssAnimal = new Cat(2, "female", "bessa", "Siamese");
		lameAssAnimal.produceSound();

		kitten kitty = new kitten(1, "bessa", "bla");
		kitty.produceSound();

		TomCat sala7 = new TomCat(2, "sala7", "-_-");
		sala7.produceSound();
	}

}
