package edu.handong.csee.java.Lab14.exceptionhandle.prob1;//package name

public class SpeedLimiter {	//SpeedLimiter class which is blueprint of object
	private int limit = 0;	//declares and initiates int type variable named limit
	private int speed = 0;	//declares and initiates int type variable named speed
	
	public SpeedLimiter(int limit, int speed) {	//constructor has two parameters
		this.limit = limit;	//puts value of parameter 'limit' into class variable 	
		this.speed = speed;	//puts value of parameter 'speed' into class variable 

	}
	
	public void warnSpeedLimit() {	//method to try-catch
		//just be executed
		try {
			if(this.speed > this.limit)	//if value of speed is greater than limit's
			{
				throw new Exception("Speed limit " + this.limit + "km exceeded!");	//exception occur
			}
			System.out.println("You are a law abiding citizen!");	//if speed < limit, this text is printed
		}catch(Exception e) {	//gets exception
			System.out.println(e.getMessage());	//print message
			System.out.println("You are being fined. ");	//print text
		}
		
		System.out.println("Your current speed: " + this.speed);	//prints speed

	}
}
