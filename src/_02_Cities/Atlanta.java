package _02_Cities;

public class Atlanta extends City{

	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double taxes = population*growthRate;
		taxes = taxes*2*growthRate;
		return taxes;
	}

}
