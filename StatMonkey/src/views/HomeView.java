package views;

import java.awt.Graphics;

import cor.Looper;
import gfx.ActionButton;
import gfx.Button;
import gfx.View;
import views_engine.VIEW_ID;

public class HomeView extends View
{
	
	public Button home_to_sample_analysis,
				  home_to_permutation,
				  home_to_combination,
				  home_to_binary_pmf,
				  home_to_binary_cdf,
				  home_to_binary_analysis;
	
	
	public HomeView() 
	{
		this.view_id = VIEW_ID.HOME;
	}
	
	public void init_buttons() 
	{
		this.home_to_sample_analysis = new ActionButton((Looper.WIDTH - Button.standard_width)/2,50,"sample analysis",VIEW_ID.SAMPLE,this);
		this.buttons.add(home_to_sample_analysis);
		
		this.home_to_permutation = new ActionButton((Looper.WIDTH - Button.standard_width)/2,100,"permutation calculator",VIEW_ID.PERMUTATION,this);
		this.buttons.add(home_to_permutation);
		
		this.home_to_combination = new ActionButton((Looper.WIDTH - Button.standard_width)/2,150,"combination calculator",VIEW_ID.COMBINATION,this);
		this.buttons.add(home_to_combination);
		
		this.home_to_binary_pmf = new ActionButton((Looper.WIDTH - Button.standard_width)/2,200, "binary distribution pmf calculator",VIEW_ID.BINARY_PMF,this);
		this.buttons.add(home_to_binary_pmf);
		
		this.home_to_binary_cdf = new ActionButton((Looper.WIDTH - Button.standard_width)/2,250, "binary distribution cdf calculator",VIEW_ID.BINARY_CDF,this);
		this.buttons.add(home_to_binary_cdf);
		
		this.home_to_binary_analysis = new ActionButton((Looper.WIDTH - Button.standard_width)/2,300, "binary RV analysis",VIEW_ID.BINARY_ANALYSIS,this);
		this.buttons.add(home_to_binary_analysis);
	}


}
