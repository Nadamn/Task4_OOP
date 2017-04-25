public class Frog extends Animal implements ISoundProducible {
	private String color;

	public Frog(int age, String gender, String name, String color) {
		super(age, gender, name);
		this.color = color;
	}

	public String getFrogColor() {
		return color;
	}

	public void setFrogColor(String color) {
		this.color = color;
	}

	public void produceSound() {
		System.out.println("croak croak croak");

	}

}
