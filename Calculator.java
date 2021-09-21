package week3.day1;

public class Calculator {
	
/*	*Method Overloading*
	Create class Calculator with below methods
	- 2 methods for add, 1 method with 2 int args , 1 method with 3 int args
	- 2 methods for multiply, 1 method with 2 int args, 1method with 1 int and 1 double args
	- 2 methods for subtract, 1 method with 2 int args , 1 method with 2 double args
	- 2 methods to divide , 1 method with 2 int args, 1 method with one double number and one in*/
		public void add()
		{
			int i=2,j=3;
			int sum=0;
			sum=i+j;
			System.out.println("Summ of two numbers without argument: " +sum);
		}
		
		public void add(int x,int y)
		{
			int sum=x+y;
			System.out.println("Summ of two numbers with argument: " +sum);
		}
		public void add(float x,float y)
		{
			float sum=x+y;
			System.out.println("Summ of two numbers with argument: " +sum);
		}
	}

