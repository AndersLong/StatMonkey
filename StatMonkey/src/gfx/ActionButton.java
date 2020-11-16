package gfx;

import java.awt.Color;
import java.awt.Graphics;

import cor.Looper;
import ipt.Menu;
import views_engine.VIEW_ID;
import views_engine.Views;

public class ActionButton extends Button
{
	private VIEW_ID redirect_view;
	
	public ActionButton(int x, int y, int w, int h, String title, VIEW_ID redirect_view,View view) {
		super(x, y, w, h, title,view);
		this.redirect_view = redirect_view;
	}
	
	public ActionButton(int x, int y,String title, VIEW_ID redirect_view,View view) {
		super(x, y, title,view);
		this.redirect_view = redirect_view;
	}

	public void action() {
		Menu.focus = null;
		Menu.current_view.reset();
		Menu.current_view = Views.get_view_with_id(redirect_view);
		
		
	}

	public void paint(Graphics graphics) {
		graphics.setColor(Color.WHITE);
		graphics.fillRect(x,y,w,h);
		graphics.setColor(Color.BLACK);
		graphics.drawString(title,(Looper.WIDTH - graphics.getFontMetrics().stringWidth(title))/2,y+30);
		
	}
	
	protected void reset() {}
	
}
