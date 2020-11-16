package gfx;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import cor.Looper;
import ipt.Menu;
import logic_managers.LogicManager;
import views_engine.VIEW_ID;

public abstract class View {

	public ArrayList<Button> buttons;
	public VIEW_ID view_id;
	public LogicManager logic_manager;
	public String lower_string;

	public View() {
		buttons = new ArrayList<Button>();
		lower_string = "";
	}

	public abstract void init_buttons();

	public void draw(Graphics graphics) 
	{
		if(Menu.current_view == this) 
		{
			for(Button button : buttons) 
			{
				button.draw(graphics);
			}
		}
		graphics.setColor(Color.GREEN);
		graphics.drawString(lower_string, 40, Looper.HEIGHT - 40);
	}

	protected void reset() 
	{
		for(Button button : buttons) 
		{
			button.reset();
		}
	}

}
