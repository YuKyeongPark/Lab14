package edu.handong.csee.java.Lab14.exceptionhandle.prob5;	//package name
import java.util.Scanner;	//import Scanner

public class MyExceptionMain {	//MyExceptionMain method has main method

	public static void main(String[] args) {	//main method
		try {
			Scanner keyboard = new Scanner(System.in);	//Scanner instantiation
	        String str = keyboard.nextLine();	//User can input string by using keyboard
	        MyExceptionMain.test(str); //calls own method 'test'
		}catch(MyException mae) {	//gets MyException
			System.out.println("Inside catch block: " + mae);	//prints text relating exception
		}
	}
	
	//throws Exception from current method to parent method 
	static public void test(String str) throws MyException { 
		if(str.equals("null")) {	//if str is "null" received as input,
			throw new MyException("String val is null");	//prints text about null	
		}else	//if str isn't "null",
			System.out.println("String val is " + str);	//prints str
	}

}
