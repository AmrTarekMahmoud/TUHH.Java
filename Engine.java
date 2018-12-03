package diss;

public class Engine {
	private double fuelConsumption;
	private double speed;
	private double tankVolume;
	private double distanceTotal=0;
	private double distanceSinceFilled=0;	
	
	private Tank tank;

	public Engine( double fuelConsumption, double speed, double tankVolume ) {
		this.fuelConsumption=fuelConsumption;
		this.speed=speed;
		this.tankVolume=tankVolume;	
		this.tank=new Tank(tankVolume);
	}
	
	public double run() {
		tank.consume(amountConsume)
	}
	public void resetMeter() {
		distanceSinceFilled=0;
		
	}
	

}
