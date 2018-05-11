package edu.handong.csee.java.Lab14.exceptionhandle.prob4;	//package name

import java.util.Scanner;	//import Scanner

public class BoundaryMain {	//BoundaryMain has main method

	public static void main(String[] args) {	//main method
		Scanner keyboard = new Scanner(System.in);	//Scanner instantiation
		int num = 0;	//declares and initiates int type variable
		Boundary boundary = new Boundary();	//instantiation
		boolean repeat = true;	//initial value is true
		
		while(repeat) {	//if repeat is true, the while loop continues to execute.If repeat is false, the loop is finished. 
			//just be executed
			try
			{
				System.out.print("Enter an integer: ");	//prints text
				num = keyboard.nextInt();	//user can input int type value into 'num' by using myKeyboard
				boundary.receive(num);	//calls method of Boundary 'receive' 
				
			}catch(ArrayIndexOutOfBoundsException e){	//ArrayIndexOutOfBoundsException occurs and gets this exception
				System.out.println("Invalid array index access!");	//prints text about alerting full array
				repeat = false;	//Because array index is full, value of repeat changes false.
			}
		}

	}

}
