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
		return 0;
		
	}

}
