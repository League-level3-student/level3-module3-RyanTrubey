package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {
	public static void main(String[] args) {
		ArrayList<Animal> Farm = new ArrayList<Animal>();
		Cow cow = new Cow();
		Cow cow2 = new Cow();
		Chicken chicken = new Chicken();
		Chicken chicken2 = new Chicken();
		Horse horse = new Horse();
		Pig pig = new Pig();
		Farm.add(cow);
		Farm.add(cow2);
		Farm.add(chicken);
		Farm.add(chicken2);
		Farm.add(horse);
		Farm.add(pig);
		for(int i = 0; i < Farm.size(); i++) {
			Farm.get(i).makeNoise();
			Farm.get(i).eat();
		}
	}
}
