package edu.handong.csee.java.Lab14.exceptionhandle.prob3;	//package name

public class Powercalc {	//Powercalc class which is blueprint of object
	public long power(int n, int p) throws Exception{	//throws: throws Exception from current method to parent method
		long result = 0;	//declares and initiates long type variable 'result'
		result = (long)Math.pow(n, p);	//result is n^p and return type of Math.pow is double, so it must be casted to long
		
		if(n == 0 && p == 0)	//if n and p are zero,
			throw new Exception("n and p should not be zero.");	//throw Exception with text
		if(n < 0 || p < 0)	//if n or p are smaller than zero,
			throw new Exception("n or p should not be negative.");	//throw Exception with text
		
		return result;//return value of result 

	}
}
