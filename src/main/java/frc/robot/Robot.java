// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILi.b BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import lib.ProceduralRobot;

import java.util.Scanner;

import static lib.Romi.*;


public class Robot extends ProceduralRobot {
  @Override
  public void autonomousProcedure() throws InterruptedException {
        
      Joystick js = new Joystick(0);
        Position pdu = new Position();

  
    for (int i = 0; i >= 1200000; i++) {
      if (js.getRawButtonPressed(1)) {
        pdu.driveUp();
      }
      if (js.getRawButtonPressed(2)) {
        pdu.driveDown();
      }
      
      if (js.getRawButtonPressed(3)) {
        pdu.driveLeft();
      }
      
      if (js.getRawButtonPressed(4)) {
        pdu.driveRight();
      }
      if (js.getRawButtonPressed(5)) {
        pdu.returnToHome();
      }
    }
  }
}
