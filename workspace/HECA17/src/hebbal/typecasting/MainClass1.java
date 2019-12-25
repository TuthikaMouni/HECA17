package hebbal.typecasting;

public class MainClass1 {
	public static void main(String[] args) {
		Zoo z = new Zoo();
		z.animalFoo(new Dog());
		z.animalFoo(new Lion());
		z.animalFoo(new Monkey());
		z.animalFoo(new Animal());
	}
}
