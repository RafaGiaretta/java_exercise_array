package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of people:");
		int n = sc.nextInt();
		double sum = 0;
		int count_age = 0;

		Person[] vec = new Person[n];

		for (int i = 0; i < vec.length; i++) {
			sc.nextLine();
			int count = i + 1;
			System.out.println("Data of " + count + "st person: ");
			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.println("Age: ");
			int age = sc.nextInt();
			System.out.println("Height: ");
			double height = sc.nextDouble();
			vec[i] = new Person(name, age, height);
		}

		for (int i = 0; i < vec.length; i++) {
			sum += vec[i].getHeight();
		}

		double avg = sum / n;
		System.out.println("Average heigh: " + avg);

		for (int i = 0; i < vec.length; i++) {
			if (vec[i].getAge() < 16) {
				System.out.println(vec[i].getName());
				count_age++;
			}
		}

		double under_16 = (100 / n) * count_age;
		System.out.println("People under 16: " + under_16 + "%");

		sc.close();
	}

}
