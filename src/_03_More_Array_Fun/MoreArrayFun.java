package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	static String[] s = { "a", "b", "c", "d", "e" };
	// 1. Create a main method to test the other methods you write.

	public static void main(String[] args) {
		MoreArrayFun fun = new MoreArrayFun();
		fun.printArray(s);
		fun.printArrayEveryOther(s);
		fun.printArrayRandom(s);
		fun.printArrayReverse(s);
	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.
	void printArray(String[] s) {
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	void printArrayReverse(String[] s) {
		for (int i = s.length-1; i >= 0; i--) {
			System.out.println(s[i]);
		}
	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	void printArrayEveryOther(String[] s) {
		for (int i = 0; i < s.length; i += 2) {
			System.out.println(s[i]);
		}
	}

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.
	void printArrayRandom(String[] s) {
		for (int i = 0; i < s.length; i++) {
			Random random = new Random();
			System.out.println(s[random.nextInt(s.length)]);
		}
	}

}
