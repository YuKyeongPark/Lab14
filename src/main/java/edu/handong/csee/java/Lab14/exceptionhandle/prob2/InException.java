package edu.handong.csee.java.Lab14.exceptionhandle.prob2;	//package name
import java.util.InputMismatchException;	//import InputMismatchExceptionk
import java.util.Scanner;	//import Scanner

public class InException {	//InException class which is blueprint of object
	private int x = 0;	//private int type variable x
	private int y = 0;	//private int type variable y
	
	public InException() {	
		//constructor
	}
	
	public void detError() {	//method to include try-catch condition
		try {		//just be executed
			Scanner myKeyboard = new Scanner(System.in);	//Scanner instantiation
			System.out.print("x: ");	//prints "x:"
			x = myKeyboard.nextInt();	//user can input int type value into 'x' by using myKeyboard
			System.out.print("y: ");	//prints "y:"
			y = myKeyboard.nextInt();	//user can input int type value into 'y' by using myKeyboard
			System.out.print(this.x / this.y);	//prints x/y
			
		}catch(InputMismatchException ime)	//gets InputMismatchException
		{
	        System.out.println("java.util.InputMismatchException");	//prints text
	        
		}catch(ArithmeticException ae) {	//gets ArithmeticException
	        System.out.println("java.lang.ArithmeticException: " + ae.getMessage());	//prints text
	        
		}catch(Exception e) {	//gets Exception
			 System.out.println("Some other exception has occurred: " + e.getMessage());	//prints text
		}	
	}
}
