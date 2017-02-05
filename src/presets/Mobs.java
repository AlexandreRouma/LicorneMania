/*
 * File Name: Mobs.java
 * Code by:   Alexandre Rouma
 * Date:      1 juil. 2016
 * Time:      17:20:38
 */

package presets;

import graphics.Entity;
import graphics.Textures;
import physics.Hitbox;

public class Mobs {
	
	public static Entity Player(int x, int y){
		Entity entity = new Entity(Textures.unicorn, x, y, 128, 128);
		entity.textures[1] = Textures.unicorn2;
		entity.isAffectedByPhysics = true;
		entity.currentHitbox = new Hitbox(16,0,75,128);
		entity.hitboxes[0] = entity.currentHitbox;
		entity.hitboxes[1] = new Hitbox(37,0,75,128);
		entity.name = "PLAYER";
		entity.isPlayer = true;
		return entity;
	}
	
}
