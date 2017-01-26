/*
 * File Name: Main.java
 * Code by:   Alexandre Rouma
 * Date:      16 juin 2016
 * Time:      21:24:35
 */

package main;

import graphics.Animations;
import graphics.DisplayManager;
import graphics.Fonts;
import graphics.Textures;
import physics.Physic;
import utilities.FPSCounter;

public class Main {

	public static void main(String[] args) { // Main game loop
		
		DisplayManager.createDisplay("Licorne Mania", 800, 480, false, true);
		Fonts.load();
		Textures.load();
		FPSCounter.start();
		Animations.start();
		Physic.init();
		MainMenu.display();
		// Game !!!
		FPSCounter.stop();
		Animations.stop();
		Physic.stop();
		
	}

}