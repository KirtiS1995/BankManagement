package com.BikkadIt.BankApplication.service;

import java.util.Scanner;

import com.BikkadIt.BankApplication.model.Account;

public class ServiceImpl implements ServiceI{
	Scanner sc=new Scanner(System.in);
	Account acc=new Account();
	@Override
	public void createAccount() {

		System.out.println("Enter account number ");
		int accntNo=sc.nextInt();
		acc.setAccntNo(accntNo);
		
		System.out.println("Enter Your name ");
		String accntName=sc.next();
		acc.setAccntName(accntName);
		
		System.out.println("Enter your address ");
		String address=sc.next();
		acc.setAddress(address);
		
		System.out.println("Enter PAN no ");
		String panNo=sc.next();
		acc.setPanNo(panNo);
		
		System.out.println("Enter Amount to be deposited");
		Double amnt=sc.nextDouble();
		acc.setAmnt(amnt);
		
		System.out.println("Account created successfully.. ");
	}

	@Override
	public void viewAccount() {
		// TODO Auto-generated method stub
		System.out.println("\nBy using  getter() method ");
		System.out.println("	Account NO = "+acc.getAccntNo());
		System.out.println("	User NAme = "+acc.getAccntName());
		System.out.println("	Address = "+acc.getAddress());
		System.out.println("	PAN number = "+acc.getPanNo());
		System.out.println("	Amount in account = "+acc.getAmnt());
		
		System.out.println("\nBy using toString() method ");
		System.out.println(acc);
		System.out.println("\n");
	}

	
	public void withdrawAmnt() {
		System.out.println("  Enter amount you want to withdraw");
		double userAmnt=sc.nextDouble();
		if(userAmnt < acc.getAmnt())
		{
		 double reamainAmnt=acc.getAmnt() - userAmnt;
		 acc.setAmnt(reamainAmnt);
		 System.out.println("Amount withdrawn successfully....Your current bank balance = "+acc.getAmnt());
			System.out.println("\n");
		}
	}

	public void depositAmnt() {
		System.out.println("  Enter amount you want to deposit");
		 double userAmnt=sc.nextDouble();
		
		 double newAmnt=acc.getAmnt() + userAmnt;
		 acc.setAmnt(newAmnt);
		 System.out.println("Amount deposited successfully....Your current bank balance = "+acc.getAmnt());
			System.out.println("\n");
	 }

	@Override
	public void updateAccount() {
		System.out.println("Enter account number for update ");
		int accntNo=sc.nextInt();
		if(accntNo == acc.getAccntNo())
		{
			boolean flag=true;
			while(flag) {
			System.out.println("	Press 1 to update name ");
			System.out.println("	Press 2 for update address ");
			System.out.println("	Press 3 for update PAN NO ");
			System.out.println("	Press 4 for exit ");
			int ch=sc.nextInt();
		
			switch (ch) {
			case 1:
				System.out.println("Enter name you wanrt to update ");
				String newName=sc.next();
				acc.setAccntName(newName);
				System.out.println("Updated name = "+acc.getAccntName());
				System.out.println("\n");
			break;
			
			case 2:
				System.out.println("Enter Address you want to update ");
				String newAddress=sc.next();
				acc.setAddress(newAddress);
				System.out.println("Updated address = "+acc.getAddress());
				System.out.println("\n");
			break;
			
		case 3:
				System.out.println("Enter PAN number you want to update ");
				String newPAN=sc.next();
				acc.setPanNo(newPAN);
				System.out.println("Updated PAN number = "+acc.getPanNo());
				System.out.println("\n");
			break;
		
		case 4:
			flag=false;
			break;
			
		}
		}
		}
	}

}
