/*
 * File Name: DisplayManager.java
 * Code by:   Alexandre Rouma
 * Date:      16 juin 2016
 * Time:      21:25:39
 */
package graphics;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.newdawn.slick.Color;

public class DisplayManager {
	
	private static int screenWidth = 800;
	private static int screenHeight = 480;
	
	public static void createDisplay(String title, int w, int h, boolean isFullScreen, boolean vsync){
		setDisplayMode(w, h, isFullScreen);
		screenWidth = w;
		screenHeight = h;
		Display.setTitle(title);
		Display.setVSyncEnabled(vsync);
		try {
			Display.create();
		} catch (LWJGLException e) {
			e.printStackTrace();
		}
		GL11.glEnable(GL11.GL_TEXTURE_2D);               
        GL11.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);          
        GL11.glEnable(GL11.GL_BLEND);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GL11.glViewport(0,0,screenWidth,screenHeight);
        GL11.glMatrixMode(GL11.GL_MODELVIEW);
        GL11.glMatrixMode(GL11.GL_PROJECTION);
        GL11.glLoadIdentity();
        GL11.glOrtho(0, screenWidth, screenHeight, 0, 1, -1);
        GL11.glMatrixMode(GL11.GL_MODELVIEW);
        Color.white.bind();
	}
	
	public static int getScreenWidth() {
		return screenWidth;
	}

	public static int getScreenHeight() {
		return screenHeight;
	}

	public static void closeDisplay(){
		
	}
	
	public static void refreshDisplay(){
		Display.update();
	}
	
	public static void setDisplayMode(int width, int height, boolean fullscreen) {
		 
	    // return if requested DisplayMode is already set
	    if ((Display.getDisplayMode().getWidth() == width) && 
	        (Display.getDisplayMode().getHeight() == height) && 
	    (Display.isFullscreen() == fullscreen)) {
	        return;
	    }
	 
	    try {
	        DisplayMode targetDisplayMode = null;
	         
	    if (fullscreen) {
	        DisplayMode[] modes = Display.getAvailableDisplayModes();
	        int freq = 0;
	                 
	        for (int i=0;i<modes.length;i++) {
	            DisplayMode current = modes[i];
	                     
	        if ((current.getWidth() == width) && (current.getHeight() == height)) {
	            if ((targetDisplayMode == null) || (current.getFrequency() >= freq)) {
	                if ((targetDisplayMode == null) || (current.getBitsPerPixel() > targetDisplayMode.getBitsPerPixel())) {
	                targetDisplayMode = current;
	                freq = targetDisplayMode.getFrequency();
	                        }
	                    }
	 
	            // if we've found a match for bpp and frequence against the 
	            // original display mode then it's probably best to go for this one
	            // since it's most likely compatible with the monitor
	            if ((current.getBitsPerPixel() == Display.getDesktopDisplayMode().getBitsPerPixel()) &&
	                        (current.getFrequency() == Display.getDesktopDisplayMode().getFrequency())) {
	                            targetDisplayMode = current;
	                            break;
	                    }
	                }
	            }
	        } else {
	            targetDisplayMode = new DisplayMode(width,height);
	        }
	 
	        if (targetDisplayMode == null) {
	            System.out.println("Failed to find value mode: "+width+"x"+height+" fs="+fullscreen);
	            return;
	        }
	 
	        Display.setDisplayMode(targetDisplayMode);
	        Display.setFullscreen(fullscreen);
	             
	    } catch (LWJGLException e) {
	        System.out.println("Unable to setup mode "+width+"x"+height+" fullscreen="+fullscreen + e);
	    }
	}
	
}
