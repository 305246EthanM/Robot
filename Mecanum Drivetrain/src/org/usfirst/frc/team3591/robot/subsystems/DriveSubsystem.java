package org.usfirst.frc.team3591.robot.subsystems;

import org.usfirst.frc.team3591.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.RobotDrive;

/**
 *
 */
public class DriveSubsystem extends Subsystem {

	CANTalon frontLeftTal;
	CANTalon backLeftTal;
	CANTalon frontRightTal;
	CANTalon backRightTal;
	
	RobotDrive robotDrive;
	
	
	public DriveSubsystem() {
		frontLeftTal = new CANTalon(RobotMap.LEFT_FRONT_TALON_ID);
		backLeftTal = new CANTalon(RobotMap.LEFT_REAR_TALON_ID);
		frontRightTal = new CANTalon(RobotMap.RIGHT_FRONT_TALON_ID);
		backRightTal = new CANTalon(RobotMap.RIGHT_REAR_TALON_ID);
		
		robotDrive = new RobotDrive(frontLeftTal, backLeftTal, frontRightTal, backRightTal);
		
		
	}
	
	public void drive(double x, double y, double z) {
		robotDrive.mecanumDrive_Cartesian(x, y, z, 0);
	}
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}