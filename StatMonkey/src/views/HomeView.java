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
				  home_to_binary_analysis,
				  home_to_poisson_pdf,
				  home_to_poisson_cdf;
	
	
	public HomeView() 
	{
		this.upper_string = "Welcome to StatMonkey! A basic statsolver for UNL STAT 380. Click any of the buttons to proceed.";
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
		
		this.home_to_poisson_pdf = new ActionButton((Looper.WIDTH - Button.standard_width)/2,350, "poisson pdf prob calc",VIEW_ID.POISSON_PDF,this);
		this.buttons.add(home_to_poisson_pdf);
		
		this.home_to_poisson_cdf = new ActionButton((Looper.WIDTH - Button.standard_width)/2,400, "poisson cdf prob calc",VIEW_ID.POISSON_CDF,this);
		this.buttons.add(home_to_poisson_cdf);
	}


}
