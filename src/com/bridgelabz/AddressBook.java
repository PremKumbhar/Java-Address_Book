package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {
	Scanner sc = new Scanner(System.in);

	Contact contact = new Contact();

	public void addContact() {
		System.out.println("Enter the First Name : ");
		contact.setFirstName(sc.next());
		System.out.println("Enter the Last Name : ");
		contact.setLastName(sc.next());
		System.out.println("Enter the Street : ");
		contact.setStreet(sc.next());
		System.out.println("Enter the City : ");
		contact.setCity(sc.next());
		System.out.println("Enter the State : ");
		contact.setState(sc.next());
		System.out.println("Enter the ZipCode : ");
		contact.setZip(sc.nextInt());
		System.out.println("Enter the Mobile no : ");
		contact.setPhoneNo(sc.nextLong());
		System.out.println("Enter the Email Id : ");
		contact.setEmail(sc.next());
	}
	public void  displayContact() {
		System.out.println(contact.toString());
	}
}
