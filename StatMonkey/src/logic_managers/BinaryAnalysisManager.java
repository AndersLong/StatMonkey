package logic_managers;

import math.MathEngine;

public class BinaryAnalysisManager extends LogicManager
{

	protected String calculate_string(double[] double_dat) {
		if(double_dat.length != 2) 
		{
			return "illegal number of arguments, please try again";
		}
		int n = (int)double_dat[0];
		double p = double_dat[1];
		double mu = MathEngine.expected_value_binary_variable(n,p);
		double var = MathEngine.variance_binary_variable(n,p);
		double dev = MathEngine.deviation_binary_variable(n,p);
		return String.format("random var X with n = %d and p = %f has: | expected value: %f | variance: %f | deviation: %f |",n,p,mu,var,dev);
	}

}
