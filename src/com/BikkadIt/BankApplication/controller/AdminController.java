package com.BikkadIt.BankApplication.controller;

import java.util.Scanner;

import com.BikkadIt.BankApplication.service.ServiceImpl;

public class AdminController {
		
	public static void main(String[] args) {
		
		ServiceImpl service=new ServiceImpl();
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		while(flag) 
			{
		System.out.println("\n*****Welcome to Bank Application*****");
		System.out.println("1. Press 1 for creating bank account ");
		System.out.println("2. Press 2 for view account details ");
		System.out.println("3, Press 3 for Withdraw amount ");
		System.out.println("4. Press 4 for deposit Money ");
		System.out.println("5. Press 5 for update account ");
		System.out.println("6. Press 6 for exit");
		
		int ch=sc.nextInt();
		switch (ch) {
		case 1: 
			service.createAccount();
			break;
	
		case 2:
			service.viewAccount();
			break;
			
		case 3: 
			service.withdrawAmnt();
			break;
	
		case 4:
			service.depositAmnt();
			break;
			
		case 5: 
			service.updateAccount();
			break;
				
		case 6:
			flag=false;
			break;
			
		default:
				System.out.println("Invalid choice ");
		}
		}
	}
}
