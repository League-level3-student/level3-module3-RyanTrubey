package _01_AnimalFarm;

public class Cow extends Animal{

	@Override
	public void makeNoise() {
		System.out.println("moo");
	}

	@Override
	public void eat() {
		System.out.println("cow eating");
	}

}
