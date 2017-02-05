/*
 * File Name: Blocks.java
 * Code by:   Alexandre Rouma
 * Date:      1 juil. 2016
 * Time:      17:33:20
 */
package presets;

import graphics.Entity;
import graphics.Textures;

public class Blocks {
	
	public static Entity Air(int x, int y){
		Entity entity = new Entity(Textures.sky, x, y, 128, 128);
		entity.currentHitbox.y = 0;
		entity.name = "AIR";
		return entity;
	}
	
	public static Entity Grass(int x, int y){
		Entity entity = new Entity(Textures.grass, x, y, 128, 128);
		entity.currentHitbox.y = 10;
		entity.name = "GRASS";
		return entity;
	}
	public static Entity Dirt(int x, int y){
		Entity entity = new Entity(Textures.dirt, x, y, 128, 128);
		entity.currentHitbox.y = 10;
		entity.name = "DIRT";
		return entity;
	}
	
	public static Entity Water(int x, int y){
		Entity entity = new Entity(Textures.water, x, y, 128, 128);
		entity.name = "WATER";
		entity.isSolid = false;
		entity.currentHitbox.y = 40;
		entity.isAnimated = true;
		entity.textures[1] = Textures.water2;
		entity.textures[2] = Textures.water3;
		entity.textures[3] = Textures.water4;
		return entity;
	}
	
	public static Entity Lava(int x, int y){
		Entity entity = new Entity(Textures.lava, x, y, 128, 128);
		entity.name = "LAVA";
		entity.isSolid = false;
		entity.currentHitbox.y = 40;
		entity.isAnimated = true;
		entity.textures[1] = Textures.lava2;
		entity.textures[2] = Textures.lava3;
		entity.textures[3] = Textures.lava4;
		return entity;
	}
	
	public static Entity EndGate(int x, int y){
		Entity entity = new Entity(Textures.endgate, x, y, 128, 128);
		entity.name = "ENDGATE";
		entity.isSolid = false;
		entity.currentHitbox.x = 50;
		entity.currentHitbox.y = 46;
		entity.currentHitbox.height = 75;
		entity.currentHitbox.width = 30;
		return entity;
	}
	
	public static Entity Sand(int x, int y){
		Entity entity = new Entity(Textures.sand, x, y, 128, 128);
		entity.currentHitbox.y = 10;
		entity.name = "DIRT";
		return entity;
	}
	
}
