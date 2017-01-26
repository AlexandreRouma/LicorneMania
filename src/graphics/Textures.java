/*
 * File Name: Textures.java
 * Code by:   Alexandre Rouma
 * Date:      16 juin 2016
 * Time:      21:54:14
 */
package graphics;

import java.io.IOException;

import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;
import org.newdawn.slick.util.ResourceLoader;

public class Textures {
	
	public static Texture UnicornA;
	public static Texture UnicornB;
	public static Texture menuBack;
	public static Texture sky;
	public static Texture grass;
	public static Texture dirt;
	public static Texture water;
	public static Texture water2;
	public static Texture water3;
	public static Texture water4;
	public static Texture lava;
	public static Texture lava2;
	public static Texture lava3;
	public static Texture lava4;
	public static Texture endgate;
	public static Texture sand;
	public static Texture coin;
	public static Texture coin2;
	public static Texture coin3;
	public static Texture coin4;
	public static Texture heartempty;
	public static Texture heartfull;
	
	public static void load(){
		try {
			UnicornA = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/UnicornA.png"));
			UnicornB = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/UnicornB.png"));
			menuBack = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/MenuBack.png"));
			sky = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/Sky.png"));
			grass = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/grass.png"));
			water = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/water_1.png"));
			water2 = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/water_3.png"));
			water3 = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/water_2.png"));
			water4 = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/water_4.png"));
			lava = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/lava_1.png"));
			lava2 = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/lava_2.png"));
			lava3 = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/lava_3.png"));
			lava4 = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/lava_4.png"));
			endgate = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/endgate.png"));
			dirt = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/dirt.png"));
			sand = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/sand.png"));
			coin = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/coin_1.png"));
			coin2 = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/coin_2.png"));
			coin3 = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/coin_3.png"));
			coin4 = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/coin_4.png"));
			heartempty = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/heartempty.png"));
			heartfull = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/heartfull.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}