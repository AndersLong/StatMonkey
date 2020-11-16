package gfx;

import java.awt.Color;
import java.awt.Graphics;

import ipt.Menu;
import logic_managers.LogicManager;

public class TextButton extends Button{
	
	public String data;

	public TextButton(int x, int y, int w, int h, String title, View view) 
	{
		super(x, y, w, h, title, view);
		data = "";
	}
	
	public TextButton(int x, int y, String title, View view) 
	{
		super(x, y, title, view);
		data = "";
	}

	
	public void action() {
		if(Menu.focus != this) 
		{
			Menu.focus = this;
			
		}
		else 
		{
			this.view.lower_string = view.logic_manager.get_output_string(data);
			this.data = "";
		}
		
	}


	public void paint(Graphics graphics) {
		graphics.setColor(Color.WHITE);
		graphics.fillRect(x,y,w,h);
		graphics.setColor(Color.GREEN);
		graphics.drawString(title,x,y);
		graphics.drawString(data,x,y+20);
		
	}
	
	protected void reset() 
	{
		this.data = "";
	}

}
