/*
 * File Name: DeathMenu.java
 * Code by:   Alexandre Rouma
 * Date:      1 juil. 2016
 * Time:      20:17:39
 */
package main;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.newdawn.slick.Color;

import graphics.DisplayManager;
import graphics.Entity;
import graphics.Fonts;
import graphics.Renderer;
import presets.Backgrounds;
import utilities.Text;

public class DeathMenu {
	
public static boolean running;
	
	public static void display(String deathMessage){
		running = true;
		Entity background = Backgrounds.Sky();
		Renderer.addEntity(background);
		
		while(running){
			Renderer.render();
			Text.DrawCenteredText(Fonts.calibriBig, deathMessage, 200, Color.red);
			Text.DrawCenteredText(Fonts.calibriBig, "Appuyez sur ENTER pour recommencer ou ESC pour quitter", 250, Color.red);
			if (Keyboard.isKeyDown(Keyboard.KEY_RETURN)){
				running = false;
			}
			if (Display.isCloseRequested()){
				MainMenu.running = false;
				running = false;
			}
			DisplayManager.refreshDisplay();
		}
		
	}
	
}
