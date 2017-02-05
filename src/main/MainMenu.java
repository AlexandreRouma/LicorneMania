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
import graphics.Textures;
import presets.Backgrounds;
import presets.Buttons;
     
public class MainMenu {
	
	public static boolean running;
	
	public static void display(){
		running = true;
		Entity background = Backgrounds.MenuBackground();
		Entity playButton = Buttons.Button(261, 213, 278, 54, Textures.playButton, Textures.playButton2);
		Renderer.addEntity(background);
		Renderer.addEntity(playButton);
		
		while(running && !Display.isCloseRequested()){
			Renderer.render();
			if (Keyboard.isKeyDown(Keyboard.KEY_RETURN) || playButton.leftClicked()){
				MainGameLoop.start();
				Renderer.clearEntity();
				background = Backgrounds.MenuBackground();
				Renderer.addEntity(background);
			}
			
			if (playButton.mouseHover() && playButton.currentTexture == playButton.textures[0]){
				
				playButton.currentTexture = playButton.textures[1];
			}
			
			if (!playButton.mouseHover() && playButton.currentTexture == playButton.textures[1]){
				playButton.currentTexture = playButton.textures[0];
			}
			
			DisplayManager.refreshDisplay();
		}
		
	}
	
}
