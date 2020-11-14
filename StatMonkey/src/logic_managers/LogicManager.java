package logic_managers;

public abstract class LogicManager 
{
	public LogicManager()
	{
		
	}
	
	public String get_output_string(String input_string) {
		double[] double_dat = this.get_data(input_string);
		return this.calculate_string(double_dat);
	}
	
	protected abstract String calculate_string(double[] int_dat);
	
	protected double[] get_data(String data)
	{
		String[] str_dat = data.split(" ");
		double[] double_dat = new double[str_dat.length];
		for(int i = 0; i < str_dat.length; i++)
		{
			double_dat[i] = Double.parseDouble(str_dat[i]);
		}
		return double_dat;
	}

}
