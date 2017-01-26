/*
 * File Name: FPSCounter.java
 * Code by:   Alexandre Rouma
 * Date:      16 juin 2016
 * Time:      23:25:49
 */

package utilities;

public class FPSCounter {
	
	private static int FPSCount;
	private static int FPS;
	private static boolean isRunning;
	
	static Runnable counter = new Runnable(){
		public void run(){
			while(isRunning){
				FPS = FPSCount * 2;
				FPSCount = 0;
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	};
	
	private static Thread runnable = new Thread(counter);
	
	public static void start(){
		isRunning = true;
		runnable.start();
	}
	
	public static void stop(){
		isRunning = false;
	}
	
	public static void frame(){
		if (isRunning == true){
			FPSCount++;
		}
	}

	public static int getFPS() {
		return FPS;
	}
	
}
