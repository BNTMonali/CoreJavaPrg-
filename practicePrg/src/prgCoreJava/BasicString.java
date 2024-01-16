package prgCoreJava;

public class BasicString {

	public static void printEvenWords(String s) {
		// Splits Str into all possible tokens
		for (String word : s.split(" "))
			// if length is even
			if (word.length() % 2 == 0)
				// Print the word
				System.out.println(word);
	}

	public static String removeZero(String str) {

		// Count leading zeros

		// Initially setting loop counter to 0
		int i = 0;
		while (i < str.length() && str.charAt(i) == '0')
			i++;

		// Converting string into StringBuffer object
		// as strings are immutable
		StringBuffer sb = new StringBuffer(str);

		// The StringBuffer replace function removes
		// i characters from given index (0 here)
		sb.replace(0, i, "");

		// Returning string after removing zeros
		return sb.toString();
	}

	public static void main(String[] args) {
		String s = "I am from BNT SOFT";
		printEvenWords(s);

		// --------------------- reverse string--------------
		String s1 = "Bntsoft Employee";

		// convert String to character array
		// by using toCharArray
		char[] str = s1.toCharArray();

		for (int i = str.length - 1; i >= 0; i--)
			System.out.print(str[i]);
		// -----------------------------------------
		System.out.println();
		// Sample string input
		String string = "00000123569";

		// Calling method 1 to count leading zeroes
		// in above string
		string = removeZero(string);

		// Printing leading zeros inside string
		System.out.println(string);

	}
}
