//package org.firstinspires.ftc.teamcode.Autonomous;
//
//import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
//
//@Autonomous
//public class Red_Left_21_RR extends  Auto_Base_21 {
//    public void runOpMode() throws InterruptedException {
//        init_classes(true);
//        waitForStart();
//        //one tile is 24 in
//        //START
//        //Scan cone
//        lift.run_lift_21945_auto(telemetry, 0.5);
//        simpleWait(10);
//        camera.init_camera(hardwareMap, "webcam", telemetry);
//        zone = camera.zone();
//        //Move forward
//        auto_motors.goToSpot(15, 0.5);
//        while (auto_motors.isBusy()){
//        }
//        lift.run_lift_21945_auto(telemetry, 0);
//        simpleWait(1000);
//        if (placeCone) {
//            //Lift 4-Bar up over chassis
//            lift.run_lift_21945_auto(telemetry, 0.15);
//            simpleWait(1000);
//            //turntable left 90 degrees
//            turntable.run_turntable_21945_auto(telemetry, 0.0);
//            simpleWait(1000);
//            //4-bar down to put cone in junction
//            lift.run_lift_21945_auto(telemetry, 0.05);
//            simpleWait(1000);
//            //intake out
//            intake.run_intake_21945_auto(telemetry,  1);
//            simpleWait(1000);
//            intake.run_intake_21945_auto(telemetry,  0);
//            //4-Bar up
//            lift.run_lift_21945_auto(telemetry, 0.15);
//            simpleWait(1000);
//            //turntable right 90 degrees
//            turntable.run_turntable_21945_auto(telemetry, 0.5);
//            simpleWait(1000);
//            //4-Bar down
//            lift.run_lift_21945_auto(telemetry, 0);
//            simpleWait(1000);
//        }
//        //drive forward to middle
//        auto_motors.goToSpot(10, 0.5);
//        while (auto_motors.isBusy()){
//        }
//        //SPLIT TO PARK
//        //LEFT (1)
//        if (zone == 1) {
//            auto_motors.strafeLeft(0.5, 24);
//            //stop
//        }
//        //Middle (2)
//        else if (zone == 2) {
//            //stop
//        }
//        //Right
//        else if (zone == 3) {
//            auto_motors.strafeRight(0.5, 24);
//            //stop
//        }
//    }
//}
//
