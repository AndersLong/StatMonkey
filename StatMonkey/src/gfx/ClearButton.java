package gfx;

import java.awt.Color;
import java.awt.Graphics;

import cor.Looper;

public class ClearButton extends Button
{

	public ClearButton(int x, int y, int w, int h, String title, View view) 
	{
		super(x, y, w, h, title, view);
	}
	
	public ClearButton(int x, int y, String title, View view) 
	{
		super(x, y, title, view);
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
		graphics.drawString(title,(Looper.WIDTH - graphics.getFontMetrics().stringWidth(title))/2,y+30);
	}

	protected void reset() {}

}
