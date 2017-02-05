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
	
	public static Entity Player(int x, int y){
		Entity entity = new Entity(Textures.unicorn, x, y, 128, 128);
		entity.textures[1] = Textures.unicorn2;
		entity.isAffectedByPhysics = true;
		entity.currentHitbox.x = 11;
		entity.currentHitbox.y = 0;
		entity.currentHitbox.width = 106;
		entity.currentHitbox.height = 128;
		entity.name = "PLAYER";
		entity.isPlayer = true;
		return entity;
	}
	
}
