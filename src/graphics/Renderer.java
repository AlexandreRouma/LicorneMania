/*
 * File Name: Renderer.java
 * Code by:   Alexandre Rouma
 * Date:      16 juin 2016
 * Time:      21:42:21
 */

package graphics;

import java.util.ArrayList;

import org.lwjgl.opengl.GL11;
import org.newdawn.slick.Color;

import utilities.FPSCounter;

public class Renderer {
	
	public static ArrayList<Entity> entities = new ArrayList<Entity>();
	
	public static void render(){
		GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
		Color.white.bind();
		
		for (int i = 0; i < entities.size(); i++){
			Entity entity = entities.get(i);
			entity.getTexture().bind();
	        
	        GL11.glBegin(GL11.GL_QUADS);
	            GL11.glTexCoord2f(0,0);
	            GL11.glVertex2f(entity.getX() - Camera.getX(),entity.getY() - Camera.getY());
	            GL11.glTexCoord2f(1,0);
	            GL11.glVertex2f(entity.getX() - Camera.getX()+entity.getW(),entity.getY() - Camera.getY());
	            GL11.glTexCoord2f(1,1);
	            GL11.glVertex2f(entity.getX() - Camera.getX()+entity.getW(),entity.getY() - Camera.getY()+entity.getH());
	            GL11.glTexCoord2f(0,1);
	            GL11.glVertex2f(entity.getX() - Camera.getX(),entity.getY() - Camera.getY()+entity.getH());
	        GL11.glEnd();
		}
		
		FPSCounter.frame();
		
	}
	
	public static void addEntity(Entity entity){
		entities.add(entity);
		entity.setId(entities.indexOf(entity));
	}
	
	public static ArrayList<Entity> getEntities() {
		return entities;
	}

	public static void removeEntity(Entity entity){
		entities.remove(entity);
	}
	
	public static int getEntityNumber(){
		return entities.size();
	}
	
	public static void clearEntity(){
		entities.clear();
		entities = new ArrayList<Entity>();
	}
	
}
