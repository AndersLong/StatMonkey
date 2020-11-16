package views;

import java.awt.Graphics;

import cor.Looper;
import gfx.ActionButton;
import gfx.Button;
import gfx.ClearButton;
import gfx.TextButton;
import gfx.View;
import logic_managers.CombinationCalc;
import views_engine.VIEW_ID;

public class CombinationView extends View
{

	public Button combination_to_home,
	              calculate_combination,
	              clear_button;

	public CombinationView() 
	{
		this.view_id = VIEW_ID.COMBINATION;
		this.logic_manager = new CombinationCalc();		
		this.upper_string = "usage: |n|r|";
	}
	
	@Override
	public void init_buttons() 
	{
		this.combination_to_home = new ActionButton((Looper.WIDTH - Button.standard_width)/2,150,"back",VIEW_ID.HOME,this);
		this.buttons.add(combination_to_home);
		
		this.calculate_combination = new TextButton((Looper.WIDTH - Button.standard_width)/2,50,"calculate_combination",this);
		this.buttons.add(calculate_combination);
		
		this.clear_button = new ClearButton((Looper.WIDTH - Button.standard_width)/2,100,"clear",this);
		this.buttons.add(clear_button);
		
	}

}
