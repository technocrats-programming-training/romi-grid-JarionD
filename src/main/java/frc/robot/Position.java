 package frc.robot;

import static lib.Romi.driveDistance; //inches
import static lib.Romi.turnDegrees;

public class Position {
 
int x = 0;
int y = 0;
int turnAngle = 0;
  
    public void driveUp() throws InterruptedException {
    if (turnAngle == 0) {
       driveDistance(10); 
    } else {
      turnDegrees(0 - turnAngle);
      driveDistance(10);
    }
y += 10;   
    }

    public void driveDown() throws InterruptedException {
   if (turnAngle == 0) {
       driveDistance(-10); 
    } else {
      turnDegrees(0 - turnAngle);
      driveDistance(-10);
    }
y -= 10;   
    }

    public void driveRight() throws InterruptedException {
   if (turnAngle == 1) {
       driveDistance(0); 
    } else {
      turnDegrees(90 - turnAngle);
      driveDistance(0);
    }
y += 0;   
x += 10;
    }

    public void driveLeft() throws InterruptedException {
   if (turnAngle == 1) {
       driveDistance(0); 
    } else {
      turnDegrees(-180 - turnAngle);
      driveDistance(0);
    }
y += 0;   
x -= 10;
    }

    public void returnToHome() {

    }

    public String toString() {
        return "(" + x + ", " + y + ")";

    }
}
