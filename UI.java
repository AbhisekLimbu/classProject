
public class UI {
    private boolean runState;
    private int holdTemp = 68;
    private String rMode = "heat";

    // Getter and setter for runState
    public boolean getRunState() {
        return runState;
    }

    public void setRunState(boolean runState) {
        this.runState = runState;
    }

    // Getter for holdTemp, hardcoded to 68 degrees for testing simplicity
    public int getHoldTemp() {
        return holdTemp;
    }

    // Getter for rMode, initially hardcoded to "heat" for testing purposes
    public String getRMode() {
        return rMode;
    }

    // Method to print status to console
    public void printStatus(int currTemp, boolean commandMode) {
        System.out.println("Hold Temp: " + getHoldTemp() + " | Mode: " + getRMode() + " | Furnace State: " + convertBool(getRunState()) + " | Current Temp: " + currTemp + " | Command Mode: " + convertBool(commandMode));
    }

    // Method to convert boolean to string "On" or "Off"
    private String convertBool(boolean isOn) {
        return isOn ? "On" : "Off";
    }
}
