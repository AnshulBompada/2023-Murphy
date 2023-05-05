
package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.PWMVictorSPX;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveSubsystem extends SubsystemBase{

    private PWMVictorSPX leftFrontMotor;
    private PWMVictorSPX leftBackMotor;
    private PWMVictorSPX rightFrontMotor;
    private PWMVictorSPX rightBackMotor;

    private MotorControllerGroup leftMotors;
    private MotorControllerGroup rightMotors;

    private DifferentialDrive robotDrive;
    
    public DriveSubsystem() {
        leftFrontMotor = new PWMVictorSPX(4);
        leftBackMotor = new PWMVictorSPX(2);
        rightFrontMotor = new PWMVictorSPX(1);
        rightBackMotor = new PWMVictorSPX(3);

        leftMotors = new MotorControllerGroup(leftFrontMotor, leftBackMotor);
        rightMotors = new MotorControllerGroup(rightFrontMotor, rightBackMotor);

        rightMotors.setInverted(false);

        robotDrive = new DifferentialDrive(leftMotors, rightMotors);
    }

    public void arcadeDrive(double speed, double rotation) {
        robotDrive.arcadeDrive(speed, rotation);
    }

    @Override
    public void periodic() {
        SmartDashboard.putNumber("Left Front Motor", leftFrontMotor.get());
        SmartDashboard.putNumber("Left Back Motor", leftBackMotor.get());
        SmartDashboard.putNumber("Right Front Motor", rightFrontMotor.get());
        SmartDashboard.putNumber("Right Back Motor", rightBackMotor.get());
    }
}
