package gfx;

import java.awt.Color;
import java.awt.Graphics;

public class ClearButton extends Button
{

	public ClearButton(int x, int y, int w, int h, String title, View view) 
	{
		super(x, y, w, h, title, view);
	}

	public void action() 
	{
		this.view.reset();		
	}

	public void paint(Graphics graphics) 
	{
		graphics.setColor(Color.WHITE);
		graphics.fillRect(x,y,w,h);
		graphics.setColor(Color.BLACK);
		graphics.drawString(title,x,y+30);
	}

	protected void reset() {}

}
