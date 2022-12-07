package com.nttdata.mvn;

import org.apache.commons.lang3.StringUtils;

public class App {

	/**
	 * Main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Create message
		final String message = "Hello world!";

		// Execute message
		sayHello(message);
	}

	/**
	 * To greet
	 * 
	 * @param msg
	 */
	public static void sayHello(final String msg) {

		// Check if it is not empty, null or whitespace only.
		if (StringUtils.isNoneBlank(msg)) {

			// Show message
			System.out.println(msg);

		} else {

			// Show error message
			System.out.println("Error");
		}
	}
}
