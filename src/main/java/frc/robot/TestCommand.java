/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.experimental.command.SendableCommandBase;

public class TestCommand extends SendableCommandBase {
  public TestCommand() {
    setName("Test Command");
    addRequirements(Robot.test_subsystem_);
  }
  @Override
  public void execute() {
    System.out.println("Execute");
  }
}
