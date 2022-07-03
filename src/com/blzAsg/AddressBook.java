package com.blzAsg;

import java.util.ArrayList;

public class AddressBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Contact> contactDetails = new ArrayList<Contact>();

		AddressBook.addContact(contactDetails);
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
