package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsControlModule;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class PneumaticsSubsystem extends SubsystemBase {
    Compressor pcmCompressor = new Compressor(0, PneumaticsModuleType.CTREPCM);
    // DoubleSolenoid exampleDoubleCPM = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 4, 5);
    Solenoid leftSolenoid = new Solenoid(PneumaticsModuleType.CTREPCM, 5);
    Solenoid rightSolenoid = new Solenoid(PneumaticsModuleType.CTREPCM, 4);
    PneumaticsControlModule a = new PneumaticsControlModule();
    
    public PneumaticsSubsystem() {
        pcmCompressor.enableDigital();
    }

    public void toggleLeftSolenoid() {
        leftSolenoid.toggle();
    }

    public void toggleRightSolenoid() {
        rightSolenoid.toggle();
    }
}
