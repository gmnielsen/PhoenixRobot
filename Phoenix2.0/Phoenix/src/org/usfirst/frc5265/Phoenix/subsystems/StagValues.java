package org.usfirst.frc5265.Phoenix.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.*;

public final class StagValues extends Subsystem {
	
	// PID values
		public static final double stagArmP = 5.5;
		public static final double stagArmI = 0;
		public static final double stagArmD = 0;
		public static final double tolerancePot = 0.003;
		
		/* commented out by Dr. N., not using these
		public static final double stagBaseP = 5.5; 
		public static final double stagBaseI = 0;
		public static final double stagBaseD = 0;
		public static final double toleranceBase = 0.003;
	    */
		
	// DISTANCES for working with defenses
	// Distance to the slope that begins every defense
		public static final double initDist2Defense = 1.5;
		// We are adding the above distance, to the distance to actually get to the obstacle
			public static final double initDist2Wall = initDist2Defense + 1.5;
			public static final double initDist2ChevDefree = initDist2Defense + 1.5;
			public static final double initDist2Portcul = initDist2Defense + 1.5;
			public static final double initDist2Rampart = initDist2Defense + 1.5;
	
	// SPEEDS for working with defenses
		public static final double initAutoSpeed = -1.0;
		public static final double initRampartLeftSpeed = -0.85;
		public static final double initRampartRightSpeed = -1.0;
	
	// TIMES for working with defenses
		public static final double initDefenseTime = 4;
		public static final double initRampartTime = 4;
	
	// INTAKE BRUSH values
		public static final double initBrushSpeed = -1.0 ;
		public static final double initBrushReverseSpeed = 0.6;
	
	// KICKER or SHOOTER values for power and time
		public static final double initShooterPower = 1;
		public static final double initShooterTime = 0.2;
		public static final double initClampPower = -0.5;
		public static final double initClampTime = 0.5;
	
	// BOOLEANS for camera and brush states
		public static final boolean brushState = false;
		public static final boolean reverseBrushState = false;
		public static final boolean rampartState = false;
		public final boolean cameraState = false;
		
	//	CAMERA pieces
		public int camSession;
		public int camFrontNumb;
		public int camBackNumb;
		public String camFront = "cam0";
	    public String camBack = "cam1";
	    public String camAlt = "cam2";
	    
	// ARM pot values
	    /* testing values, no longer used by kept for history
	    public static final double initPosStart = 4.6;
	    public static final double initPosBall = 1.5;
	    public static final double initPosLow = .3;
	    public static final double initPosChange = 0.9;
	    public static final double initPosChevDefree = 0.3;
	    public static final double tolerance = 0.05;
	    */
	    public static final double initPosStart = .86;
	    public static final double initPosBall = .17;
	    public static final double initPosLow = .02;
	    public static final double initPosChange = .6;
	    public static final double initPosChevDefree = 0.4;
	    
	
	// default INITALIZATIONS begin here
	public void initDefaultCommand() {
		
		//BOOLEANS
		SmartDashboard.putBoolean("brushState",brushState);
		SmartDashboard.putBoolean("reverseBrushState",reverseBrushState);
		SmartDashboard.putBoolean("camera",cameraState);
				
		//PID
		SmartDashboard.putNumber("armPP value",stagArmP);
		SmartDashboard.putNumber("armII value",stagArmI);
		SmartDashboard.putNumber("armDD value",stagArmD);
		SmartDashboard.putNumber("tolerance arm",tolerancePot);
		
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
    	SmartDashboard.putNumber("posChevDefree", initPosChevDefree);
	}
}

