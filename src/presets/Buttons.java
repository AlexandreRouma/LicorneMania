/*
 * File Name: Buttons.java
 * Code by:   Alexandre Rouma
 * Date:      4 févr. 2017
 * Time:      22:05:09
 */
package presets;

import org.newdawn.slick.opengl.Texture;

import graphics.Entity;
import physics.Hitbox;

public class Buttons {
	public static Entity Button(int x, int y, int width, int height, Texture textureNormal,Texture texturePressed){
		Entity entity = new Entity(textureNormal, x, y, textureNormal.getImageWidth(), textureNormal.getImageHeight());
		entity.currentHitbox = new Hitbox(0, 0, width, height);
		entity.textures[1] = texturePressed;
		entity.isAnimated = false;
		entity.isAffectedByPhysics = false;
		return entity;
	}
}
