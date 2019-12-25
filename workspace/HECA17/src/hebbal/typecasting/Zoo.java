package hebbal.typecasting;

public class Zoo {
	public void animalFoo(Animal a)
	{
		a.print();
		if(a instanceof Dog)
		{
			Dog d = (Dog)a;
			d.eat();
		}
		else if(a instanceof Lion)
		{
			Lion l = (Lion)a;
			l.eat();
		}
		else if(a instanceof Monkey)
		{
			Monkey m = (Monkey)a;
			m.eat();
		}
	}
}
