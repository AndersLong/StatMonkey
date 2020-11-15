package logic_managers;

import math.MathEngine;

public class CombinationCalc extends LogicManager{
	
	protected String calculate_string(double[] double_dat) 
	{
		
		if(double_dat.length != 2) 
		{
			return "illegal number of arguments, please try again";
		}
		else 
		{
			int n = (int)double_dat[0];
			int r = (int)double_dat[1];
			return "" + MathEngine.combination(n,r);
		}
	}
	

}
