package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveSubsystem;

public class Auto extends CommandBase{
    private DriveSubsystem m_drive;
    private double forwardSpeed;
    private double turnSpeed;

   public Auto(DriveSubsystem drive, double forwardSpeed, double turnSpeed){
    m_drive = drive;
    this.forwardSpeed = forwardSpeed; 
    this.turnSpeed = turnSpeed; 

    addRequirements(drive);

    }
    @Override
    public void initialize() {
        
    }

    @Override
    public void execute() {
        m_drive.updateSpeeds(forwardSpeed, turnSpeed);
        m_drive.drivePID();


    }

    
}