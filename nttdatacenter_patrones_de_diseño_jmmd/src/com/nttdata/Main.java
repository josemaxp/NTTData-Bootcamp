package com.nttdata;

import java.util.ArrayList;
import java.util.List;

import com.nttdata.builder.VideogameBuilder;
import com.nttdata.prototype.Person;
import com.nttdata.prototype.Student;
import com.nttdata.repository.Videogame;
import com.nttdata.singleton.Singleton;

public class Main {

	public static void main(String[] args) {

		System.out.println("\n-----------BUILDER----------------\n");
		VideogameBuilder builder = new VideogameBuilder();

		builder.setName("God of War: Rägnarok");
		// builder.setConsole("PlayStation 5");
		builder.setScore(9.4);

		Videogame videogame = builder.build();

		System.out.println(videogame);

		System.out.println("\n-----------SINGLETON----------------\n");

		builder = new VideogameBuilder();

		builder.setName("Horizon Zero Dawn");
		builder.setConsole("PlayStation 5");
		builder.setScore(8.5);

		Videogame videogame2 = builder.build();

		Singleton singleton = Singleton.getInstance(videogame2);
		Singleton anotherSingleton = Singleton.getInstance(videogame);
		System.out.println(singleton.videogame.toString());
		System.out.println(anotherSingleton.videogame.toString());

		System.out.println("\n-----------PROTOTYPE----------------\n");

		Student student = new Student();
		student.name = "José Manuel";
		student.lastName = "Marín";
		student.documentId = "12345678A";
		student.averageMark = 8.0;

		Person studentCloned = (Student) student.clone();

		System.out.println("Estudiante: " + student);
		System.out.println("Estudiante clonado: " + studentCloned);

	}

}
