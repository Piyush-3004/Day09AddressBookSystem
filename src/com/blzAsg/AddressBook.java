package com.blzAsg;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Contact> contactDetails = new ArrayList<Contact>();

		AddressBook.addContact(contactDetails);
		AddressBook.addNewContact(contactDetails);
		AddressBook.viewEmp(contactDetails);
	}

	static void addNewContact(ArrayList<Contact> contactDetails) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Name : ");
		String firstName = scanner.next();
		System.out.println("Enter Last Name : ");
		String lastName = scanner.next();
		System.out.println("Enter Address : ");
		String address = scanner.next();
		System.out.println("Enter City : ");
		String city = scanner.next();
		System.out.println("Enter State : ");
		String state = scanner.next();
		System.out.println("Enter ZipCode : ");
		int zipCode = scanner.nextInt();
		System.out.println("Enter Mobile Number : ");
		long phonenumber = scanner.nextLong();
		System.out.println("Enter EmailId : ");
		String emailId = scanner.next();
		Contact person = new Contact(firstName, lastName, address, city, state, zipCode, phonenumber, emailId);
		contactDetails.add(person);

	}

	static void addContact(ArrayList<Contact> contactDetails) {

		Contact add1 = new Contact("Pyush", "Patil", "Nashik", "Nashik", "Maharashtra", 422001, 901155747,
				"piyushp@gmail.com");
		contactDetails.add(add1);
	}

	static void viewEmp(ArrayList<Contact> contactDetails) {
		for (int i = 0; i < contactDetails.size(); i++) {
			System.out.println(contactDetails.get(i));
		}
	}

}
