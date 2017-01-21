package org.usfirst.frc.team4561.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team4561.robot.Robot;

/**
 *
 */
public class DriveMotor extends Command {
	
	public DriveMotor() {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.driveTrain);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		double leftSliderPos = Robot.oi.getLeftSlider();
		double rightSliderPos = Robot.oi.getRightSlider();
		Robot.driveTrain.setMotors(leftSliderPos, rightSliderPos);
		System.out.println("Left encoder velocity: " + Robot.driveTrain.getLeftEncoder());
		System.out.println("Right encoder velocity: " + Robot.driveTrain.getRightEncoder());
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
	}
}
