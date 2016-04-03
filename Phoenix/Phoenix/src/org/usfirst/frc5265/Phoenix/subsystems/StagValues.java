package org.usfirst.frc5265.Phoenix.subsystems;

public final class StagValues {
	
	public static final double initDist2Defense = 1.5;
	
	// We are adding the distance to the beginning of the defense, to the distance to actually get to the wall
	public static final double initDist2Wall = initDist2Defense + 1.5;
	public static final double initDist2ChevDefree = initDist2Defense + 1.5;
	public static final double initDist2Portcul = initDist2Defense + 1.5;
	public static final double initDist2Rampart = initDist2Defense + 1.5;
	
	public static final double initAutoSpeed = 0.8;
	public static final double initRampartLeftSpeed = 0 ;
	public static final double initRampartRightSpeed = 0.8;
	public static final double initRampartTime = 3;
	public static final double initDefenseTime = 1;
	
	public static final double initBrushSpeed = 0.4;
	
	public static final double shooterPower = 1;
	public static final double shooterTime = 0.2;
	public static final double clampPower = -0.5;
	public static final double clampTime = 0.5;
}


/*
double shooterPower = 1;
	double shooterTime = 0.2;
	double clampPower = -0.5;
	double clampTime = 0.5;

*/