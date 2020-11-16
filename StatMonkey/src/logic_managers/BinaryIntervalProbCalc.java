package logic_managers;

import math.MathEngine;

public class BinaryIntervalProbCalc extends LogicManager{

	
	protected String calculate_string(double[] double_dat) {
		if(double_dat.length != 4) 
		{
			return "illegal number of arguments, please try again";
		}
		int n = (int)double_dat[0];
		int a = (int)double_dat[1];
		int b = (int)double_dat[2];
		double p = double_dat[3];
		double prob = MathEngine.binary_cdf_prob(n,a,b,p);
		return String.format("probability of %d to %d successes (with individual probabilities of %.4f) out of %d tries is %.4f", a, b, p ,n, prob);
	}

}
