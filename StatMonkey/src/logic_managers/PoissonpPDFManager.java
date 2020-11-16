package logic_managers;

import math.MathEngine;

public class PoissonpPDFManager extends LogicManager
{

	
	protected String calculate_string(double[] double_dat)
	{
		if(double_dat.length != 3) 
		{
			return "illegal number of arguments, please try again";
		}
		else 
		{
			double A = double_dat[0];
			double t = double_dat[1];
			double x = double_dat[2];
			double prob = MathEngine.poisson_pdf_prob(A,t,x);
			return String.format("the probability of %.2f occurences over %.2f time with an average of %.2f per unit of time is %.4f",x,t,A,prob);
		}
	}

}
