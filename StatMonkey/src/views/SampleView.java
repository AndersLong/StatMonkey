package views;

import java.awt.Graphics;

import cor.Looper;
import gfx.ActionButton;
import gfx.Button;
import gfx.ClearButton;
import gfx.TextButton;
import gfx.View;
import logic_managers.SampleDataCalc;
import views_engine.VIEW_ID;

public class SampleView extends View
{
	
	public Button sample_analysis_to_home,
				  calculate_sample_data,
				  clear_button;
	

	public SampleView() 
	{
		this.view_id = VIEW_ID.SAMPLE;
		this.logic_manager = new SampleDataCalc();	
	}
	
	@Override
	public void init_buttons() 
	{
		this.sample_analysis_to_home = new ActionButton((Looper.WIDTH - Button.standard_width)/2,150,"back",VIEW_ID.HOME,this);
		this.buttons.add(sample_analysis_to_home);
		
		this.calculate_sample_data = new TextButton((Looper.WIDTH - Button.standard_width)/2,50,"calculate sample data",this);
		this.buttons.add(calculate_sample_data);
		
		this.clear_button = new ClearButton((Looper.WIDTH - Button.standard_width)/2,100,"clear",this);
		this.buttons.add(clear_button);
		
	}

}
