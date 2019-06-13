package _02_Cities;

public class Boston extends City {

	public Boston(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double taxes = population*growthRate;
		taxes = taxes+(0.5*population);
		return taxes;
	}

}
