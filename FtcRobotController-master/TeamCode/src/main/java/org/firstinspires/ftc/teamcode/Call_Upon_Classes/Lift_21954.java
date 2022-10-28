package org.firstinspires.ftc.teamcode.Call_Upon_Classes;

import com.qualcomm.robotcore.hardware.*;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class Lift_21954 {
    //lift power linear
    private double lp = 0;
    //lift motor linear
    private DcMotor lm = null;
    //Right bumper linear
    private boolean rb = false;
    //left bumper linear
    private boolean lb = false;

    //lift power 4 bar
    private double lp4 = 0;
    //lift servo 4 bar
    private CRServo ls4 = null;
    //Right trigger 4 bar
    private double rt = 0;
    //left trigger 4 bar
    private double lt = 0;

    private void init_lift_motor_21954(HardwareMap hardwareMap) {
        lm = hardwareMap.get(DcMotor.class, "lm");
        ls4 = hardwareMap.get(CRServo.class, "ls4");
    }
    private void run_lift_motor_21954(Gamepad gamepad, Telemetry telemetry) {
        //linear lift
        rb = gamepad.right_bumper;
        lb = gamepad.left_bumper;
        //4 bar lift
        rt = gamepad.right_trigger;
        lt = gamepad.left_trigger;
        //linear lift
        if(rb) {
            lp = 0.4;
        }
        else if(lb) {
            lp = -0.4;
        }
        else {
            lp = 0;
        }
        lm.setPower(lp);
        //4 bar lift
        if(rt > 0.5) {
            lp4 = 0.4;
        }
        else if(lt < 0.5){
            lp4 = -0.4;
        }
        else {
            lp4 = 0;
        }
        ls4.setPower(lp4);



    }

}
