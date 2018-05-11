package edu.handong.csee.java.Lab14.exceptionhandle.prob5;	//package name
	
//MyException class is created and also inherit Exception parent class.
public class MyException extends Exception{	
	String str = null;
	
	public MyException(){	//receiving error message through constructor
		super();	//inherit parent class and receive the error message
	}	
	
	public MyException(String str) {	//constructor
		super(str);	//inherit parent class and receive the error message
		this.str = str;	//puts parameter value into this class' variable str
	}
	public String toString() {	//print the received error message
		return str;	//return str
	}
}
