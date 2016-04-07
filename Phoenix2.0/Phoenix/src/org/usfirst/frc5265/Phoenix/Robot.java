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

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;

import org.usfirst.frc5265.Phoenix.commands.*;
import org.usfirst.frc5265.Phoenix.subsystems.*;

import edu.wpi.first.wpilibj.CameraServer;
import com.ni.vision.NIVision;
import com.ni.vision.VisionException;
import com.ni.vision.NIVision.Image;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

    Command autonomousCommand;
    SendableChooser autoChooser;

    public static OI oi;
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static StagValues stagValues;
    public static StagBase stagBase;
    public static StagKicker stagKicker;
    public static StagArm stagArm;
    public static StagIntake stagIntake;
    
    Image img;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    RobotMap.init();
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        stagValues = new StagValues();
        stagBase = new StagBase();
        stagKicker = new StagKicker();
        stagArm = new StagArm();
        stagIntake = new StagIntake();

        // Selectable Autonomous program
        autoChooser = new SendableChooser(); 
        autoChooser.addDefault("Rampart", new autoRampart());
        autoChooser.addObject("Portcul", new autoPortcul());
        autoChooser.addObject("Chev Defree",new autoChevDefree());
        autoChooser.addObject("LowBar", new autoLowBar());
        autoChooser.addObject("Moat", new autoMoat());
        autoChooser.addObject("Rough Terrain", new autoRoughTerrain());
        autoChooser.addObject("Wall", new autoWall());
        
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        // OI must be constructed after subsystems. If the OI creates Commands
        //(which it very likely will), subsystems are not guaranteed to be
        // constructed yet. Thus, their requires() statements may grab null
        // pointers. Bad news. Don't move it.
        oi = new OI();
        
        // instantiate the command used for the autonomous period
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS
        // stagValues.initDefaultCommand();
        // original test command for auto, replace in auto.init
        // autonomousCommand = new autoRampart();

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS
    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    public void disabledInit(){

    }

    public void disabledPeriodic() {
        Scheduler.getInstance().run();
    }

    public void autonomousInit() {
        // schedule the autonomous command (example)
    	// prior to autoChooser we checked for the presence of an auto command
        // if (autonomousCommand != null) autonomousCommand.start();
        autonomousCommand = (Command) autoChooser.getSelected();
    	autonomousCommand.start();
	}
    	

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
        // This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand != null) autonomousCommand.cancel();
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }

    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
    
    // ************************************ radical impact code ************************************ 
    
    
 
    // camFront is the MS 5000, camBack is the MS 3000, and camAlt is the Logitech spare
    // open both front and back cameras, initialize to the front camera
    // 
    public void cameraInit() {
		try {
			img = NIVision.imaqCreateImage(NIVision.ImageType.IMAGE_RGB, 0);
			stagValues.camFrontNumb = NIVision.IMAQdxOpenCamera(stagValues.camFront, NIVision.IMAQdxCameraControlMode.CameraControlModeController);
			stagValues.camBackNumb = NIVision.IMAQdxOpenCamera(stagValues.camBack, NIVision.IMAQdxCameraControlMode.CameraControlModeController);
			stagValues.camSession = stagValues.camFrontNumb;
			NIVision.IMAQdxConfigureGrab(stagValues.camSession);
		} catch (VisionException e) {
			System.out.println("VISION EXCEPTION ~ " + e);
		}
    }
    
    // flips the camera from front to back or vice versa
    // first stops the camera session, then starts it with the new camera
    // 
    public static void cameraFlip() {
    	try {
    		NIVision.IMAQdxStopAcquisition(stagValues.camSession);
			if (stagValues.camSession == stagValues.camFrontNumb) {
				stagValues.camSession = stagValues.camBackNumb;	
			} else {
				stagValues.camSession = stagValues.camFrontNumb;
			}
			NIVision.IMAQdxConfigureGrab(stagValues.camSession);
    	} catch (VisionException e) {
			System.out.println("VISION EXCEPTION ~ " + e);
		}
	}
    

}
