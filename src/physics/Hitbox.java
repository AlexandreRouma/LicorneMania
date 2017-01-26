/*
 * File Name: Hitbox.java
 * Code by:   Alexandre Rouma
 * Date:      19 juin 2016
 * Time:      11:19:37
 */
package physics;

public class Hitbox {
	
	private int x;
	private int y;
	private int w;
	private int h;
	
	public Hitbox(int xc, int yc, int hc, int wc){
		this.x = xc;
		this.y = yc;
		this.w = wc;
		this.h = hc;
	}
 
	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public int getW() {
		return this.w;
	}

	public int getH() {
		return this.h;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setW(int w) {
		this.w = w;
	}

	public void setH(int h) {
		this.h = h;
	}	
}
