package com.nttdata.prototype;

public abstract class Person {
	public String name;
	public String lastName;
	public String documentId;

	public Person() {

	}

	public Person(Person person) {
		if (person != null) {
			this.name = person.name;
			this.lastName = person.lastName;
			this.documentId = person.documentId;
		}
	}

	public abstract Person clone();

	@Override
	public String toString() {
		return "Person [name=" + name + ", lastName=" + lastName + ", documentId=" + documentId + "]";
	}

}
