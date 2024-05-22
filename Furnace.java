import java.util.TimerTask;

public class Furnace extends TimerTask {
    private TempSensor tempSensor;
    private UI ui;

    public Furnace(TempSensor tempSensor, UI ui) {
        this.tempSensor = tempSensor;
        this.ui = ui;
    }

    @Override
    public void run() {
        int holdTemp = ui.getHoldTemp();
        int currTemp = tempSensor.takeTemp();
        boolean runState = ui.getRunState();
        boolean commandMode;

        if (runState && currTemp > holdTemp + 2) {
            commandMode = false; // Set command mode to Off
        } else if (!runState && currTemp < holdTemp - 2) {
            commandMode = true; // Set command mode to On
        } else {
            commandMode = ui.getRunState(); // Maintain previous command mode
        }

        ui.printStatus(currTemp, commandMode);
        ui.setRunState(commandMode);
    }
}
