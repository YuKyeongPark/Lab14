package edu.handong.csee.java.Lab14.exceptionhandle.prob6;	//package name

//CustomID class which is blueprint of object and also inherit Exception parent class.
public class CustomID extends Exception{
	//declares and initiates String array which has three races
	private String[] races = new String[] {"Vulcan", "Romulan", "Klingons"};	
	private String name = "";	//declares and initiates String type variable 'name'
	private String race = "";	//declares and initiates String type variable 'race'
	private int age = 0;	//declares and initiates int type variable 'age'
	private int state = 0;	//declares and initiates int type variable 'state'

	//throws: throws Exception from current method 'setName' to parent method 'Exception'
	public void setName(String str) throws Exception{			
		if(str.length() < 5) {	//if name length is smaller than 5
			state = 0;	//initialize 'state' variable to zero
			throw new Exception("Your name is short! Try again!");	//throws and prints exception
		}else {	//if name length is bigger than 5
			this.name = str;	//puts value of parameter 'str' into class variable  'name'
			System.out.println("Name is valid");	//	prints text	
			System.out.println("Name: " + this.name);	//prints name
			state++;	//state + 1
		}
	}
	
	//throws Exception from current method 'setAge' to parent method 'Exception'
	public void setAge(int age) throws Exception{	
		if(age < 18) {	//if age is smaller than 18
			state = 1;	//initialize 'state' to 1
			throw new Exception("You are too young! Try again!");	//throws and prints exception
		}else {	//if age is bigger than 18
			this.age = age;	//puts value of parameter 'age' into class variable  'age'
			System.out.println("Age is valid");		//prints text	
			System.out.println("Age: " + this.age);	//prints age
			state++;	//state + 1
		}

	}

	//throws Exception from current method 'setRace' to parent method 'Exception'
	public void setRace(String race) throws Exception{	
		for(int i = 0; i < races.length; i++)	//for loop is executed from i=0 to i=length of races
		{
			if(races[i].equals(race)) {	//comparing between array 'races' and parameter race, if String array 'races' equals parameter race
				this.race = races[i];	//puts value of String array 'races' into class variable 'race'
				System.out.println("Race is valid");	//prints text
				System.out.println("Race: " + races[i]);	//prints race name
				state = 0;	//sets value of state to zero
				return;	//return the  main code
			}
		}
		state = 2;	//sets state to 2
		throw new Exception("Human! Try again.");	//if invalid race is, this text is printed
	}
	
	public int getState(){	//method to get state, return type is int
		return state;	//return state
	}
}
