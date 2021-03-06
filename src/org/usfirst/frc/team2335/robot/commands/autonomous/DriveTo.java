package org.usfirst.frc.team2335.robot.commands.autonomous;

import org.usfirst.frc.team2335.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveTo extends Command {

    public DriveTo() {
        requires(Robot.ultrasoundPID);
        Robot.ultrasoundPID.setSetpoint(0.0);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.ultrasoundPID.enable();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() 
    {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return Robot.ultrasoundPID.onTarget();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.ultrasoundPID.disable();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
