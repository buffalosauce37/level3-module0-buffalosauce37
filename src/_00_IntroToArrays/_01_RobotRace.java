package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	static boolean x = true;
	//1. make a main method
	public static void main(String[] args) {
		Robot[] robots = new Robot[5];
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot();
		}
		robots[0].moveTo(100, 500);
		robots[1].moveTo(300, 500);
		robots[2].moveTo(500, 500);
		robots[3].moveTo(700, 500);
		robots[4].moveTo(800, 500);
while (x == true) {
		for (int i = 0; i < robots.length; i++) {
			Random random = new Random();
			robots[i].move(random.nextInt(51));
			if(robots[i].getY() <= 0) {
				x = false;
				JOptionPane.showMessageDialog(null, robots[i] + " won");
			}
		}
	}
	}	//2. create an array of 5 robots.

		//3. use a for loop to initialize the robots.
		
			//4. make each robot start at the bottom of the screen, side by side, facing up
	
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
    	
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

		//7. declare that robot the winner and throw it a party!
    	
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

	
}
