package edu.handong.csee.java.Lab14.exceptionhandle.prob6;	//package name
import java.util.Scanner;	//import Scanner

public class CustomIDMain {	//CustomIDMain class has main method
	public static void main(String[] args) {	//main method
		String race, name; //declares String type variable 'race' and 'name'
		int age = 0;	//declares and initiates int type varaible 'age'
		Scanner myKeyboard = new Scanner(System.in);	//Scanner instantiation
		CustomID cid = new CustomID();	//CustomID constructor
		boolean repeat = true;	//declares boolean type 'repeat' variable and initiates true
		while(repeat)	//if repeat is true, the while loop continues to execute.
		{
			try {	//just be executed
				if(cid.getState() == 0) {	//if state is zero(initial state, name lengh is smaller than 5 or all information is entered)
					System.out.print("Enter your name: ");	//prints text
					name = myKeyboard.nextLine();	//user can input String type value into 'name' by using myKeyboard
					cid.setName(name);	//calls setName method
				}
				else if(cid.getState() == 1) {	//if state is 1(age is smaller than 18)
					System.out.print("Enter your age: ");	//prints text
					age = myKeyboard.nextInt();	//user can input int type value into 'age' by using myKeyboard
	
					myKeyboard.nextLine();	//prints nextline
					cid.setAge(age);	//calls setAge method and setting age into 'age' variable
				}else if(cid.getState() == 2) {	//if state is 2(if invalid race is)
					System.out.print("Enter your race: ");	//prints text
					race = myKeyboard.nextLine();	//user can input String type value into 'race' by using myKeyboard
					cid.setRace(race);	//calls setRace method
				}
			}
			catch(Exception e) {	//gets exception
				System.out.println(e.getMessage());	//print message
				continue;	//ignore and continue execute

			}
		}
	}
}

				
			
		
	

