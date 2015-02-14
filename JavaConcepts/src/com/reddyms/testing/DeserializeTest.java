package com.reddyms.testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.reddyms.concepts.Employee;

public class DeserializeTest {

	public static void main(String[] args) {

		Employee e = null;

		try (FileInputStream fileIn = new FileInputStream(
				"C:\\Users\\Manish\\workspaceEE\\JavaConcepts\\temp\\employee.ser");
				ObjectInputStream input = new ObjectInputStream(fileIn);) {
			e = (Employee) input.readObject();

		} catch (IOException i) {
			i.printStackTrace();
			return;
		} catch (ClassNotFoundException c) {
			System.out.println("Employee class not found");
			c.printStackTrace();
			return;
		}
		System.out.println("Deserialized Employee...");
		System.out.println("Name: " + e.name);
		System.out.println("Address: " + e.address);
		System.out.println("SSN: " + e.SSN);
		System.out.println("Number: " + e.number);

	}

}
