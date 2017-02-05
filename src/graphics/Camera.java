/*
 * File Name: Camera.java
 * Code by:   Alexandre Rouma
 * Date:      16 juin 2016
 * Time:      23:05:04
 */
package graphics;

public class Camera {
	
	public static int x;
	public static int y;
	
	public static void move(int xmv, int ymv){
		x = x + xmv;
		y = y + ymv;
	}
	
	
	
}
