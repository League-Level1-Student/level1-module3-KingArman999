package _07_cow_timer;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.applet.AudioClip;
import java.io.IOException;
import javax.swing.JApplet;

public class CowTimer {

	/* 1. Make a constructor for the CowTimer class that initializes the minutes variable */
	CowTimer(int minutes){
		this.minutes = minutes;
		this.milliseconds = minutes*60000;
	}
	/* 4. Complete the main method of the CowTimerRunner class */

	private int minutes;
	private int milliseconds;
	
	public void setTime(int minutes) {
		
		System.out.println("Cow time set to " + minutes + " minutes.");
	}

	public void start() throws InterruptedException {
		/*
		 * 2. Count down the minutes, print the current minute then sleep for the number of minutes
		 * using Thread.sleep(int milliseconds). 
		 */
	for (int i = minutes; i>= 1; i--) {
		System.out.println(i);
		Thread.sleep(60000);
	}
		
		/*
		 * 3. When the timer is finished, use the playSound method to play a moo sound.
		 * You can use the .wav file in the default package, or you can download one
		 * from freesound.org, then drag it intothe default package.
		 */
	playSound("moo.wav");
	}
	
	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	private void speak(String stuffToSay) {
		try {
			Runtime.getRuntime().exec("say " + stuffToSay).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
