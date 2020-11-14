package views;

import java.awt.Graphics;

import gfx.ActionButton;
import gfx.Button;
import gfx.TextButton;
import gfx.View;
import logic_managers.CombinationCalc;
import views_engine.VIEW_ID;

public class CombinationView extends View
{

	public Button combination_to_home,
	              calculate_combination;

	public CombinationView() 
	{
		this.view_id = VIEW_ID.COMBINATION;
		this.logic_manager = new CombinationCalc();		
	}
	
	@Override
	public void init_buttons() 
	{
		this.combination_to_home = new ActionButton(300,400,100,50,"back",VIEW_ID.HOME,this);
		this.buttons.add(combination_to_home);
		
		this.calculate_combination = new TextButton(100,100,100,50,"calculate_combination",this);
		this.buttons.add(calculate_combination);
		
	}

	public void draw(Graphics graphics)
	{
		for(Button button : buttons)
		{
			button.draw(graphics);
		}
		
	}
	
}
