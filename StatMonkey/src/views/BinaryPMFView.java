package views;

import java.awt.Graphics;

import gfx.ActionButton;
import gfx.Button;
import gfx.ClearButton;
import gfx.TextButton;
import gfx.View;
import logic_managers.BinaryPermutationCalc;
import views_engine.VIEW_ID;

public class BinaryPMFView extends View{
	
	public Button binary_PMF_to_home,
	  			  calculate_PMF_data,
	  			  clear_button;
	
	public BinaryPMFView() 
	{
		this.view_id = VIEW_ID.BINARY_PMF;
		this.logic_manager = new BinaryPermutationCalc();	
	}

	
	public void init_buttons() {
		
		this.binary_PMF_to_home = new ActionButton(300,400,100,50,"back",VIEW_ID.HOME,this);
		this.buttons.add(binary_PMF_to_home);
		
		this.calculate_PMF_data = new TextButton(100,100,100,50,"calculate probability",this);
		this.buttons.add(calculate_PMF_data);
		
		this.clear_button = new ClearButton(50,300,100,50,"clear",this);
		this.buttons.add(clear_button);
		
	}

	
	public void draw(Graphics graphics) {
		for(Button button : buttons)
		{
			button.draw(graphics);
		}
		
	}

}
