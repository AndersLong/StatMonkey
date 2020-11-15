package logic_managers;

import math.MathEngine;

public class BinaryPermutationCalc extends LogicManager{

	
	protected String calculate_string(double[] double_dat) {
		if(double_dat.length != 3) 
		{
			return "illegal number of arguments, please try again";
		}
		int n = (int)double_dat[0];
		int x = (int)double_dat[1];
		double p = double_dat[2];
		double prob = MathEngine.binary_prob(n, x, p);
		return String.format("probability of %d successes (with individual probabilities of %f) out of %d tries is %f", x, p ,n, prob);
	}

}
