package math;

import java.util.ArrayList;
import java.util.Collections;

public class MathEngine {
	
	/**
	 * Handles a factorial, hopefully will be changed to handle big integers
	 */
	
	public static int factorial(int n) {
		if(n == 0 || n == 1) 
		{
			return 1;
		}
		int fact = 1;
		for(int i = 2; i <= n; i++)
		{
			fact *= i;
		}
		return fact;
	}
	
	/**
	 * Provided an array of doubles, finds the mean value
	 */
	
	public static double get_mean(double[] double_dat) 
	{
		int n = double_dat.length;
		double sum = 0;
		for(int i = 0; i < n; i++) {
			sum += double_dat[i];
		}
		return (sum/n);
	}
	
	/**
	 * Given mu and the the array of doubles, finds the sample variation
	 */
	
	public static double get_variation(double[] double_dat, double mu) 
	{
		int n = double_dat.length;
		double sum = 0;
		for(int i = 0; i < n; i++) {
			sum += Math.pow((double_dat[i]-mu),2);
		}
		return (sum/(n-1));
	}
	
	/**
	 * Finds the median of a sample of data
	 */
	
	public static double get_median(double[] double_dat) 
	{
		ArrayList<Double> doubles = new ArrayList<Double>();
		for(double d : double_dat)
		{
			doubles.add(d);
		}
		Collections.sort(doubles);
		return doubles.get(doubles.size()/2);
		
	}
	
	/**
	 * Finds n choose r
	 */
	
	public static double combination(int n, int r) 
	{
		return MathEngine.factorial(n)/(MathEngine.factorial(r)*MathEngine.factorial(n-r));
	}
	
	/**
	 * Finds a permutation of r objects from a set of n
	 */
	
	public static double permutation(int n, int r)
	{
		return MathEngine.factorial(n)/MathEngine.factorial(n-r);
	}
	
	/**
	 * Calculates the probability of a specific number of successes in a subset n with prob p
	 */
	
	public static double binary_prob(int n, int x, double p) 
	{
		double num_successes = combination(n,x);
		double prob_x_successes = Math.pow(p,x) * Math.pow(1.0-p,n-x);
		return num_successes * prob_x_successes;
	}
	
	/**
	 * Calculates the probability that x successes occur (somewhere in the range a to b)
	 * in a sample size n with probability p
	 */
	
	public static double binary_cdf_prob(int n, int a, int b, double p) 
	{
		double prob = 0;
		for(int i = a; i <= b; i++) {
			prob += binary_prob(n,i,p);
		}
		return prob;
	}
	
	public static double expected_value_binary_variable(int n, double p)
	{
		return n * p;
	}
	
	public static double variance_binary_variable(int n, double p)
	{
		return n * p * (1-p);
	}
	
	public static double deviation_binary_variable(int n, double p)
	{
		return Math.sqrt(variance_binary_variable(n,p));
	}
	
	public static double poisson_pdf_prob(double A, double t, double x) 
	{
		return ((Math.pow(Math.E,-1*A*t))*(Math.pow(A*t,x)))/(MathEngine.factorial((int)x));
	}
	
	public static double poisson_cdf_prob(double A, double t, double threshold, int region)
	{
		switch(region)
		{
		//above
		case 1:
			return 1.0 - poisson_cdf(A,t,threshold);
		//below
		case 2:
			return poisson_cdf(A,t,threshold-1);
		//up to
		case 3:
			return poisson_cdf(A,t,threshold);
		//down to
		case 4:
			return 1.0 - poisson_cdf(A,t,threshold-1);
		default:
			return 0;
		}
		
	}
	
	public static double poisson_cdf(double A, double t, double threshold) 
	{
		double sum = 0.0;
		for(int i = 0; i <= threshold; i++) {
			sum += poisson_pdf_prob(A,t,i);
		}
		return sum;
	}
	
	public static double uniform_mean(double A, double B) 
	{
		return (A + B)/2.0;
	}
	
	public static double uniform_variance(double A, double B) 
	{
		return Math.pow((A + B),2)/12.0;
	}
	
	public static String uniform_paramter(double A, double B)
	{
		return String.format("X~U(%.2f,%.2f)",A,B);
	}
	
	public static double uniform_pdf(double A, double B) 
	{
		return (1.0/(B-A));
	}
	
	public static double uniform_cdf(double A, double B, double left, double right) 
	{
		double pdf = uniform_pdf(A,B);
		return pdf*right-pdf*left;
	}

}
