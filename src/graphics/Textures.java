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
	public static Texture coin;
	public static Texture coin2;
	public static Texture coin3;
	public static Texture coin4;
	public static Texture dirt;
	public static Texture endgate;
	public static Texture grass;
	public static Texture heart;
	public static Texture heart2;
	public static Texture lava;
	public static Texture lava2;
	public static Texture lava3;
	public static Texture lava4;
	public static Texture menuBack;
	public static Texture playButton;
	public static Texture playButton2;
	public static Texture sand;
	public static Texture sky;
	public static Texture test;
	public static Texture unicorn;
	public static Texture unicorn2;
	public static Texture water;
	public static Texture water2;
	public static Texture water3;
	public static Texture water4;
	
	public static void load(){
		try {
			coin = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/textures/coin.png"));
			coin2 = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/textures/coin2.png"));
			coin3 = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/textures/coin3.png"));
			coin4 = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/textures/coin4.png"));
			dirt = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/textures/dirt.png"));
			endgate = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/textures/endgate.png"));
			grass = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/textures/grass.png"));
			heart = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/textures/heartempty.png"));
			heart2 = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/textures/heartfull.png"));
			lava = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/textures/lava.png"));
			lava2 = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/textures/lava2.png"));
			lava3 = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/textures/lava3.png"));
			lava4 = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/textures/lava4.png"));
			menuBack = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/textures/menuBack.png"));
			playButton = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/textures/playButton.png"));
			playButton2 = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/textures/playButton2.png"));
			sand = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/textures/sand.png"));
			sky = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/textures/sky.png"));
			test = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/textures/test.png"));
			unicorn = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/textures/unicorn.png"));
			unicorn2 = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/textures/unicorn2.png"));
			water = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/textures/water.png"));
			water2 = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/textures/water2.png"));
			water3 = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/textures/water3.png"));
			water4 = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/textures/water4.png"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}