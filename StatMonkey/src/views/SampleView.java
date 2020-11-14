package views;

import java.awt.Graphics;

import gfx.ActionButton;
import gfx.Button;
import gfx.View;
import views_engine.VIEW_ID;

public class SampleView extends View
{
	
	public Button sample_analysis_to_home;

	public SampleView() 
	{
		this.view_id = VIEW_ID.SAMPLE;
	}
	
	@Override
	public void init_buttons() 
	{
		this.sample_analysis_to_home = new ActionButton(300,400,100,50,"back",VIEW_ID.HOME);
		this.buttons.add(sample_analysis_to_home);
		
	}

	public void draw(Graphics graphics)
	{
		for(Button button : buttons)
		{
			button.draw(graphics);
		}
		
	}
}
