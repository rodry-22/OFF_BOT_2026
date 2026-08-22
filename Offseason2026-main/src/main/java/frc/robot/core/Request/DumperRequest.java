package frc.robot.core.Request;

import com.stzteam.features.marsprocessor.CreateCommand;
import com.stzteam.features.marsprocessor.RequestFactory;
import com.stzteam.mars.diagnostics.ActionStatus;
import com.stzteam.mars.requests.Request;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.units.measure.Angle;
import edu.wpi.first.util.datalog.DoubleLogEntry;
import frc.robot.core.modules.superstructure.modules.DumperModule.DumperIO;
import frc.robot.core.modules.superstructure.modules.DumperModule.DumperIO.DumperInputs;
import frc.robot.core.modules.superstructure.modules.DumperModule.DumperIOKraken.DumperMODE;

@RequestFactory
public interface DumperRequest extends Request<DumperInputs, DumperIO>{
/* 
    @CreateCommand(name = "stop")
    public static class  Idle implements DumperRequest {
        @Override 
        public ActionStatus apply(DumperInputs data, DumperIO actor){
            actor.stopAll();
            return ActionStatus.of(DumperCode.RESET, "Reseted");
        }
    }

    @CreateCommand(name = "ToAngle")
    public static class setAngle implements DumperRequest{
        private double angle;
        private double tolerance;
        private DumperMODE mode = DumperMODE.kBACK;

        public setAngle(double initialAngle){
            this.angle = initialAngle;
        }

        public setAngle whiAngle(Double angle){
            this.angle = angle;
            return this;
        }

        public setAngle whitMode(DumperMODE mode){
            this.mode = mode;
            return this;
        }

        public setAngle Tolerance(double tolerance){
            this.tolerance = tolerance;
            return this;
        }

       @Override
        public ActionStatus apply(DumperInputs parameters, DumperIO actor) {
            parameters.TargetAngle = angle;
            actor.setPosition(angle, mode);

            boolean isAtTarget = MathUtil.isNear(angle, parameters.position, tolerance);



        }

        

    }*/

    
}
