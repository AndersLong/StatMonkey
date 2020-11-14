package logic_managers;

public class SampleDataCalc extends LogicManager{

	protected String calculate_string(double[] double_dat) 
	{
		int n = double_dat.length;
		double mu = get_mean(double_dat);
		double var = get_variation(double_dat, mu);
		double sigma = Math.sqrt(var);
		return String.format("| n: %d | mu: %f | var: %f | sigma: %f |",n,mu,var,sigma);
		
	}
	
	private double get_mean(double[] double_dat) 
	{
		int n = double_dat.length;
		double sum = 0;
		for(int i = 0; i < n; i++) {
			sum += double_dat[i];
		}
		return (sum/n);
	}
	
	private double get_variation(double[] double_dat, double mu) 
	{
		int n = double_dat.length;
		double sum = 0;
		for(int i = 0; i < n; i++) {
			sum += Math.pow((double_dat[i]-mu),2);
		}
		return (sum/(n-1));
	}
}
