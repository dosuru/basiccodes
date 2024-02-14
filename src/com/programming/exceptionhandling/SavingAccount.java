package com.programming.exceptionhandling;

public class SavingAccount {
	long id;
	double balance;
	SavingAccount(long id,double balance){
		this.id=id;
		this.balance=balance;
		
	}
	public double withDraw(double amount) throws IllegalBankTransactionException, InsufficientBalanceException {
		if(amount==0 || amount>balance) {
			throw new InsufficientBalanceException("Insufficient balance");
			
		}else if(amount<0) {
			throw new IllegalBankTransactionException("enter proper value");
		}
		else {
			System.out.println("withdraw completed");
		}
		return 0;
	}
	

	public static void main(String[] args) {
		SavingAccount s = new SavingAccount(1,200);
		try {
			s.withDraw(-2);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		
		
		

	}

}
