package pedroPathing;


import com.pedropathing.follower.Follower;
import com.pedropathing.localization.Pose;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import java.util.Timer;

@Autonomous(name = "test2", group = "pid")
public class test2 {
private Follower follower;
private Timer pathTimer, actionTimer, opmodeTimer;
private int pathState;
private final Pose startPose = new Pose(12, 85, Math.toRadians(0));
private final Pose goalPose = new Pose(36, 85, Math.toRadians(0));
}
public void autonomousPathUpdate(){
    switch (pathState){
        follower.followPath(goalPose);
        setPathState(1);
    }


    public void setPathState(int pstate){
        pathState =
    }
}
