/*
 * File Name: ImageDrawer.java
 * Code by:   Alexandre Rouma
 * Date:      2 juil. 2016
 * Time:      19:38:24
 */
package utilities;

import org.newdawn.slick.opengl.Texture;

import graphics.Entity;
import graphics.Renderer;

public class ImageDrawer {
	
	public static Entity drawImage(Texture image, int x, int y){
		Entity entity = new Entity(image,x,y,image.getImageWidth(),image.getImageHeight());
		entity.setAffectedByPhysics(false);
		entity.isAnimated = false;
		entity.isPlayer = false;
		entity.isSolid = false;
		entity.name = "GUI";
		Renderer.addEntity(entity);
		return entity;
	}
	
}
