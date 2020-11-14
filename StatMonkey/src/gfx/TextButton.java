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

	
	public void action() {
		if(Menu.focus != this) 
		{
			Menu.focus = this;
			
		}
		else 
		{
			System.out.println(this.view);
			System.out.println(this.view.logic_manager);
			System.out.println(this.view.logic_manager.get_output_string(data));
			this.data = this.view.logic_manager.get_output_string(data);
		}
		
	}


	public void paint(Graphics graphics) {
		graphics.setColor(Color.WHITE);
		graphics.fillRect(x,y,w,h);
		graphics.setColor(Color.GREEN);
		graphics.drawString(title,x,y);
		graphics.drawString(data,x,y+20);
		
	}

}
