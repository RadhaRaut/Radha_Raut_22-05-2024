package com.javaGeneralConcepts;

public class A {
public static void main() {
		
		System.out.println("main method without parameters");
		
	}

	public static void main(String[] args) {

		System.out.println("main method with parameters");
		main();
	}

}
