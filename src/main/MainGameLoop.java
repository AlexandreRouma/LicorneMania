/*
 * File Name: MainGameLoop.java
 * Code by:   Alexandre Rouma
 * Date:      17 juin 2016
 * Time:      00:02:58
 */

package main;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import graphics.Camera;
import graphics.DisplayManager;
import graphics.Entity;
import graphics.Fonts;
import graphics.Renderer;
import graphics.Textures;
import physics.Physic;
import presets.Mobs;
import utilities.LevelLoader;

public class MainGameLoop {
	
	public static boolean running;
	
	public static void start(){
		
		Renderer.clearEntity();
		running = true;
		int points = 0;
		Entity caracter = Mobs.PlayerA(0,200);
		LevelLoader.load("C:/tmp/test.txt");
		Renderer.addEntity(caracter);
		while (running){
			Renderer.render();
			Fonts.calibriSmall.drawString(0, 0, "" + points);
			if (Keyboard.isKeyDown(Keyboard.KEY_SPACE)){
				if (Physic.getEntityThatEntityIsInside(caracter).name == "WATER"){
					caracter.isJumping = true;
				}
				else if(caracter.getY() + caracter.hitbox.getY() + caracter.hitbox.getH() == Physic.groundLevel){
					caracter.isJumping = true;
				}
			}
			
			if (Keyboard.isKeyDown(Keyboard.KEY_Q)){
				if (caracter.getTexture() == Textures.UnicornA){
					caracter.setTexture(Mobs.PlayerB(0,0).getTexture());
					caracter.hitbox = Mobs.PlayerB(0,0).hitbox;
				}
				if (caracter.getX() + 50 > 404){
					Camera.move(-4, 0);
				}
				if (caracter.getX() > 3){
					caracter.move(-4, 0);
				}
			}
			
			if (Keyboard.isKeyDown(Keyboard.KEY_D)){
				if (caracter.getTexture() == Textures.UnicornB){
					caracter.setTexture(Textures.UnicornA);
				}
				if (caracter.getX() + 50 > 400){
					Camera.move(4, 0);
				}
				caracter.move(4, 0);
			}
			
			Entity entityImInside = Physic.getEntityThatEntityIsInside(caracter);
			
			if (entityImInside.name == "LAVA"){
				Renderer.clearEntity();
				Camera.setX(0);
				Camera.setY(0);
				DeathMenu.display("La lave, sa brule !");
				running = false;
			}
			
			if (entityImInside.name == "ENDGATE"){
				Renderer.clearEntity();
				Camera.setX(0);
				Camera.setY(0);
				DeathMenu.display("T'A GAGNE !!!!!!!");
				running = false;
			}
			
			if (entityImInside.name == "COIN"){
				Renderer.removeEntity(entityImInside);
				points++;
			}
			
			if (caracter.getY() > 480){
				Renderer.clearEntity();
				Camera.setX(0);
				Camera.setY(0);
				DeathMenu.display("T'est tombé comme une merde");
				running = false;
			}
			
			DisplayManager.refreshDisplay();
			if (Display.isCloseRequested()){
				MainMenu.running = false;
				running = false;
			}
		}
		
		Renderer.clearEntity();
		Camera.setX(0);
		Camera.setY(0);
		
	}
	
}
