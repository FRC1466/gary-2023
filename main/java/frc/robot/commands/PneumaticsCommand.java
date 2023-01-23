package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.PneumaticsSubsystem;

public class PneumaticsCommand extends CommandBase {
    private PneumaticsSubsystem pneumatics;
    private XboxController controller;
    
    public PneumaticsCommand(PneumaticsSubsystem pneumatics, XboxController controller) {
        this.controller = controller;
        this.pneumatics = pneumatics;
        addRequirements(pneumatics);

    }

    private void loop() {
        if (controller.getLeftBumperPressed()) {
            pneumatics.toggleLeftSolenoid();
        }
        if (controller.getRightBumperPressed()) {
            pneumatics.toggleRightSolenoid();
        }
    }

    @Override
    public void execute() {
        loop();
    }
}
