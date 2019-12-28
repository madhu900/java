package coreexamples;

public class Bicycle {
	public int gear;
	public int speed;
	
	public Bicycle(int gear,int speed)
	{
		this.gear=gear;
		this.speed=speed;
		
	}

	public void applyBreak(int decrement)
	{
		speed-=decrement;
		
	}
	
	public void speedUp(int increment)
	{
		speed+=increment;
	}
	
	public String toString()
	{
		return("No Of Gears are:"+gear+"\n"+"speed of bicycle is:"+speed);
	}
	
}

class MountainBike extends Bicycle
{
	public int seatHeight;
	public MountainBike(int gear,int speed,int startHeight)
	{
		super(gear,speed);
		seatHeight=startHeight;
		
	}
	public void setHeight(int newValue)
	{
		seatHeight=newValue;
	}
	public String toString()
	{
		return(super.toString()+"\nseat height is:"+seatHeight);
	}
}



