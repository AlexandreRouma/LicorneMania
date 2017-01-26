/*
 * File Name: Entity.java
 * Code by:   Alexandre Rouma
 * Date:      16 juin 2016
 * Time:      21:43:11
 */

package graphics;

import org.newdawn.slick.opengl.Texture;

import physics.Hitbox;

public class Entity {
	
	public Texture texture;
	public Texture textures[] = new Texture[4];
	private int x;
	private int y;
	private int w;
	private int h;
	public int frame;
	private boolean isbackground;
	public String name = "";
	public boolean isAnimated = false;
	public boolean isPlayer = false;
	public boolean isSolid = true;
	public boolean isSolidOnSIdes = false;
	
	
	public boolean getIsbackground() {
		return this.isbackground;
	}

	public void setIsbackground(boolean isbackground) {
		this.isbackground = isbackground;
	}

	public boolean isAffectedByPhysics;
	public boolean isJumping;
	private int id;
	public Hitbox hitbox = new Hitbox(0, 0, 0, 0);
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Entity(Texture texture, int x, int y, int w, int h){
		this.texture = texture;
		this.x = x;
		this.y = y;
		this.setW(w);
		this.setH(h);
		this.isAffectedByPhysics = false;
		this.isJumping = false;
		this.hitbox.setX(0);
		this.hitbox.setY(0);
		this.hitbox.setH(h);
		this.hitbox.setW(w);
		this.texture = texture;
		this.textures[0] = texture;
		this.textures[1] = texture;
		this.textures[2] = texture;
		this.textures[3] = texture;
	}
	
	public int HLX(){
		return this.x + this.hitbox.getX();
	}
	
	public int HRX(){
		return this.x + this.hitbox.getX() + this.hitbox.getW();
	}
	
	public int HUY(){
		return this.y + this.hitbox.getY();
	}
	
	public int HLY(){
		return this.y + this.hitbox.getY() + this.hitbox.getH();
	}
	
	public boolean isAffectedByPhysics() {
		return isAffectedByPhysics;
	}

	public void setAffectedByPhysics(boolean isAffectedByPhysics) {
		this.isAffectedByPhysics = isAffectedByPhysics;
	}

	public boolean isJumping() {
		return this.isJumping;
	}

	public void setJumping(boolean isJumping) {
		this.isJumping = isJumping;
	}

	public Hitbox getHitbox() {
		return this.hitbox;
	}

	public void move(int xmv, int ymv){
		this.x = x + xmv;
		this.y = y + ymv;
	}

	public int getId() {
		return this.id;
	}

	public Texture getTexture() {
		return this.texture;
	}

	public void setTexture(Texture texture) {
		this.texture = texture;
	}

	public int getX() {
		return this.x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public int getH() {
		return this.h;
	}
	
	public void setH(int h) {
		this.h = h;
	}
	
	public int getW() {
		return this.w;
	}
	
	public void setW(int w) {
		this.w = w;
	}
	
}
