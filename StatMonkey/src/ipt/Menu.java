package ipt;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import gfx.Button;
import gfx.TextButton;
import gfx.View;

public class Menu implements MouseListener, KeyListener
{
	public static View current_view;
	public static TextButton focus;
	
	public Menu() 
	{
		focus = null;
	}

	public void mouseClicked(MouseEvent e) 
	{
		for(Button button : current_view.buttons) 
		{
			button.check_clicked(e);
		}
		
	}

	public void mousePressed(MouseEvent e) {		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		switch(e.getKeyChar())
		{
		case ' ':
			this.focus.data += e.getKeyChar();
			break;
		case '0':
			this.focus.data += e.getKeyChar();
			break;
		case '1':
			this.focus.data += e.getKeyChar();
			break;
		case '2':
			this.focus.data += e.getKeyChar();
			break;
		case '3':
			this.focus.data += e.getKeyChar();
			break;
		case '4':
			this.focus.data += e.getKeyChar();
			break;
		case '5':
			this.focus.data += e.getKeyChar();
			break;
		case '6':
			this.focus.data += e.getKeyChar();
			break;
		case '7':
			this.focus.data += e.getKeyChar();
			break;
		case '8':
			this.focus.data += e.getKeyChar();
			break;
		case '9':
			this.focus.data += e.getKeyChar();
			break;
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}

