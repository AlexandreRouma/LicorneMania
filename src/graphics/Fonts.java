/*
 * File Name: Fonts.java
 * Code by:   Alexandre Rouma
 * Date:      16 juin 2016
 * Time:      23:13:32
 */

package graphics;

import java.awt.Font;

import org.newdawn.slick.TrueTypeFont;

public class Fonts {
	
	public static TrueTypeFont calibriSmall;
	public static TrueTypeFont calibriMedium;
	public static TrueTypeFont calibriBig;
	
	public static void load(){
		calibriSmall = new TrueTypeFont(new Font("Calibri", Font.PLAIN, 10),true);
		calibriMedium = new TrueTypeFont(new Font("Calibri", Font.PLAIN, 20),true);
		calibriBig = new TrueTypeFont(new Font("Calibri", Font.PLAIN, 30),true);
	}
	
}
