// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.Constants.DriveConstants;
import frc.robot.subsystems.DriveSubsystem;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;

/** An example command that uses an example subsystem. */
public class DriveCommand extends CommandBase {
  private final DriveSubsystem m_drive;
  private final XboxController m_controller;
  private double forward;
  private double rot;

  public DriveCommand(DriveSubsystem subsystem, XboxController controller) {
    m_drive = subsystem;
    addRequirements(m_drive);
    m_controller = controller;
    
  }
  
  private void drive() {
    forward =
      (m_controller.getRightTriggerAxis() - m_controller.getLeftTriggerAxis())
      * DriveConstants.FORWARD_SCALE;
    rot = Math.abs(m_controller.getLeftX()) >.1?  m_controller.getLeftX() * DriveConstants.ROT_SCALE * -1: 0;
    m_drive.updateSpeeds(forward, rot);
    m_drive.drivePID();
}


@Override
public void initialize() {
}

@Override
  public void execute() {
      drive();
  }

}