package views;

import java.awt.Graphics;

import gfx.ActionButton;
import gfx.Button;
import gfx.View;
import views_engine.VIEW_ID;

public class HomeView extends View
{
	
	public Button home_to_sample_analysis,
				  home_to_permutation;
	
	
	public HomeView() 
	{
		this.view_id = VIEW_ID.HOME;
	}
	
	public void init_buttons() 
	{
		this.home_to_sample_analysis = new ActionButton(50,100,100,50,"sample analysis",VIEW_ID.SAMPLE);
		this.buttons.add(home_to_sample_analysis);
		
		this.home_to_permutation = new ActionButton(50,150,100,50,"permutation calculator",VIEW_ID.PERMUTATION);
		this.buttons.add(home_to_permutation);
	}

	public void draw(Graphics graphics) 
	{
		for(Button button : buttons)
		{
			button.draw(graphics);
		}
		
	}

}