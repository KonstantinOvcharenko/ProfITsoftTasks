package ua.profitsoft.task_3;

import static ua.profitsoft.task_3.Encrypter.encrypt;

public class Demo {
	public static void main(String[] args) {
		System.out.println("G -> " + encrypt("G"));
		System.out.println("GO -> " + encrypt("GO"));
		System.out.println("Java -> " + encrypt("Java"));
	}
}
