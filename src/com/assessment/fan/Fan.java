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
	
	public String getStatus()
	{
		String s = "Fan speed %d & Direction %s";
	
		String sDirection = direction == 1 ? "Forward" : "Reverse";
		
		return String.format(s, speed, sDirection);
	}
	
	public static void main(String[] args)
	{
		Fan fan = new Fan();
		fan.increaseSpeed();
		fan.increaseSpeed();
		System.out.println(fan.getStatus());
	}

}
