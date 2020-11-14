package gfx;

import java.awt.Graphics;
import java.util.ArrayList;

import views_engine.VIEW_ID;

public abstract class View {
	
	public ArrayList<Button> buttons;
	public VIEW_ID view_id;
	
	public View() {
		buttons = new ArrayList<Button>();
	}
	
	public abstract void init_buttons();
	
	public abstract void draw(Graphics graphics);
	
}
