package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.CanIdConstants;

import com.revrobotics.CANSparkBase.IdleMode;
import com.revrobotics.CANSparkLowLevel.MotorType;

public class SingleMotorSubsystem extends SubsystemBase{
    private CANSparkMax firstMotor = new CANSparkMax(CanIdConstants.MotorName, MotorType.kBrushless);
    
    public SingleMotorSubsystem(){
        firstMotor.setOpenLoopRampRate(0.3);
        firstMotor.setIdleMode(IdleMode.kBrake);
        firstMotor.clearFaults();
    }
    
    public void setIntakeVelo(double velo){
        firstMotor.set(velo);
    }

    @Override
    public void periodic(){
        //this will be called every 20ms forever
    }
}
