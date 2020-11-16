package logic_managers;

import math.MathEngine;

public class UniformAnalysisManager extends LogicManager
{
	protected String calculate_string(double[] double_dat) {
		if(double_dat.length != 2) 
		{
			return "illegal number of arguments, please try again";
		}
		double A = double_dat[0];
		double B = double_dat[1];
		double pdf = MathEngine.uniform_pdf(A,B);
		double mu = MathEngine.uniform_mean(A,B);
		double var = MathEngine.uniform_variance(A,B);
		return String.format("Uniform var X has: |pdf: %.4f | expected value:  %.4f | variance: %.4f",pdf,mu,var);
	}

}
