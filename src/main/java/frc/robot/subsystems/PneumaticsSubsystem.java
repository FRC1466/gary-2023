package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsControlModule;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class PneumaticsSubsystem extends SubsystemBase {
    Compressor pcmCompressor;
    // DoubleSolenoid exampleDoubleCPM = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 4, 5);
    Solenoid leftSolenoid;
    Solenoid rightSolenoid;
    DoubleSolenoid doubleSolenoid;
    PneumaticsControlModule controlModule;
    
    public PneumaticsSubsystem() {
        controlModule = new PneumaticsControlModule();

        pcmCompressor = controlModule.makeCompressor();
        leftSolenoid = controlModule.makeSolenoid(4);
        rightSolenoid = controlModule.makeSolenoid(5);
        doubleSolenoid = controlModule.makeDoubleSolenoid(4, 5);

        pcmCompressor.enableDigital();
    }

    public void toggleLeftSolenoid() {
        leftSolenoid.toggle();
    }

    public void toggleRightSolenoid() {
        rightSolenoid.toggle();
    }
}
