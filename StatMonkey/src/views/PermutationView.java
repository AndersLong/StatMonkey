package views;

import java.awt.Graphics;

import gfx.ActionButton;
import gfx.Button;
import gfx.ClearButton;
import gfx.TextButton;
import gfx.View;
import logic_managers.PermutationCalc;
import views_engine.VIEW_ID;

public class PermutationView extends View
{

	public Button permutation_to_home,
	              calculate_permutation,
	              clear_button;

	public PermutationView() 
	{
		this.view_id = VIEW_ID.PERMUTATION;
		this.logic_manager = new PermutationCalc();		
	}
	
	@Override
	public void init_buttons() 
	{
		this.permutation_to_home = new ActionButton(300,400,100,50,"back",VIEW_ID.HOME,this);
		this.buttons.add(permutation_to_home);
		
		this.calculate_permutation = new TextButton(100,100,100,50,"calculate_permutation",this);
		this.buttons.add(calculate_permutation);
		
		this.clear_button = new ClearButton(50,300,100,50,"clear",this);
		this.buttons.add(clear_button);
		
	}

	public void draw(Graphics graphics)
	{
		for(Button button : buttons)
		{
			button.draw(graphics);
		}
		
	}
	
}
