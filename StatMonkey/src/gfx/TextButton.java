package gfx;

import java.awt.Color;
import java.awt.Graphics;

import ipt.Menu;

public class TextButton extends Button{
	
	public String data;

	public TextButton(int x, int y, int w, int h, String title) 
	{
		super(x, y, w, h, title);
		data = "";
	}

	
	public void action() {
		if(Menu.focus != this) 
		{
			Menu.focus = this;
			
		}
		else 
		{
			Menu.focus = null;
		}
		
	}


	public void paint(Graphics graphics) {
		graphics.setColor(Color.WHITE);
		graphics.fillRect(x,y,w,h);
		graphics.setColor(Color.GREEN);
		graphics.drawString(data,x,y);
		
	}

}
