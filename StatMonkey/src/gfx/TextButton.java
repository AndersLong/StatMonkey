package gfx;

import java.awt.Color;
import java.awt.Graphics;

import cor.Looper;
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

	
	public void action() 
	{
		if(Menu.focus != this) 
		{
			Menu.focus = this;
			
		}
		
	}
	
	public void give_data_to_view()
	{
		this.view.lower_string = view.logic_manager.get_output_string(data);
		this.data = "";
	}


	public void paint(Graphics graphics) 
	{
		graphics.setColor(Color.WHITE);
		graphics.fillRect(x,y,w,h);
		graphics.setColor(Color.GREEN);
		graphics.drawString(title,(Looper.WIDTH - graphics.getFontMetrics().stringWidth(title))/2,y);
		graphics.drawString(data,(Looper.WIDTH - graphics.getFontMetrics().stringWidth(data))/2,y+20);
		
	}
	
	protected void reset() 
	{
		this.data = "";
	}

}
