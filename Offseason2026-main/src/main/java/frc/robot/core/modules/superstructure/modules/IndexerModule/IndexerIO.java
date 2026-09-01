package frc.robot.core.modules.superstructure.modules.IndexerModule;

import com.stzteam.features.marsprocessor.Fallback;
import com.stzteam.features.unitprocessor.Unit;
import com.stzteam.mars.models.singlemodule.Data;
import com.stzteam.mars.models.singlemodule.IO;

@Fallback
public interface IndexerIO extends IO<IndexerIO.IndexerInputs> {

    public static class IndexerInputs extends Data<IndexerInputs> {
        @Unit(value = "Volts", group = "Indexer")
        public double rollerVolts = 0;

        @Unit(value = "RPS", group = "Indexer")
        public double rollerRPS = 0;

        @Unit(value = "Volts", group = "Indexer")
        public double indexerVolts = 0;

        @Unit(value = "RPS", group = "Indexer")
        public double indexerRPS = 0;


        @Override
        public IndexerInputs snapshot() {
            IndexerInputs clone = new IndexerInputs();
            clone.rollerVolts = this.rollerVolts;
            clone.rollerRPS = this.rollerRPS;
            clone.indexerVolts = this.indexerVolts;
            clone.indexerRPS = this.indexerRPS;
            return clone;
        }
    }

    public void applyRollers(@Unit(value = "Volts", group = "Indexer") double volts);
    //Function to apply voltage to the rollers' motor
    public void applyIndexer(@Unit(value = "Volts", group = "Indexer") double volts);
    //Function to apply voltage to the indexer's motor

    public void setRollers(@Unit(value = "RPS", group = "Indexer") double RPS);
    //Function to set rollers with RPS
    public void setIndexer(@Unit(value = "RPS", group = "Indexer") double RPS);
    //Function to set index with RPS

    public void stopRollers();
    public void stopIndexer();

    public void stopAll();
    //Function to stop both motors

}
