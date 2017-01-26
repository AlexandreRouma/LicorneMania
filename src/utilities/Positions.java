/*
 * File Name: Positions.java
 * Code by:   Alexandre Rouma
 * Date:      1 juil. 2016
 * Time:      14:47:54
 */
package utilities;

public class Positions {
	public static boolean isBetween(int value, int p1, int p2){
		if (value > p1 && value < p2){
			return true;
		}
		else{
			return false;
		}
	}
}
