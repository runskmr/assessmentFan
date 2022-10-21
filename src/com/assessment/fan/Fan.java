package com.assessment.fan;

public class Fan {
	
	private int direction = 1; // 1 - Forward, -1 - Reverse
	
	private int speed = 0; // upto 3
	
	public void increaseSpeed()
	{
		if(speed == 3)
			speed = 0;
		else
			speed++;
	}
	
	public void changeDirection()
	{
		direction = direction == 1 ? -1 : 1;
	}

	public String getDirection()
	{
		return direction == 1 ? "Forward" : "Reverse";
	}

	public int getSpeed()
	{
		return speed;
	}
	
	public String getStatus()
	{
		String s = "Fan speed %d & Direction %s";
		return String.format(s, getSpeed(), getDirection());
	}
	
	public static void main(String[] args)
	{
		Fan fan = new Fan();
		System.out.println(fan.getDirection());
		System.out.println(fan.getSpeed());
		fan.increaseSpeed();
		System.out.println(fan.getStatus());

	}

}
