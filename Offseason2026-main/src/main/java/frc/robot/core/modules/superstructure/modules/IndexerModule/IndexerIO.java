package frc.robot.core.modules.superstructure.modules.IndexerModule;

import com.stzteam.features.marsprocessor.Fallback;
import com.stzteam.features.unitprocessor.Unit;
import com.stzteam.mars.models.singlemodule.Data;
import com.stzteam.mars.models.singlemodule.IO;

@Fallback
public interface IndexerIO extends IO<IndexerIO.IndexerInputs> {

    public static class IndexerInputs extends Data<IndexerInputs> {
        @Unit(value = "Volts", group = "Indexer")
        public double appliedVolts = 0;

        @Unit(value = "RPS", group = "Indexer")
        public double VelocityRPS = 0;

        public double Current = 0;

        @Override
        public IndexerInputs snapshot() {
            IndexerInputs clone = new IndexerInputs();
            clone.appliedVolts = this.appliedVolts;
            clone.VelocityRPS = this.VelocityRPS;
            return clone;
        }
    }

    public void applyOutput(@Unit(value = "Volts", group = "Indexer") double volts);

    public void stopAll();

}
