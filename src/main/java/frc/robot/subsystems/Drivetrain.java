// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.OI;
import io.github.frc5024.lib5k.hardware.ctre.motors.CTREConfig;
import io.github.frc5024.lib5k.hardware.ctre.motors.CTREMotorFactory;
import io.github.frc5024.lib5k.hardware.ctre.motors.ExtendedTalonSRX;
import io.github.frc5024.lib5k.hardware.revrobotics.motors.RevMotorFactory;

public class Drivetrain extends SubsystemBase {

	private static Drivetrain mInstance = null;

	private ExtendedTalonSRX rightMaster;
	private ExtendedTalonSRX leftMaster;

	
	/** Creates a new ExampleSubsystem. */
	public Drivetrain() {
		this.rightMaster = CTREMotorFactory.createTalonSRX(1);
		rightMaster.makeSlave(2);

		this.leftMaster = CTREMotorFactory.createTalonSRX(3, new CTREConfig(true));
		leftMaster.makeSlave(4);

		leftMaster.getCommonEncoder(1060);
		
	}

	public static Drivetrain getInstance(){
		if(mInstance == null){
			mInstance = new Drivetrain();
		}

		return mInstance;
	}

	@Override
	public void periodic() {
		// This method will be called once per scheduler run
		
	}

	@Override
	public void simulationPeriodic() {
		// This method will be called once per scheduler run during simulation
	}
}
