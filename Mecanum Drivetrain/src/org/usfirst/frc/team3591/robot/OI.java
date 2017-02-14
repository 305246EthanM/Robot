package org.usfirst.frc.team3591.robot;

import edu.wpi.first.wpilibj.Joystick;

public class OI 
{
	public enum Axis 
	{
		X, Y, Z, THROTTLE
	}
	
	public Joystick driveStick = new Joystick(RobotMap.DRIVE_STICK_ID);
	public Joystick shootStick = new Joystick(RobotMap.SHOOT_STICK_ID);
	
	public double getAxis(int stick, Axis axis) 
	{
		switch (stick) 
		{
		case 1:
			switch (axis) 
			{
			case X:
				double x = Math.abs(driveStick.getX()) > 0.03 ? driveStick
						.getX() : 0.0;
				if (x < 0.0) 
				{
					return (-Math.pow(x, 2.0));
				} 
				else 
				{
					return Math.pow(x, 2.0);
				}
			case Y:
				double y = Math.abs(driveStick.getY()) > 0.03 ? driveStick
						.getY() : 0.0;
				if (y < 0.0) 
				{
					return (-Math.pow(y, 2.0));
				} 
				else 
				{
					return Math.pow(y, 2.0);
				}
			case Z:
				double z = Math.abs(driveStick.getZ()) > 0.03 ? driveStick
						.getZ() : 0.0;
				if (z < 0.0) 
				{
					return (-Math.pow(z, 2.0));
				} 
				else 
				{
					return Math.pow(z, 2.0);
				}
			case THROTTLE:
				return (1 - driveStick.getThrottle()) / 2;
			default:
				System.out.println("Invalid Axis");
				return 0.0;
			}
		case 2:
			switch (axis) 
			{
			case X:
				double x = Math.abs(shootStick.getX()) > 0.03 ? shootStick
						.getX() : 0.0;
				if (x < 0.0) 
				{
					return (-Math.pow(x, 2.0));
				} 
				else 
				{
					return Math.pow(x, 2.0);
				}
			case Y:
				double y = Math.abs(shootStick.getY()) > 0.03 ? shootStick
						.getY() : 0.0;
				if (y < 0.0) 
				{
					return (-Math.pow(y, 2.0));
				} 
				else 
				{
					return Math.pow(y, 2.0);
				}
			case Z:
				return (1 - driveStick.getThrottle()) / 2;
			default:
				System.out.println("Invalid Axis");
				return 0.0;
			}
			default:
				System.out.println("Invalid Joystick");
				return 0;
		}
	}
	
}
