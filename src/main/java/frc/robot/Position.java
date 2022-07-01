package frc.robot;

import static lib.Romi.driveDistance;
import static lib.Romi.turnDegrees;

public class Position {
 
int x;
int y;
String direction;
direction North = new direction();
direction West = new direction();
direction East = new direction();
direction South = new direction();



    public void driveUp() throws InterruptedException {
  y += 10;
  x = 0;
  direction.equals(East);  
   
    }

    public void driveDown() throws InterruptedException {

    }

    public void driveRight() throws InterruptedException {

    }

    public void driveLeft() throws InterruptedException {

    }

    public void returnToHome() {

    }

    public String toString() {
        return "";
    }
}
