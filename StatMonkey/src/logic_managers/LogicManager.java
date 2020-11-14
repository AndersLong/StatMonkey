package logic_managers;

public abstract class LogicManager 
{
	public LogicManager()
	{
		
	}
	
	public String get_output_string(String input_string) {
		int[] int_dat = this.get_data(input_string);
		return this.calculate_string(int_dat);
	}
	
	protected abstract String calculate_string(int[] int_dat);
	
	protected int[] get_data(String data)
	{
		String[] str_dat = data.split(" ");
		int[] int_dat = new int[str_dat.length];
		for(int i = 0; i < str_dat.length; i++)
		{
			int_dat[i] = Integer.parseInt(str_dat[i]);
		}
		return int_dat;
	}

}
