package logic_managers;

import math.MathEngine;

public class PoissonCDFManager extends LogicManager
{

	@Override
	protected String calculate_string(double[] double_dat) {
		if(double_dat.length != 4) 
		{
			return "illegal number of arguments, please try again";
		}
		double A = double_dat[0];
		double t = double_dat[1];
		double threshold = double_dat[2];
		int region = (int)double_dat[3];
		double prob = MathEngine.poisson_cdf_prob(A,t,threshold,region);
		String str_region = "";
		switch(region)
		{
		case 1:
			str_region = "above";
			break;
		case 2:
			str_region = "below";
			break;
		case 3:
			str_region = "at most";
			break;
		case 4:
			str_region = "at least";
			break;
		}
		return String.format("probability of %s %.2f instances (with an average A = %.2f) over time t = %.2f is %.4f", str_region, threshold ,A, t, prob);
	}

}
