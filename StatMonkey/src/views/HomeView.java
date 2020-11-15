package views;

import java.awt.Graphics;

import gfx.ActionButton;
import gfx.Button;
import gfx.View;
import views_engine.VIEW_ID;

public class HomeView extends View
{
	
	public Button home_to_sample_analysis,
				  home_to_permutation,
				  home_to_combination,
				  home_to_binary_pmf;
	
	
	public HomeView() 
	{
		this.view_id = VIEW_ID.HOME;
	}
	
	public void init_buttons() 
	{
		this.home_to_sample_analysis = new ActionButton(50,100,100,50,"sample analysis",VIEW_ID.SAMPLE,this);
		this.buttons.add(home_to_sample_analysis);
		
		this.home_to_permutation = new ActionButton(50,150,100,50,"permutation calculator",VIEW_ID.PERMUTATION,this);
		this.buttons.add(home_to_permutation);
		
		this.home_to_combination = new ActionButton(50,200,100,50,"combination calculator",VIEW_ID.COMBINATION,this);
		this.buttons.add(home_to_combination);
		
		this.home_to_binary_pmf = new ActionButton(50,250,100,50, "binary distribution pmf calculator",VIEW_ID.BINARY_PMF,this);
		this.buttons.add(home_to_binary_pmf);
	}

	public void draw(Graphics graphics) 
	{
		for(Button button : buttons)
		{
			button.draw(graphics);
		}
		
	}


}
