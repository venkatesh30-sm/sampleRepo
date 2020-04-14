package org.cts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class CourseStructure {

	
	public void courseDuration() throws AWTException {
	
		System.out.println("course duration is 2 months");
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}
	
	public static void main(String[] args) throws AWTException {
		
		//Object creation
		CourseStructure c=new CourseStructure();
		
		//To call the method
		c.courseDuration();
		
	}

}
