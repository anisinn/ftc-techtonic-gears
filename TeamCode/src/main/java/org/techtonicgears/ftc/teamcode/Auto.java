package org.techtonicgears.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.util.Hardware;
import com.qualcomm.robotcore.util.Range;




@Autonomous(name = "Autonomous")
public class TeleOpReal extends LinearOpMode {
    DriveTrain drive = new DriveTrain();
    GlyphArm glyphArm = new GlyphArm();
    double linearSp = 0.0d;
    double speed = 0.0d;
    double offset = 0.0d;
    double clawPos = 0.0d;
    public void runOpMode() {
        glyphArm.init(hardwareMap);
        drive.init(hardwareMap);
    }

}

