
package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class OuttakeSubsystem extends SubsystemBase {

    private Servo outtakeMotor;

    public OuttakeSubsystem() {
        outtakeMotor = new Servo(0);
    }

    public void rotateOuttake(double speed, double angle) {
        outtakeMotor.setAngle(angle);
        outtakeMotor.setSpeed(speed);
    }
    
    @Override
    public void periodic() {
        SmartDashboard.putNumber("Angle", outtakeMotor.getAngle());
        SmartDashboard.putNumber("Speed", outtakeMotor.getSpeed());
    }
}
