package org.usfirst.frc.team1797.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.VictorSP;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	
	public static boolean hasInitialized;
	public static SpeedController zero, one, two, three, four;
	public static Joystick joystick;
	public static final double MOTOR_CUTOFF = .1;
	static {
		hasInitialized = false;
	}
	
	public static void init() {
		zero = new VictorSP(0);
		one = new VictorSP(1);
		two = new VictorSP(2);
		three = new VictorSP(3);
		four = new VictorSP(4);
		
		joystick = new Joystick(0);
		
		hasInitialized = true;
	}
}
