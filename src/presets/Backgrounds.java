/*
 * File Name: Backgrounds.java
 * Code by:   Alexandre Rouma
 * Date:      1 juil. 2016
 * Time:      18:56:21
 */
package presets;

import graphics.Entity;
import graphics.Textures;

public class Backgrounds {
	
	public static Entity MenuBackground(){
		Entity entity = new Entity(Textures.menuBack, 0, 0, 1024, 1024);
		entity.isAffectedByPhysics = false;
		entity.name = "MNBACK";
		return entity;
	}
	
	public static Entity Sky(){
		Entity entity = new Entity(Textures.sky, 0, 0, 8000, 480);
		entity.isAffectedByPhysics = false;
		entity.name = "SKY";
		return entity;
	}
	
}
