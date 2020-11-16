package views;

import java.awt.Graphics;

import cor.Looper;
import gfx.ActionButton;
import gfx.Button;
import gfx.ClearButton;
import gfx.TextButton;
import gfx.View;
import logic_managers.BinaryIntervalProbCalc;
import views_engine.VIEW_ID;

public class BinaryCDFView extends View{
	
	public Button binary_CDF_to_home,
	  			  calculate_CDF_data,
	  			  clear_button;
	
	public BinaryCDFView() 
	{
		this.view_id = VIEW_ID.BINARY_CDF;
		this.logic_manager = new BinaryIntervalProbCalc();	
	}

	
	public void init_buttons() {
		
		this.binary_CDF_to_home = new ActionButton((Looper.WIDTH - Button.standard_width)/2,150,"back",VIEW_ID.HOME,this);
		this.buttons.add(binary_CDF_to_home);
		
		this.calculate_CDF_data = new TextButton((Looper.WIDTH - Button.standard_width)/2,50,"calculate probability",this);
		this.buttons.add(calculate_CDF_data);
		
		this.clear_button = new ClearButton((Looper.WIDTH - Button.standard_width)/2,100,"clear",this);
		this.buttons.add(clear_button);
		
	}

	
}
