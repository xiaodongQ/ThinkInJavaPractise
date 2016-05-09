package chp10.innerclass.controller;

public class GreenhouseController {
	public static void main(String[] args) {
		GreenhouseControls gc = new GreenhouseControls();
		GreenhouseControls2 gc2 = new GreenhouseControls2();
//		gc.addEvent(gc.new Beel(900));
		Event[] eventList = {
				gc.new ThermostatNight(0),
				gc.new LightOn(200),
				gc.new LightOff(400),
				gc.new WaterOn(600),
				gc.new WaterOff(800),
				gc.new WindOn(800),
				gc.new WindOff(700),
				gc.new ThermostatDay(1400)
		};
		gc.addEvent(gc.new Restart(2000, eventList));
		Event[] eventList2 = {
				gc2.new ThermostatNight(0),
				gc2.new LightOn(200),
				gc2.new LightOff(400),
				gc2.new WaterOn(600),
				gc2.new WaterOff(800),
				gc2.new WindOn(800),
				gc2.new WindOff(700),
				gc2.new waterMachineOn(800),
				gc2.new waterMachineOff(700),
				gc2.new ThermostatDay(1400)
		};
		gc2.addEvent(gc2.new Restart(2000, eventList2));
		if(args.length == 1) {
			gc.addEvent(
				new GreenhouseControls.Terminate(
						new Integer(args[0])));
		}
		gc.run();
		gc2.run();
	}
}
