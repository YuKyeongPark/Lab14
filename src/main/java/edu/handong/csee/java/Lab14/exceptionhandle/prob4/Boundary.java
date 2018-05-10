package edu.handong.csee.java.Lab14.exceptionhandle.prob4;	//package name

public class Boundary {	//Boundary class which is blueprint of object
	private int arr[] = new int[5];	//instantiation
	private int count = 0;	//declares and initiates private int type varible 'count'
	
	public void receive(int num) throws ArrayIndexOutOfBoundsException{	//throws: throws ArrayIndexOutOfBoundsException from current method to parent method
		arr[count] = num;	//inputs value of num into arr[count]
		count++;	//count + 1
		System.out.println("arr[" + count + "] <- " + num);	//prints arr[n] <- num
	}
	
}
