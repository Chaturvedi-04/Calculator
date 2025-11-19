package com.SampleTask;

public class CalculatorImplementation implements Calci{

	@Override
	public int Addition(int a,int b) {
		
		int c = a+b;
		return c;
	}

	@Override
	public double Substraction(int a, int b) {
		
		int c = a-b;
		return c;
	}

	@Override
	public int Multiplication(int a, int b) {
		
		int c = a*b;
		return c;
		
	}

	@Override
	public double Divison(int a, int b) {
		if(a!=0 || b != 0)
		{
			int c=a/b;
			return c;
		}
		else
			System.out.println("Cannot divide");
			return 0;
		
	}

}
