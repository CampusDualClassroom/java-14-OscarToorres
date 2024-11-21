package com.campusdual.classroom;

public class Person {
	protected String name;
	protected String surname;

	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public void getDetails() {
		System.out.print("Nombre: " + this.name + " Apellidos: " + this.surname);
	}

}
