/*
 * File Name: Entity.java
 * Code by:   Alexandre Rouma
 * Date:      16 juin 2016
 * Time:      21:43:11
 */

package graphics;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.opengl.Texture;

import physics.Hitbox;
import utilities.Positions;

public class Entity {
	
	public Texture textures[] = new Texture[4];
	public Texture currentTexture;
	public Hitbox hitboxes[] = new Hitbox[4];
	public Hitbox currentHitbox = new Hitbox(0,0,0,0);
	public int x;
	public int y;
	public int width;
	public int height;
	public int frame;
	public boolean isbackground;
	public String name = "";
	public boolean isAffectedByPhysics = true;
	public boolean isAnimated = false;
	public int id;
	public boolean isJumping;
	public boolean isPlayer = false;
	public boolean isSolid = true;
	public boolean isSolidOnSIdes = false;
	public boolean isStatic = false;
	
	public Entity(Texture texture, int x, int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.isAffectedByPhysics = false;
		this.isJumping = false;
		this.currentHitbox.x = 0;
		this.currentHitbox.y = 0;
		this.currentHitbox.height = height;
		this.currentHitbox.width = width;
		this.hitboxes[0] = currentHitbox;
		this.hitboxes[1] = currentHitbox;
		this.hitboxes[2] = currentHitbox;
		this.hitboxes[3] = currentHitbox;
		this.currentTexture = texture;
		this.textures[0] = texture;
		this.textures[1] = texture;
		this.textures[2] = texture;
		this.textures[3] = texture;
	}
	
	public int HLX(){
		return this.x + this.currentHitbox.x;
	}
	
	public int HRX(){
		return this.x + this.currentHitbox.x + this.currentHitbox.width;
	}
	
	public int HUY(){
		return this.y + this.currentHitbox.y;
	}
	
	public int HLY(){
		return this.y + this.currentHitbox.y + this.currentHitbox.height;
	}

	public void move(int xmv, int ymv){
		this.x = x + xmv;
		this.y = y + ymv;
	}
	
	public boolean mouseHover(){
		if (Positions.isBetween(Mouse.getX(), this.x + this.currentHitbox.x, this.x + this.currentHitbox.x + this.currentHitbox.width) && Positions.isBetween(Mouse.getY(), this.y + this.currentHitbox.y, this.y + this.currentHitbox.y + this.currentHitbox.height)){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean leftClicked(){
		if (Positions.isBetween(Mouse.getX(), this.x + this.currentHitbox.x, this.x + this.currentHitbox.x + this.currentHitbox.width) && Positions.isBetween(Mouse.getY(), this.y + this.currentHitbox.y, this.y + this.currentHitbox.y + this.currentHitbox.height) && Mouse.isButtonDown(0)){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean rightClicked(){
		if (Positions.isBetween(Mouse.getX(), this.x + this.currentHitbox.x, this.x + this.currentHitbox.x + this.currentHitbox.width) && Positions.isBetween(Mouse.getY(), this.y + this.currentHitbox.y, this.y + this.currentHitbox.y + this.currentHitbox.height)&& Mouse.isButtonDown(1)){
			return true;
		}
		else{
			return false;
		}
	}
	
}
