package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;

import frc.robot.subsystems.SingleMotorSubsystem;

public class ExampleCommandOut extends Command{
    SingleMotorSubsystem singleMotorSubsystem;

    public ExampleCommandOut(SingleMotorSubsystem singleMotorSubsystem) {
        this.singleMotorSubsystem = singleMotorSubsystem;
        addRequirements(singleMotorSubsystem);
    }

    @Override
    public void execute() {
      singleMotorSubsystem.setIntakeVelo(0.8);
        // 1 is the MAX, usually we do not go above 0.8 or 0.
    }

    @Override
    public void end(boolean interrupted) {
        singleMotorSubsystem.setIntakeVelo(0.0); 
    }
}