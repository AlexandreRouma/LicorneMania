/*
 * File Name: Physic.java
 * Code by:   Alexandre Rouma
 * Date:      17 juin 2016
 * Time:      11:37:24
 */
package physics;

import java.util.ArrayList;

import graphics.Entity;
import graphics.Renderer;
import presets.Blocks;
import utilities.Positions;

public class Physic {
	
	public static int groundLevel = 480;
	public static int leftLimit = 8000;
	public static int rightLimit = 0;
	private static boolean isRunning;
	public static int jumpHeight = 120;
	
	static Runnable runnable = new Runnable(){
		public void run(){
			while(isRunning){
				ArrayList<Entity> entities = Renderer.getEntities();
				for (int i = 0; i < entities.size(); i++){
					Entity entity = entities.get(i);
					boolean isInWater = (Physic.getEntityThatEntityIsInside(entity).name == "WATER");
					if (entity.isAffectedByPhysics){
						groundLevel = getHeightUnderEntity(entity);
						if (entity.getY() + entity.getH() < groundLevel){
							entity.move(0, 1);
						}
						
					}
					
					if (isInWater){
						jumpHeight = 50;
					}
					else{
						jumpHeight = 120;
					}
					
					if (entity.isJumping){
						if (isInWater){		
							entity.isAffectedByPhysics = false;
							if (entity.getY() + entity.getW() < entity.getY() - jumpHeight){
								entity.isJumping = false;
								entity.isAffectedByPhysics = true;
							}
							else{
								entity.move(0, -1);
								entity.isAffectedByPhysics = false;
							}
						}
						else{
							entity.isAffectedByPhysics = false;
							if (entity.getY() + entity.getW() < groundLevel - jumpHeight){
								entity.isJumping = false;
								entity.isAffectedByPhysics = true;
							}
							else{
								entity.move(0, -1);
								entity.isAffectedByPhysics = false;
							}
						}
					}
					
				}
				try {
					Thread.sleep(2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	};
	
	static Thread thread = new Thread(runnable);
	
	public static void init(){
		isRunning = true;
		thread.start();
	}
	
	public static void stop(){
		isRunning = false;
	}
	
	private static int getHeightUnderEntity(Entity mob){
		int maxy = 600;
		ArrayList<Entity> entities = Renderer.getEntities();
		for (int i = 0; i < entities.size(); i++){
			Entity entity = entities.get(i);
			if ((Positions.isBetween(mob.HLX(), entity.HLX(), entity.HRX()) || Positions.isBetween(mob.HRX(), entity.HLX(), entity.HRX())) && mob.HLY() <= entity.HUY() && entity.getIsbackground() == false && entity.isSolid == true){
				if (entity.getY() < maxy){
					maxy = entity.getY() + entity.getHitbox().getY();
				}
			}
		}
		return maxy;
	}
	
	public static Entity getEntityUnderEntity(Entity mob){
		int maxy = 600;
		Entity finalEntity = null;
		ArrayList<Entity> entities = Renderer.getEntities();
		for (int i = 0; i < entities.size(); i++){
			Entity entity = entities.get(i);
			if ((Positions.isBetween(mob.HLX(), entity.HLX(), entity.HRX()) || Positions.isBetween(mob.HRX(), entity.HLX(), entity.HRX())) && mob.HLY() <= entity.HUY() && entity.getIsbackground() == false){
				if (entity.getY() < maxy){
					maxy = entity.getY() + entity.getHitbox().getY();
					finalEntity = entity;
				}
			}
		}
		return finalEntity;
	}
	
	public static Entity getEntityThatEntityIsInside(Entity mob){
	    Entity finalEntity = Blocks.Air(0,0);
		ArrayList<Entity> entities = Renderer.getEntities();
		for (int i = 0; i < entities.size(); i++){
			Entity entity = entities.get(i);
			if ((Positions.isBetween(mob.HLX(), entity.HLX(), entity.HRX()) || Positions.isBetween(mob.HRX(), entity.HLX(), entity.HRX())) && (Positions.isBetween(mob.HUY(), entity.HUY(), entity.HLY()) || Positions.isBetween(mob.HLY(), entity.HUY(), entity.HLY())) && entity.getIsbackground() == false && entity.isPlayer == false){
				finalEntity = entity;
			}
		}
		return finalEntity;
	}
	
}
