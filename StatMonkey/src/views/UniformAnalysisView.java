package views;

import cor.Looper;
import gfx.ActionButton;
import gfx.Button;
import gfx.ClearButton;
import gfx.TextButton;
import gfx.View;
import logic_managers.BinaryAnalysisManager;
import logic_managers.UniformAnalysisManager;
import views_engine.VIEW_ID;

public class UniformAnalysisView extends View
{

	public Button uniform_analysis_to_home,
				  analyze,
				  clear_button;

	public UniformAnalysisView() 
	{
		this.view_id = VIEW_ID.UNIFORM_ANALYSIS;
		this.logic_manager = new UniformAnalysisManager();	
		this.upper_string = "usage: |A|B|";
	}


	public void init_buttons() {

		this.uniform_analysis_to_home = new ActionButton((Looper.WIDTH - Button.standard_width)/2,150,"back",VIEW_ID.HOME,this);
		this.buttons.add(uniform_analysis_to_home);

		this.analyze = new TextButton((Looper.WIDTH - Button.standard_width)/2,50,"analyze",this);
		this.buttons.add(analyze);

		this.clear_button = new ClearButton((Looper.WIDTH - Button.standard_width)/2,100,"clear",this);
		this.buttons.add(clear_button);

	}
}
