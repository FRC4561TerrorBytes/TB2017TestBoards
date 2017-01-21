package org.usfirst.frc.team4561.robot.subsystems;

import org.usfirst.frc.team4561.robot.RobotMap;
import org.usfirst.frc.team4561.robot.commands.DriveMotor;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * blah
 * @author me
 */
public class DriveTrain extends Subsystem {

	private CANTalon leftMotor = new CANTalon(RobotMap.MOTOR_PORT_ONE);
	private CANTalon rightMotor = new CANTalon(RobotMap.MOTOR_PORT_TWO);
	
	public void initDefaultCommand() {
		setDefaultCommand(new DriveMotor());
	}
	
	public void setMotors(double leftPower, double rightPower) {
		leftMotor.set(leftPower);
		rightMotor.set(rightPower);
	}
	
	public double getLeftEncoder() {
		return leftMotor.getEncVelocity();
	}
	
	public double getRightEncoder() {
		return rightMotor.getEncVelocity();
	}
}
