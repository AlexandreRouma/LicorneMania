/*
 * File Name: Camera.java
 * Code by:   Alexandre Rouma
 * Date:      16 juin 2016
 * Time:      23:05:04
 */
package graphics;

public class Camera {
	
	private static int x;
	private static int y;
	
	public static void move(int xmv, int ymv){
		x = x + xmv;
		y = y + ymv;
	}
	
	public static int getX() {
		return x;
	}
	public static void setX(int x) {
		Camera.x = x;
	}
	public static int getY() {
		return y;
	}
	public static void setY(int y) {
		Camera.y = y;
	}
	
	
	
}
