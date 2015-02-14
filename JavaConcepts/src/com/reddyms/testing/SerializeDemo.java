package com.reddyms.testing;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.reddyms.concepts.Employee;

public class SerializeDemo {

	public static void main(String[] args) {

		Employee e = new Employee();
		e.name = "John Doe";
		e.address = "123 Anystreet ave, Nocity, Nostate, 50266";
		e.SSN = 112233445;
		e.number = 101;

		try (FileOutputStream fileOut = new FileOutputStream(
				"C:\\Users\\Manish\\workspaceEE\\JavaConcepts\\temp\\employee.ser");
				ObjectOutputStream out = new ObjectOutputStream(fileOut);) {
			out.writeObject(e);
			System.out
					.println("Serialized employee object is saved in /JavaConcepts/temp");

		} catch (IOException i) {
			i.printStackTrace();
		}

	}

}
