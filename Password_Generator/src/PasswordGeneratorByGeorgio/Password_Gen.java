package PasswordGeneratorByGeorgio;

import java.util.Scanner;
import java.util.Random;

public class Password_Gen {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int len, count = 0;
		boolean generateNewPassword = true;

		System.out.println("Hello world!");
		System.out.println("Simple Password Generator made by Georgio");
		System.out.println();

		System.out.print("Enter password Length (0 to terminate program) : ");
		len = scanner.nextInt();

		while (len < 0) {
			System.out.println("Invalid input!");
			System.out.println("Please enter a positive number.");
			System.out.print("Enter password Length (0 to terminate program) : ");
			len = scanner.nextInt();

		}
		if (len != 0 && len > 0) {
			count++;
			System.out.println("========");
			System.out.println("Generated password " + count + " :" + passwordGen(len));
		}
		if (len == 0) {
			System.out.println("Program terminated.");
			generateNewPassword = false;
		}

		while (generateNewPassword) {
			System.out.print("Enter password Length to generate new password (0 to terminate program) : ");
			len = scanner.nextInt();

			while (len < 0) {
				System.out.println("Invalid input!");
				System.out.println("Please enter a positive number.");
				System.out.print("Enter password Length to generate new password (0 to terminate program) : ");
				len = scanner.nextInt();

			}
			if (len != 0 && len > 0) {
				count++;
				System.out.println("========");
				System.out.println("Generated password " + count + " :" + passwordGen(len));
			}
			if (len == 0) {
				System.out.println("Program terminated.");
				generateNewPassword = false;
			}

		}

	}

	public static String passwordGen(int len) {

		Random random = new Random();
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		String password = "";

		for (int i = 0; i < len; i++) {
			password += characters.charAt(random.nextInt(characters.length()));
		}
		return password;
	}
}
