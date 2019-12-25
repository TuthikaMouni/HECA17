package hebbal.interfaces;

public class Artist1 {
	public static void main(String[] args) {
		FactoryProducer fp = new FactoryProducer();
		AbstractFactory af = fp.getFactory("shape");
		af.getShape("circle").draw();
		af = fp.getFactory("color");
		af.getColor("red").fill();;
	}
}
