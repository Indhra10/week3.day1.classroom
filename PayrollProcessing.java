package week3.day1;

public class PayrollProcessing implements TaxDeductions{
	
	public void GrossIncome(String Unitname, Double Salary, Double Tax)
	{
		System.out.println("grossincome" +Unitname);
		double Grossinc=Salary-Tax;
		System.out.println("Gross Income" + Grossinc);
		
	}
	
	public void NetIncome(String Unitname,Double Sal)
	{
		
		System.out.println("Netincome" +Sal);
	}
	public void bonus(String unitname,Double Bonus)
	{
		System.out.println("Bonus");
	}
}

