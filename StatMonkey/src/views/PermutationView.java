package views;

import java.awt.Graphics;

import gfx.ActionButton;
import gfx.Button;
import gfx.View;
import views_engine.VIEW_ID;

public class PermutationView extends View
{

	public Button permutation_to_home;

	public PermutationView() 
	{
		this.view_id = VIEW_ID.PERMUTATION;
	}
	
	@Override
	public void init_buttons() 
	{
		this.permutation_to_home = new ActionButton(300,400,100,50,"back",VIEW_ID.HOME);
		this.buttons.add(permutation_to_home);
		
	}

	public void draw(Graphics graphics)
	{
		for(Button button : buttons)
		{
			button.draw(graphics);
		}
		
	}

}
