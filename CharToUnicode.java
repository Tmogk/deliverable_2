package convertCharacters;

import java.util.Scanner;

public class CharToUnicode {
	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		String string1;
		String string2;
		char c;
		int d;
		char e;
		int f;
		int sumOfString1 = 0;
		int sumOfString2 = 0;
		int a = 0;

		System.out.println("Enter two strings");
		string1 = scnr.nextLine();
		string2 = scnr.nextLine();

		for (int i = 0; i < string1.length(); ++i) {
			c = string1.charAt(i);
			d = string1.codePointAt(i);
			System.out.println(c + ": " + d);
			sumOfString1 = sumOfString1 + d;
		}

		for (int i = 0; i < string2.length(); ++i) {
			e = string2.charAt(i);
			f = string2.codePointAt(i);
			System.out.println(e + ": " + f);
			sumOfString2 = sumOfString2 + f;
		}

		a = sumOfString1 - sumOfString2;
		System.out.println("Difference as absolute value: " + Math.abs(a));

		scnr.close();
	}
}