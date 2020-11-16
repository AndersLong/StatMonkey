package cor;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import gfx.Window;
import ipt.Menu;
import views_engine.VIEW_ID;
import views_engine.Views;




/**
 * 
 * @author Ander
 * This class contains the game loop, It's primary function
 * is to instantiate all the ap data and then loop over the data until
 * the program is killed
 */

public class Looper implements Runnable{
	
	/**
	 * All the big game components
	 */

	

	private boolean running;
	private double pauseTime;
	private Canvas canvas;
	private Window window;
	public static int WIDTH,HEIGHT;
	private Menu menu;
	Views view; 

	/*
	 * Preps the thread
	 */
	
	public void start() {
		Thread thread = new Thread(this);
		thread.start();
	}
	
	/*
	 * Instantiates all the important variables
	 */

	private void init() {
		this.running = true;
		this.pauseTime = 1000.0/60;
		this.canvas = new Canvas();
		this.WIDTH = 640;
		this.HEIGHT = 640;
		window = new Window(canvas,"ENGINE",WIDTH,HEIGHT);
		canvas.requestFocus();
		menu = new Menu();
		view = new Views();
		menu.current_view = Views.get_view_with_id(VIEW_ID.HOME);
		canvas.addMouseListener(menu);
		canvas.addKeyListener(menu);
		
 	}
	
	/*
	 * This is the game loop. The actual state management occurs in the
	 * updater and drawer objects
	 */
	
	public void run() 
	{
		this.init();
		while(running) 
		{
			draw();
			this.pause();
		}
		System.exit(0);

	}
	
	public void draw() 
	{
		if(canvas.getBufferStrategy() == null) 
		{
			canvas.createBufferStrategy(3);			
		}
		BufferStrategy buffer_strategy = canvas.getBufferStrategy();
		Graphics graphics = buffer_strategy.getDrawGraphics();
		graphics.setColor(Color.BLACK);
		graphics.fillRect(0,0,WIDTH,HEIGHT);
		try {
			Menu.current_view.draw(graphics);
		}catch(NullPointerException e) {
			this.pause();
		}
		buffer_strategy.show();
		graphics.dispose();
		
		
	}
	
	/*
	 * Gotta get that sweet sweet framerate man
	 */

	public void pause() {
		try {
			Thread.sleep((long)pauseTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}



}