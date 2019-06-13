package _02_Cities;

public class SanDiego extends City{

	public SanDiego(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double taxes = population*growthRate;
		taxes = taxes+1000000;
		System.out.println(taxes);
		return taxes;
	}
}
