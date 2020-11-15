package logic_managers;

import math.MathEngine;

public class SampleDataCalc extends LogicManager{

	protected String calculate_string(double[] double_dat) 
	{
		int n = double_dat.length;
		double mu = MathEngine.get_mean(double_dat);
		double var = MathEngine.get_variation(double_dat, mu);
		double sigma = Math.sqrt(var);
		double med = MathEngine.get_median(double_dat);
		return String.format("| n: %d | med: %f | mu: %f | var: %f | sigma: %f |",n,med,mu,var,sigma);
		
	}
	
	
	
	
}
