package gfx;

import java.awt.Graphics;
import java.util.ArrayList;

import logic_managers.LogicManager;
import views_engine.VIEW_ID;

public abstract class View {
	
	public ArrayList<Button> buttons;
	public VIEW_ID view_id;
	public LogicManager logic_manager;
	
	public View() {
		buttons = new ArrayList<Button>();
	}
	
	public abstract void init_buttons();
	
	public abstract void draw(Graphics graphics);
	
	protected void reset() 
	{
		for(Button button : buttons) 
		{
			button.reset();
		}
	}
	
}
