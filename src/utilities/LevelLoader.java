/*
 * File Name: LevelLoader.java
 * Code by:   Alexandre Rouma
 * Date:      1 juil. 2016
 * Time:      18:16:12
 */
package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import graphics.Renderer;
import presets.Backgrounds;
import presets.Blocks;
import presets.Items;

public class LevelLoader {
	public static void load(String file){
		Renderer.clearEntity();
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
		    String line;
		    line = br.readLine();
		    if (line.contains("SKY")){
		    	Renderer.addEntity(Backgrounds.Sky());
		    }
		    else if (line.contains("FOREST")){
		    	
		    }
		    else{
		    	
		    }
		    while ((line = br.readLine()) != null) {
		       String args[] = line.split(" ");
		       int id = Integer.parseInt(args[0]);
		       int x = Integer.parseInt(args[1]);
		       int y = Integer.parseInt(args[2]);
		       switch (id){
		       case 0:
		    	   Renderer.addEntity(Blocks.Grass(x, y));
		    	   break;
		       case 1:
		    	   Renderer.addEntity(Blocks.Water(x, y));
		    	   break;
		       case 2:
		    	   Renderer.addEntity(Blocks.Lava(x, y));
		    	   break;
		       case 3:
		    	   Renderer.addEntity(Blocks.EndGate(x, y));
		    	   break;
		       case 4:
		    	   Renderer.addEntity(Blocks.Dirt(x, y));
		    	   break;
		       case 5:
		    	   Renderer.addEntity(Blocks.Sand(x, y));
		    	   break;
		       case 6:
		    	   Renderer.addEntity(Items.Coin(x, y));
		    	   break;
		       }
		    }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
