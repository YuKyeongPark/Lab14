package edu.handong.csee.java.Lab14.exceptionhandle.prob3;	//package name

import java.util.Scanner;	//import Scanner

public class PowercalcMain {	//PowercalcMain class has main method
	public static final Powercalc myCalculator = new Powercalc();	//Powercalc instantiation
	public static final Scanner myKeyboard = new Scanner(System.in);	//Scanner instantiation
	
	public static void main(String[] args) {	//main method
		while(myKeyboard.hasNextInt()) {	//this while loop is executed until int type value which user inputs into myKeybord doesn't exist
			int n = myKeyboard.nextInt();	//user can input int type value into 'n' by using myKeyboard
			int p = myKeyboard.nextInt();	//user can input int type value into 'p' by using myKeyboard
			
			//just be executed
			try {
				System.out.println(myCalculator.power(n, p));	//calls method of Powercalc 'power' and checks if the condition is met.
			}catch (Exception e) {	//gets exception
				System.out.println(e);	//print exception
			}
		}
	}

}
