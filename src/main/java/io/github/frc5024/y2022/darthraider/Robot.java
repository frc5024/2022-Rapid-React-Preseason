package io.github.frc5024.y2022.darthraider;

import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import io.github.frc5024.lib5k.autonomous.RobotProgram;

public class Robot extends RobotProgram {

    public Robot() {
        super(false, true, Shuffleboard.getTab("Main"));
    }

    @Override
    public void autonomous(boolean init) {
    }

    @Override
    public void disabled(boolean init) {
    }

    @Override
    public void teleop(boolean init) {
    }

    @Override
    public void test(boolean init) {
    }

	@Override
	public void periodic(boolean init) {
		// TODO Auto-generated method stub
		
	}
}