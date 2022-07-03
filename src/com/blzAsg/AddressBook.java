package com.blzAsg;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

	public static void main(String[] args) {

		ArrayList<Contact> contactDetails = new ArrayList<Contact>();

		AddressBook.addContact(contactDetails);
		AddressBook.addNewContact(contactDetails);
		AddressBook.viewContact(contactDetails);
		AddressBook.editContact(contactDetails);
	}

	static void editContact(ArrayList<Contact> contactDetails) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name to update the info");
		String name = scanner.next();
		for (int i = 0; i < contactDetails.size(); i++) {
			System.out.println(contactDetails.get(i).first_Name);

			if (contactDetails.get(i).first_Name.equals(name)) {
				System.out.println(
						"Enter 1 to change firstname , 2 to chnage lastname , 3 to change address , 4 to change City \n 5 tochange state, 6 to change zipcode , 7 to change obilenumber , 8 to change Email.");
				int op = scanner.nextInt();
				switch (op) {
				case 1:
					System.out.println("Enter new name");
					String newName = scanner.next();
					contactDetails.get(i).first_Name = newName;
					break;
				case 2:
					String newLastName = scanner.next();
					contactDetails.get(i).last_Name = newLastName;
					break;
				case 3:
					String newAddress = scanner.next();
					contactDetails.get(i).address = newAddress;
					break;
				case 4:
					String newCity = scanner.next();
					contactDetails.get(i).city = newCity;
					break;
				case 5:
					String newState = scanner.next();
					contactDetails.get(i).state = newState;
					break;
				case 6:
					int newZipCode = scanner.nextInt();
					contactDetails.get(i).zip_Code = newZipCode;
					break;
				case 7:
					int newPhoneNumber = scanner.nextInt();
					contactDetails.get(i).phone_Number = newPhoneNumber;
					break;
				case 8:
					String newEmail = scanner.next();
					contactDetails.get(i).email = newEmail;
					break;
				}
			}
		}
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

	static void viewContact(ArrayList<Contact> contactDetails) {
		for (int i = 0; i < contactDetails.size(); i++) {
			System.out.println(contactDetails.get(i));
		}
	}

}
