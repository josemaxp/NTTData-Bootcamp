package com.nttdata.prototype;

public class Student extends Person {
	public Double averageMark;

	public Student() {
	}

	public Student(Student student) {
		super(student);
		if (student != null) {
			this.averageMark = student.averageMark;
		}
	}

	@Override
	public Person clone() {
		return new Student(this);
	}

	@Override
	public String toString() {
		return super.toString() + "Student [averageMark=" + averageMark + "]";
	}

}
