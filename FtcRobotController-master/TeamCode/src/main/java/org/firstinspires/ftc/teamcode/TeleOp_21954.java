package org.firstinspires.ftc.teamcode;

//import classes for objects;
import com.qualcomm.robotcore.eventloop.opmode.*;
import org.firstinspires.ftc.teamcode.Call_Upon_Classes.*;

@TeleOp

/*
*
* - 3 servos
* - 5 DC motors
* - 1 camera
*
* */

public class TeleOp_21954 extends LinearOpMode {
    //objects for each function of the robot
    private final org.firstinspires.ftc.teamcode.Call_Upon_Classes.Mecanum_Methods_TeleOp drivingMotors = new Mecanum_Methods_TeleOp(false);
    private final org.firstinspires.ftc.teamcode.Call_Upon_Classes.Lift_21954 lift = new Lift_21954();
    private final org.firstinspires.ftc.teamcode.Call_Upon_Classes.Intake_21954 intake = new Intake_21954();

    public void runOpMode() throws InterruptedException {
        //Initialize objects
        drivingMotors.init_drive_motors(hardwareMap);
        lift.init_lift(hardwareMap, "lift");

        waitForStart();

        while (opModeIsActive()) {
            //Driver 1 Functions


            drivingMotors.run_drive_motors(gamepad1, telemetry); //driving

            //Driver 2 Functions
            lift.runlift(gamepad2, telemetry);
            intake.runintake(gamepad2, telemetry);

            telemetry.update();
        }
    }
}
