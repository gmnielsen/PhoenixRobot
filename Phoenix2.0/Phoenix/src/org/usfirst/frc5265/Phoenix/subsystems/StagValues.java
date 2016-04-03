package org.usfirst.frc5265.Phoenix.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.*;

public final class StagValues extends Subsystem {
	
	// DISTANCES for working with defenses
	// Distance to the slope that begins every defense
		public static final double initDist2Defense = 1.5;
		// We are adding the above distance, to the distance to actually get to the obstacle
			public static final double initDist2Wall = initDist2Defense + 1.5;
			public static final double initDist2ChevDefree = initDist2Defense + 1.5;
			public static final double initDist2Portcul = initDist2Defense + 1.5;
			public static final double initDist2Rampart = initDist2Defense + 1.5;
	
	// SPEEDS for working with defenses
		public static final double initAutoSpeed = 0.8;
		public static final double initRampartLeftSpeed = 0 ;
		public static final double initRampartRightSpeed = 0.8;
	
	// TIMES for working with defenses
		public static final double initDefenseTime = 1;
		public static final double initRampartTime = 3;
	
	// INTAKE BRUSH values
		public static final double initBrushSpeed = 0.4;
		public static final double initBrushReverseSpeed = -0.4;
	
	// KICKER or SHOOTER values for power and time
		public static final double initShooterPower = 1;
		public static final double initShooterTime = 0.2;
		public static final double initClampPower = -0.5;
		public static final double initClampTime = 0.5;
	
	// BOOLEANS for camera and brush states
		public static final boolean brushState = true;
		public static final boolean cameraState = true;
		
	//	CAMERA pieces
		public static int camSession;
		public static int camFrontNumb;
		public static int camBackNumb;
		public static String camFront = "cam0";
	    public static String camBack = "cam1";
	    public static String camAlt = "cam2";
	    
	// ARM pot values
	    public static final double initPosStart = .5;
	    public static final double initPosBall = .5;
	    public static final double initPosLow = .5;
	    public static final double initPosChange = .5;
	    
    
	
	// default INITALIZATIONS begin here
	public void initDefaultCommand() {
		//BOOLEANS
		SmartDashboard.putBoolean("brushOn",brushState);
		SmartDashboard.putBoolean("camera",cameraState);
		//DISTANCES
		SmartDashboard.putNumber("dist2Defense",initDist2Defense);
		SmartDashboard.putNumber("dist2Wall",initDist2Wall);
		SmartDashboard.putNumber("dist2ChevDefree",initDist2ChevDefree);
		SmartDashboard.putNumber("dist2PortCull",initDist2Portcul);
		SmartDashboard.putNumber("dist2Rampart",initDist2Rampart);
		//SPEEDS
		SmartDashboard.putNumber("sp4Auto",initAutoSpeed);
		SmartDashboard.putNumber("sp4LeftRampart", initRampartLeftSpeed);
		SmartDashboard.putNumber("sp4RightRampart", initRampartRightSpeed);		
		//TIMES
		SmartDashboard.putNumber("time4Auto",initDefenseTime);
		SmartDashboard.putNumber("time4Rampart",initRampartTime);
		//BRUSH
		SmartDashboard.putNumber("sp4Brush",initBrushSpeed);
		SmartDashboard.putNumber("sp4BrushReverse",initBrushReverseSpeed);
		//KICKER
		SmartDashboard.putNumber("time4Shooter", initShooterTime);
    	SmartDashboard.putNumber("pwr4Shooter", initShooterPower);
    	SmartDashboard.putNumber("time4Clamp", initClampTime);	
    	SmartDashboard.putNumber("pwr4Clamp", initClampPower);
    	//ARM
    	SmartDashboard.putNumber("posBall", initPosBall);
    	SmartDashboard.putNumber("posStart", initPosStart);
    	SmartDashboard.putNumber("posLow", initPosLow);
    	SmartDashboard.putNumber("posChange", initPosChange);
	}
}


