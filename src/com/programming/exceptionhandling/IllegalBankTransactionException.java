package com.programming.exceptionhandling;

public class IllegalBankTransactionException extends Exception {
	public IllegalBankTransactionException(String msg) {
		super(msg);
	}

}
