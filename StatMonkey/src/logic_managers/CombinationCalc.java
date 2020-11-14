package logic_managers;

import java.util.HashMap;

public class CombinationCalc extends LogicManager{
	
	protected String calculate_string(int[] int_dat) 
	{
		
		if(int_dat.length != 2) 
		{
			return "illegal number of arguments, please try again";
		}
		else 
		{
			int n = int_dat[0];
			int r = int_dat[1];
			return "" + (factorial(n)/(factorial(r)*factorial(n-r)));
		}
	}
	
	private int factorial(int n) {
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

}
