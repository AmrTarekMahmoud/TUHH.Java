package diss;

public class Tank {
	private double totalVolume;
	private double filllevel=0;
	
	public Tank(double totalVolume) {
		this.totalVolume = totalVolume;
	}
	
	public double fill(double inputFuelValue) {
		double amountEntered;
		if(filllevel+inputFuelValue <= totalVolume)
		{
			filllevel=filllevel+inputFuelValue;
			return inputFuelValue;
		}
		else {
			amountEntered=totalVolume-filllevel;
			return amountEntered;
			 }
		
	}
	
	public double consume(double amountConsume) {
		if(totalVolume<=amountConsume) {
			return amountConsume;
		}
		else {
			return totalVolume;
		}
	}
	public double getLevel()
	{
		return filllevel;
	}
	
	
}
