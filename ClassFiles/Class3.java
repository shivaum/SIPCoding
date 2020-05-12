// https://github.com/shivaum/ShelterInPlaceCodingJava
// https://tinyurl.com/ShelterCoding

//import java.util.*;
import java.util.Random;

public class Class3 {
	public static void main(String[] args) {
		String str = "This is a string";
		System.out.println(str.substring(0, 5));
		System.out.println(str.length());

		String anotherStr = " Another string";
		str += anotherStr;
		System.out.println(str);

		int a = 5;
		int b = 11;
		int sum = a + b; // sum = 15

		// modulus
		int remainder = b % a;
		// System.out.println(remainder);

		// 11 / 5 = 2 R 1

		System.out.println("Max: " + Math.max(a, b));
		System.out.println("Min: " + Math.min(a, b));
		System.out.println("Square root: " + Math.sqrt(25));
		System.out.println("Power: " + Math.pow(5, 2));
		System.out.println("Absolute Value: " + Math.abs(-4.7));

		double randNum = Math.random() * 6;

		System.out.println((int) randNum);

		Random rand = new Random();
		int randomInteger1 = rand.nextInt(6) + 1; // 1 2 3 4 5 6 
		// System.out.println(randomInteger1);

		double randomDouble = rand.nextDouble();
		// System.out.println(randomDouble);

		boolean isTrue = true;
		boolean isFalse = false; // false

		// isFalse = !isFalse; // true

		// true and true - true
		// true and false - false	
		// false and true - false
		// false and false - false

		// true or true - true
		// true or false  - true
		// false or true - true
		// false or false - false

		// && - and
		// || - or
		// System.out.println(isFalse && isTrue);
		// System.out.println(isTrue || isFalse);

		if ((17 > 20) && (20 == 20)) {
			System.out.println("1");
		} else if ((17 > 20) || (20 != 20)) {
			System.out.println("2");
		} else {
			System.out.println("3");
		}

		// > - greater than
		// < - less than
		// >= - greater than equal
		// <= - less than equal
		// != - does not equal to
		// == - equal to

		int x = 100;
		int y = 50;

		System.out.println(20 < 17);

		if (x > y) {
			System.out.println("x is greater than y");
		} else if (x == y) {
			System.out.println("x is equal to y");
		} else {
			System.out.println("x is less than y");
		}

		int time = 15;

		if (time < 12) {
			System.out.println("Good Morning.");
		} else if (time >= 12 && time <= 17) {
			System.out.println("Good Afternoon.");
		} else {
			System.out.println("Good Evening.");
		}

		// 16 - even
		// 31 - odd

		int num = 27;
		if (num % 2 == 0) {
			System.out.println("My number is even.");
		} else {
			System.out.println("My number is odd.");
		}

	}
}