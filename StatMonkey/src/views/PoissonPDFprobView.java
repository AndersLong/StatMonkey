package views;

import cor.Looper;
import gfx.ActionButton;
import gfx.Button;
import gfx.ClearButton;
import gfx.TextButton;
import gfx.View;
import logic_managers.PoissonpPDFManager;
import views_engine.VIEW_ID;

public class PoissonPDFprobView extends View
{


	public Button poisson_prob_pdf_to_home,
				  calculate_poisson_pdf_prob,
				  clear_button;

	public PoissonPDFprobView() 
	{
		this.view_id = VIEW_ID.POISSON_PDF;
		this.logic_manager = new PoissonpPDFManager();		
	}

	@Override
	public void init_buttons() 
	{
		this.poisson_prob_pdf_to_home = new ActionButton((Looper.WIDTH - Button.standard_width)/2,150,"back",VIEW_ID.HOME,this);
		this.buttons.add(poisson_prob_pdf_to_home);

		this.calculate_poisson_pdf_prob = new TextButton((Looper.WIDTH - Button.standard_width)/2,50,"calculate probability",this);
		this.buttons.add(calculate_poisson_pdf_prob);

		this.clear_button = new ClearButton((Looper.WIDTH - Button.standard_width)/2,100,"clear",this);
		this.buttons.add(clear_button);

	}
}
