package pack04;

public class Company {
	private double salary;
	private double income;
	private double afterTaxIncome;
	private double bonus;
	private double afterTaxBonus;
	
	public Company() {
		
	}

	public Company(double salary) {
		this.salary = salary;
	}
	
	public double getIncome() {
		income = salary * 12;
		return income;
	}
	
	public double getAfterTaxIncome() {
		afterTaxIncome = income * 0.9;
		return afterTaxIncome;
	}
	
	
	
}
