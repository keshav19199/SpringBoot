package com.School.Management.exception;

public class InvalidMobileNoException extends Exception{
	
	public InvalidMobileNoException(int mobile)
	{
		super("Invalid mobile number..!!"+ mobile);
	}

}
