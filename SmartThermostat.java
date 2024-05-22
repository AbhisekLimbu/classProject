import java.util.Timer;

public class SmartThermostat{
	
	public static void main(String[] args) {
		Timer timer = new Timer();
		UI myUI = new UI();
		TempSensor myTS = new TempSensor();
		
		String runMode = myUI.getRMode();
		
		if ("heat".equals(runMode)) { // Corrected comparison
			timer.schedule(new Furnace(myTS, myUI),
            	0,        //startup delay
            	1000);  //milliseconds between cycles
		} else if ("cool".equals(runMode)) { // Corrected comparison
			timer.schedule(new AirConditioner(myTS, myUI),
                0,        //startup delay
                1000);  //milliseconds between cycles
		}
	}
}
