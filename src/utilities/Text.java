/*
 * File Name: Text.java
 * Code by:   Alexandre Rouma
 * Date:      1 juil. 2016
 * Time:      20:25:39
 */
package utilities;

import org.newdawn.slick.Color;
import org.newdawn.slick.Font;

public class Text {
	
	public static void DrawCenteredText(Font font, String text, int y, Color color){
		font.drawString(400 - (font.getWidth(text) / 2), y, text, color);
	}
	
}