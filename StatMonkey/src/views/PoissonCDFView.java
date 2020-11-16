package views;

import cor.Looper;
import gfx.ActionButton;
import gfx.Button;
import gfx.ClearButton;
import gfx.TextButton;
import gfx.View;
import logic_managers.PoissonCDFManager;
import views_engine.VIEW_ID;

public class PoissonCDFView  extends View
{

	public Button poisson_CDF_to_home,
				  calculate_CDF_data,
				  clear_button;

	public PoissonCDFView() 
	{
		this.view_id = VIEW_ID.POISSON_CDF;
		this.logic_manager = new PoissonCDFManager();	
		this.upper_string = "usage: |A|t|x|threshold| note for threshold {1: above x | 2: below x | 3: at most | 4: at least }";
	}


	public void init_buttons() {

		this.poisson_CDF_to_home = new ActionButton((Looper.WIDTH - Button.standard_width)/2,150,"back",VIEW_ID.HOME,this);
		this.buttons.add(poisson_CDF_to_home);

		this.calculate_CDF_data = new TextButton((Looper.WIDTH - Button.standard_width)/2,50,"calculate probability",this);
		this.buttons.add(calculate_CDF_data);

		this.clear_button = new ClearButton((Looper.WIDTH - Button.standard_width)/2,100,"clear",this);
		this.buttons.add(clear_button);

	}

}
