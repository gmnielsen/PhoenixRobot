// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5265.Phoenix;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static CANTalon stagBaseLeftFront;
    public static CANTalon stagBaseLeftRear;
    public static CANTalon stagBaseRightFront;
    public static CANTalon stagBaseRightRear;
    public static RobotDrive stagBaseStagMotor;
    public static Encoder stagBaseQuadratureEncoder1;
    public static SpeedController stagKickerFront;
    public static SpeedController stagKickerRear;
    public static AnalogPotentiometer stagArmArmPot;
    public static SpeedController stagArmLimbMotor;
    public static SpeedController stagArmBrush;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        stagBaseLeftFront = new CANTalon(0);
        LiveWindow.addActuator("StagBase", "LeftFront", stagBaseLeftFront);
        
        stagBaseLeftRear = new CANTalon(1);
        LiveWindow.addActuator("StagBase", "LeftRear", stagBaseLeftRear);
        
        stagBaseRightFront = new CANTalon(2);
        LiveWindow.addActuator("StagBase", "RightFront", stagBaseRightFront);
        
        stagBaseRightRear = new CANTalon(3);
        LiveWindow.addActuator("StagBase", "RightRear", stagBaseRightRear);
        
        stagBaseStagMotor = new RobotDrive(stagBaseLeftFront, stagBaseLeftRear,
              stagBaseRightFront, stagBaseRightRear);
        
        stagBaseStagMotor.setSafetyEnabled(true);
        stagBaseStagMotor.setExpiration(0.1);
        stagBaseStagMotor.setSensitivity(0.5);
        stagBaseStagMotor.setMaxOutput(1.0);

        stagBaseQuadratureEncoder1 = new Encoder(0, 1, false, EncodingType.k4X);
        LiveWindow.addSensor("StagBase", "Quadrature Encoder 1", stagBaseQuadratureEncoder1);
        stagBaseQuadratureEncoder1.setDistancePerPulse(1.0);
        stagBaseQuadratureEncoder1.setPIDSourceType(PIDSourceType.kRate);
        stagKickerFront = new Victor(1);
        LiveWindow.addActuator("StagKicker", "Front", (Victor) stagKickerFront);
        
        stagKickerRear = new Victor(0);
        LiveWindow.addActuator("StagKicker", "Rear", (Victor) stagKickerRear);
        
        stagArmArmPot = new AnalogPotentiometer(0, 1.0, 0.0);
        SmartDashboard.putNumber("potValue", stagArmArmPot.get());        
        LiveWindow.addSensor("StagArm", "ArmPot", stagArmArmPot);
        
        stagArmLimbMotor = new Victor(3);
        LiveWindow.addActuator("StagArm", "LimbMotor", (Victor) stagArmLimbMotor);
        
        stagArmBrush = new Victor(2);
        LiveWindow.addActuator("StagArm", "Brush", (Victor) stagArmBrush);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
