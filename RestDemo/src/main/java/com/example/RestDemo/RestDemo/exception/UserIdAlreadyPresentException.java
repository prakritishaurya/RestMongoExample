package com.example.RestDemo.RestDemo.exception;

public class UserIdAlreadyPresentException extends Exception{
	public UserIdAlreadyPresentException(String message){
		super(message);
	}
}
