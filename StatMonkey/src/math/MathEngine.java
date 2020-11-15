package math;

import java.util.ArrayList;
import java.util.Collections;

public class MathEngine {
	
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
	
	public static double get_mean(double[] double_dat) 
	{
		int n = double_dat.length;
		double sum = 0;
		for(int i = 0; i < n; i++) {
			sum += double_dat[i];
		}
		return (sum/n);
	}
	
	public static double get_variation(double[] double_dat, double mu) 
	{
		int n = double_dat.length;
		double sum = 0;
		for(int i = 0; i < n; i++) {
			sum += Math.pow((double_dat[i]-mu),2);
		}
		return (sum/(n-1));
	}
	
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
	
	public static double combination(int n, int r) 
	{
		return MathEngine.factorial(n)/(MathEngine.factorial(r)*MathEngine.factorial(n-r));
	}
	
	public static double permutation(int n, int r)
	{
		return MathEngine.factorial(n)/MathEngine.factorial(n-r);
	}
	
	public static double binary_prob(int n, int x, double p) 
	{
		double num_successes = combination(n,x);
		double prob_x_successes = Math.pow(p,x) * Math.pow(1.0-p,n-x);
		return num_successes * prob_x_successes;
	}
	
	public static double binary_cdf_prob(int n, int a, int b, double p) 
	{
		double prob = 0;
		for(int i = a; i <= b; i++) {
			prob += binary_prob(n,i,p);
		}
		return prob;
	}

}
