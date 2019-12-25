package hebbal.interfaces;

public class AnimalFactory {
	public Animal getAnimal(String type)
	{
		if(type.equalsIgnoreCase("dog"))
		{
			return new Dog();
		}
		else if(type.equalsIgnoreCase("cat"))
		{
			return new Cat();
		}
		else
		{
			return new Lion();
		}
	}
}
