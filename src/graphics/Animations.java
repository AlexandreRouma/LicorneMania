/*
 * File Name: Animations.java
 * Code by:   Alexandre Rouma
 * Date:      2 juil. 2016
 * Time:      13:09:26
 */

package graphics;

import java.util.ArrayList;

public class Animations {
	
	private static boolean running = true;
	
	static Runnable runnable = new Runnable(){
		public void run(){
			while(running){
				ArrayList<Entity> entities = Renderer.getEntities();
				for (int i = 0; i < entities.size(); i++){
					Entity entity = entities.get(i);
					if (entity.isAnimated){
						switch (entity.frame){
						case 0:
							entity.setTexture(entity.textures[0]);
							entity.frame = 1;
							break;
						case 1:
							entity.setTexture(entity.textures[1]);
							entity.frame = 2;
							break;
						case 2:
							entity.setTexture(entity.textures[2]);
							entity.frame = 3;
							break;
						case 3:
							entity.setTexture(entity.textures[3]);
							entity.frame = 0;
							break;
						}
					}
				}
				try {
					Thread.sleep(250);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	};
	
    static Thread thread = new Thread(runnable);
    
	public static void start(){
		running = true;
		thread.start();
	}
	
    public static void stop(){
		running = false;
	}
	
}
