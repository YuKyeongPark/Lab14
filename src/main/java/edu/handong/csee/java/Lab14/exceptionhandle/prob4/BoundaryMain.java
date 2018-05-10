package edu.handong.csee.java.Lab14.exceptionhandle.prob4;	//package name

import java.util.Scanner;	//import Scanner

public class BoundaryMain {	//BoundaryMain has main method

	public static void main(String[] args) {	//main method
		Scanner keyboard = new Scanner(System.in);	//Scanner instantiation
		int num = 0;	//declares and initiates int type variable
		Boundary boundary = new Boundary();	//instantiation
		boolean repeat = true;	//initial value is true
		
		while(repeat) {	//if repeat is true, this loop is exectued
			//just be executed
			try
			{
				System.out.print("Enter an integer: ");	//prints text
				num = keyboard.nextInt();	//user can input int type value into 'n' by using myKeyboard
				boundary.receive(num);	//calls method of Boundary 'receive' 
				
			}catch(ArrayIndexOutOfBoundsException e){	//gets exception, if ArrayIndexOutOfBoundsException occurs
				System.out.println("Invalid array index access!");	//prints text about alerting full array
				repeat = false;	//Because array index is full, value of repeat changes false.
			}
		}

	}

}
