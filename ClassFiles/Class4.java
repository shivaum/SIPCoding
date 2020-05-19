// https://github.com/shivaum/ShelterInPlaceCodingJava
// https://tinyurl.com/ShelterCoding

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

// import java.util.*;

public class Class4 {
	public static void main(String[] args) {
		Random rand = new Random();
		int randInt = rand.nextInt(6) + 1; // 1 2 3 4 5 6
		System.out.println("The dice rolled a " + randInt);

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = scan.nextLine();
		System.out.println(name);

		System.out.print("Enter your age: ");
		// int age = scan.nextInt();
		// System.out.println("My age is " + age);

		if (scan.hasNextInt()) {
			int age = scan.nextInt();
			System.out.println("My age is " + age);
		} else {
			System.out.println("Your input was invalid.");
		}

		System.out.print("Enter a number: ");
		int myNumber = scan.nextInt();
		if (myNumber % 2 != 0) {
			System.out.println(myNumber + " is odd");
		} else {
			System.out.println(myNumber + " is even");
		}

		// for loops - you know exactly the number of times to run a loop
		// for (statement 1; statement 2; statement 3) {
		//		(code)
		// }

		// i++
		// i += 1
		// i = i + 1

		for (int i = 1; i <= 10; i++) {
			System.out.println("The value of i is: " + i);
		}

		System.out.println();

		// // j--
		// // j -= 1
		// // j = j - 1

		for (int j = 10; j >= 1; j--) {
			System.out.println("The value of j is: " + j);
		}

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a decimal: ");
		double decimal = scan.nextDouble();
		System.out.println(decimal);

		System.out.print("Enter a minimum: ");
		int min = scan.nextInt();

		System.out.print("Enter a maximum: ");
		int max = scan.nextInt();

		for (int i = min; i < max; i++) {
			System.out.println(i);
		}
		System.out.println();

		// while loops
		// while (condition) {
        //	(code)
        // }

        int count = 1;
        while (count <= 5) {
        	System.out.println(count);
        	count++;
        }

        while(true) {
        	System.out.println("Hello");
        }

		// arrays
		int[] arr = {2, 11, 45, 9, 12, 14, 15};
		// int[] arr = {2, 11, 45, 9};
		// 2 11 45 9
		// 0 1  2  3

		System.out.println(arr);

		System.out.println(Arrays.toString(arr));

		String myTempString = "This is a string";
		System.out.println(myTempString.length());

		int arrLength = arr.length;

		// i = 0 arr[0] = 2
		// Element at index 0: 2
		// i = 1 arr[1] = 11
		// Element at index 1: 11

		for (int i = 0; i < arrLength; i++) {
			System.out.println("Element at index " + i + ": " + arr[i]);
		}

		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		System.out.println(cars[0]);

		cars[0] = "Mercedes";

		System.out.println(Arrays.toString(cars));

		cars[2] = "Acura";

		System.out.println(Arrays.toString(cars));

		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}


	}
}