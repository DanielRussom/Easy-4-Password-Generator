package application;

import java.util.Random;

public class PasswordGenerator {
	private static String list = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

	/**
	 * Generates random password
	 * @return generated password.
	 */
	public static String generatePassword() {
		// Sets the default length
		int length = 10;
		String password = "";
		Random indexPicker = new Random();
		// Picks random character from preset list and appends to current password
		for (int i = 0; i < length; i++) {
			password = password + list.charAt(indexPicker.nextInt(list.length()));
		}
		return password;
	}

	public static String generatePassword(int length) {
		String password = "";
		Random indexPicker = new Random();
		// Picks random character from preset list and appends to current password
		for (int i = 0; i < length; i++) {
			password = password + list.charAt(indexPicker.nextInt(list.length()));
		}
		return password;
	}
}
