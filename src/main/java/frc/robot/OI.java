package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;

public class OI {
	private static OI mInstance = null;

	private XboxController controller;

	public static OI getInstance(){
		if(mInstance == null){
			mInstance = new OI();
		}

		return mInstance;
	}

	private OI(){
		controller = new XboxController(0);

	}

	public double getSpeed(){
		return controller.getTriggerAxis(Hand.kRight);
	}





}
