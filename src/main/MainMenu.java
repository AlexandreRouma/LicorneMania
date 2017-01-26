/*
 * File Name: MainMenu.java
 * Code by:   Alexandre Rouma
 * Date:      17 juin 2016
 * Time:      00:17:45
 */
package main;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import graphics.DisplayManager;
import graphics.Entity;
import graphics.Renderer;
import presets.Backgrounds;
     
public class MainMenu {
	
	public static boolean running;
	
	public static void display(){
		running = true;
		Entity background = Backgrounds.MenuBackground();
		Renderer.addEntity(background);
		
		while(running && !Display.isCloseRequested()){
			Renderer.render();
			if (Keyboard.isKeyDown(Keyboard.KEY_RETURN)){
				MainGameLoop.start();
				Renderer.clearEntity();
				background = Backgrounds.MenuBackground();
				Renderer.addEntity(background);
			}
			
			DisplayManager.refreshDisplay();
		}
		
	}
	
}
