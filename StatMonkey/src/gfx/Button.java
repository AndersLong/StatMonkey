package gfx;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

import ipt.Menu;

public abstract class Button {

	protected int x,y,w,h;
	protected String title;
	protected View view;

	/**
	 * @param x
	 * @param y
	 * @param w
	 * @param h
	 * @param title
	 */

	public Button(int x, int y, int w, int h, String title,View view) 
	{
		super();
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.title = title;
		this.view = view;
	}

	/**
	 * 
	 * @param e
	 */

	public void check_clicked(MouseEvent e) 
	{
		if(in_dimensions(e) && in_current_view()) 
		{
			action();
		}
	}

	public abstract void action();

	/**
	 * This is a stub
	 * @param g
	 */
	public void draw(Graphics graphics) {
		if(in_current_view()) 
		{
			paint(graphics);
		}
		
	}
	
	public abstract void paint(Graphics graphics);

	private boolean in_current_view() 
	{
		if(Menu.current_view.buttons.contains(this)) 
		{
			return true;
		}else 
		{
			return false;
		}
	}
	
	private boolean in_dimensions(MouseEvent e) 
	{
		if(e.getX() > x && e.getX() < x + w) 
		{
			if(e.getY() > y && e.getY() < y + h) 
			{
				return true;
			}
		}
		return false;
	}



}
