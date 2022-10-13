package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {
	public static void main(String[] args) {
		AddressBook addressBook = new AddressBook();
		Scanner sc = new Scanner(System.in);
		int operationNo;
		
		do {
			System.out.println("***Welcome to Address Book Program***");
			System.out.println("1. ADD CONTACT \n2. DISPLAY CONTACT \n3. EDIT CONTACT \n4. DELETE CONTACT \n5. EXIT ");
			System.out.println("Enter the Operation Number");
			operationNo = sc.nextInt();
			
			switch (operationNo) {
			case 1:
				addressBook.addContact();
				break;
			case 2:
				addressBook.displayContact();
				break;
			case 3:
				addressBook.editContact();
				break;
			case 4:
				addressBook.deleteContact();
				break;
			default:
				System.out.println("Wrong Operation Number");	
				break;
			}
		} while (operationNo != 5);
	}
}
