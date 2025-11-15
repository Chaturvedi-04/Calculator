package com.SampleTask;

public class Add implements Calci{

	@Override
	public int Addition(int a,int b) {
		
		return a+b;
		//System.out.println(a+b);
		
	}

	@Override
	public double Substraction(int a, int b) {
		return 0;
	}

	@Override
	public int Multiplication(int a, int b) {
		return 0 ;
		
	}

	@Override
	public double Divison(int a, int b) {
		return 0;
		
	}

}
