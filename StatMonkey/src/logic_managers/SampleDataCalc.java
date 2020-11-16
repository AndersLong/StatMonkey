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
		return String.format("| n: %d | med: %.4f | mu: %.4f | var: %.4f | sigma: %.4f |",n,med,mu,var,sigma);
		
	}
	
	
	
	
}
