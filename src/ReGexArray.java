import java.util.Scanner;

public class ReGexArray {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int i = 0;
		String student = "";
		String townOrFood = "";
		String hometown = "";
		String favFood = "";
		String contLearning = "";

		String[] students = { "Gary", "Sue", "Tim", "Pat", "Jim", "Mary", "Bob", "Gail", "Pam", "Erin" };

		String[] hometowns = { "Ann Arbor, MI", "Jackson, MI", "Brighton, MI", "Livonia, MI", "Novi, MI", "Wixom, MI",
				"Port Huron, MI", "Monroe, MI", "Indianapolis, IN", "Philadelphia, PA" };

		String[] favoriteFoods = { "Burger and fries", "Fish and chips", "Salad", "Squash soup", "Steak",
				"Peanut Butter", "Pizza", "Pasta", "Cake", "Tacos" };

		boolean contLoop;
		boolean contLoop2 = true;
		boolean contLoop3 = true;
		System.out.print("Welcome to Java Class. ");
		do {
			System.out.println("Which student would you like to learn about? (Enter a number between 1 and 10)");

			do {

				try {

					contLoop = true;
					i = scnr.nextInt();
					student = students[i - 1];
				} catch (IndexOutOfBoundsException e) {
					System.out.println("Number must be between 1 and 10.");
					contLoop = false;
				} catch (Exception e) {
					System.out.println("You must enter a number.");
					contLoop = false;
					scnr.next();
				}

			} while (contLoop == false);

			scnr.nextLine();
			do {

				System.out.println(
						"You picked student " + i + ", " + student + ". What else would you like to learn about "
								+ student + "? (Please type \"Hometown\" or \"Favorite food\")");

				do {

					try {

						contLoop = true;
						townOrFood = scnr.nextLine();

						if (townOrFood.equalsIgnoreCase("hometown")) {
							hometown = hometowns[i - 1];
							System.out.println(student + "'s hometown is " + hometown);

						} else if (townOrFood.equalsIgnoreCase("favorite food")) {
							favFood = favoriteFoods[i - 1];
							System.out.println(student + "'s favorite food is " + favFood);
						} else {
							System.out.println("You need to enter \"Hometown\" or \"Favorite food\"");
							contLoop = false;
						}

					} catch (Exception e) {
						System.out.println("You really must enter \"Hometown\" or \"Favorite food\"");
						contLoop = false;

					}

				} while (contLoop == false);

				System.out.println("Would you like to learn more about " + student + "? (Yes/No)");
				contLearning = scnr.nextLine();
				if (contLearning.equalsIgnoreCase("yes")) {
					contLoop2 = false;
				} else if (contLearning.equalsIgnoreCase("maybe")) {
					System.out.println("I'm going to take that as a yes.");
					contLoop2 = false;
				} else {
					System.out.println("Would you like to learn about another student? (Yes/No)");
					contLoop2 = true;
				}

			} while (contLoop2 == false);

			contLearning = scnr.nextLine();
			if (contLearning.equalsIgnoreCase("yes")) {
				contLoop3 = false;
			} else if (contLearning.equalsIgnoreCase("maybe")) {
				System.out.println("I'm going to take that as a yes.");
				contLoop3 = false;
			} else {
				System.out.println("GoodBye");
				contLoop3 = true;
			}

		} while (contLoop3 == false);
	}
}