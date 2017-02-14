
package org.usfirst.frc.team3591.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team3591.robot.Robot;
import org.usfirst.frc.team3591.robot.OI.Axis;

public class DriveCommand extends Command 
{

    public DriveCommand() 
    {

    }

    protected void initialize() 
    {
    	
    }
    
    protected void execute() 
    {
    	Robot.driveSubsystem.drive(Robot.oi.getAxis(1, Axis.X)*Robot.oi.getAxis(1, Axis.THROTTLE), Robot.oi.getAxis(1, Axis.Y)*Robot.oi.getAxis(1, Axis.THROTTLE),
    			Robot.oi.getAxis(1, Axis.Z)*Robot.oi.getAxis(1, Axis.THROTTLE));
    }

    protected boolean isFinished() 
    {
        return false;
    }

    protected void end() 
    {
    	Robot.driveSubsystem.drive(0, 0, 0);
    }

    protected void interrupted() 
    {
    	Robot.driveSubsystem.drive(0, 0, 0);
    }
}