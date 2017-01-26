/*
 * File Name: Items.java
 * Code by:   Alexandre Rouma
 * Date:      2 juil. 2016
 * Time:      16:35:16
 */
package presets;

import graphics.Entity;
import graphics.Textures;

public class Items {
	
	public static Entity Coin(int x, int y){
		Entity entity = new Entity(Textures.coin, x, y, 32, 32);
		entity.name = "COIN";
		entity.isSolid = false;
		entity.isAnimated = true;
		entity.textures[1] = Textures.coin2;
		entity.textures[2] = Textures.coin3;
		entity.textures[3] = Textures.coin4;
		return entity;
	}
	
}
