package edu.handong.csee.java.Lab14.exceptionhandle.prob1;//package name
import java.util.Random;	//import Random class
import java.util.Scanner;	//import Scanner class

public class Main {		//Main is class name and modifier is public.

	public static void main(String[] args) {	//main method

		Scanner myKeyboard = new Scanner("System.in");	//Scanner instantiation
		Random randomNum = new Random();	//Random instantiation
		int limit =0, speed = 0;	//declares and initiates variables
		
		System.out.println("Set the speed limit, officer: ");	//prints text
		limit = myKeyboard.nextInt();	//user can input int type value into limit by using myKeyboard
		speed = randomNum.nextInt(101);	//range : 0-100
		
		SpeedLimiter speedLimiter = new SpeedLimiter(limit, speed);	//SpeedLimiter instantiation
		speedLimiter.warnSpeedLimit();	//calls SpeedLimiter's method warnSpeedLimit 
		
		myKeyboard.close();	//keyboard close
	}

}
