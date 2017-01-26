/*
 * File Name: Mobs.java
 * Code by:   Alexandre Rouma
 * Date:      1 juil. 2016
 * Time:      17:20:38
 */

package presets;

import graphics.Entity;
import graphics.Textures;

public class Mobs {
	
	public static Entity PlayerA(int x, int y){
		Entity entity = new Entity(Textures.UnicornA, 0, 200, 100, 100);
		entity.isAffectedByPhysics = true;
		entity.hitbox.setY(0);
		entity.hitbox.setH(100);
		entity.hitbox.setX(11);
		entity.hitbox.setW(60);
		entity.name = "PLAYERA";
		entity.isPlayer = true;
		return entity;
	}
	
	public static Entity PlayerB(int x, int y){
		Entity entity = new Entity(Textures.UnicornB, 0, 200, 100, 100);
		entity.isAffectedByPhysics = true;
		entity.hitbox.setX(29);
		entity.hitbox.setW(60);
		entity.name = "PLAYERB";
		entity.isPlayer = true;
		return entity;
	}
	
}
