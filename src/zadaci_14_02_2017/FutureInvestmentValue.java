package zadaci_14_02_2017;

public class FutureInvestmentValue {

	double investment;
	double yearIneterest;
	int numberOfYears;

	public FutureInvestmentValue(double investment, double yearInterest, int numberOfYears) {
		this.investment = investment;
		this.yearIneterest = yearInterest;
		this.numberOfYears = numberOfYears;
		
	}
	
	// Method that returns future investment value
	public double getFutureInvestmentValue(){
		double monthlyInterest = yearIneterest/1200;
		return investment * Math.pow((1+monthlyInterest), (numberOfYears*12));
	}

}
