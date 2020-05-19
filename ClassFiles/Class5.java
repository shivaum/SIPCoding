// https://github.com/shivaum/ShelterInPlaceCodingJava
// https://tinyurl.com/ShelterCoding

import java.util.Scanner;
import java.util.Arrays;

public class Class5 {
	public static void main(String[] args) {
		// Scanner scan = new Scanner(System.in);
		// System.out.println("Enter a minimum: ");
		// int min = scan.nextInt();
		// System.out.println("Enter a maximum: ");
		// int max = scan.nextInt();

		// for (variable; condition; increment/decrement) {
		// 		(code)
		// }

		// for (int i = 0; i < 5; i++) {
		// 	System.out.println(i);
		// }

		// i++
		// i += 1
		// i = i + 1

		// for (int i = min; i < max; i += 5) {
		// 	System.out.println("Value of i: " + i);
		// }

		// int count = 10;
		// while (count >= 0) {
		// 	System.out.println(count);
		// 	count -= 1;
		// }

		// 			 0  1  2  3   4   5
		// int[] arr = {2, 5, 1, 10, 15, 5, 1, 1, 1, 1, 123};
		// System.out.println(Arrays.toString(arr));

		// System.out.println(arr.length);

		// arr[0] = 50;

		// System.out.println(arr[arr.length - 1]);

		// System.out.println(Arrays.toString(arr));

		// for (int i = 0; i < arr.length; i++) {
		// 	System.out.println(arr[i]);
		// }

		// String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		// for each loop
		// for (String a: cars) {
		// 	System.out.println(a);
		// }

		// 1st 
		// a = "Volvo"

		// 2nd
		// a = "BMW"

		// for (int a: arr) {
		// 	System.out.println(a);
		// }

		// int[] myArr = new int[10]; 
		// System.out.println(Arrays.toString(myArr));
		// int counter = 10;
		// for (int i = 0; i < myArr.length; i++) {
		// 	myArr[i] = counter;
		// 	counter += 10;
		// }
		// System.out.println(Arrays.toString(myArr));
		//          a  b
		// Math.max(5,10);

		double[] shoeSize = {8.5, 12, 9, 10.5, 13};
		int arrLength = shoeSize.length;
		double minSize = 1000000;
		for (int i = 0; i < arrLength; i++) {
			if (shoeSize[i] < minSize) {
				minSize = shoeSize[i];
			}
		}

		System.out.println(minSize);

		double maxShoe = 0.0;
		for (double size: shoeSize) {
			if (size > maxShoe) {
				maxShoe = size;
			}
		}

		// 1st 
		// size = 8.5
		
		// maxShoe = 8.5

		// 2nd 
		// size = 12

		// maxShoe = 12

		System.out.println(maxShoe);

		// 1st iteration
		// shoeSize[0] = 8.5
		// 8.5 > 0.0 YES - maxSize = 8.5

		// 2nd iteration
		// shoeSize[1] = 12
		// 12 > 8.5 YES - maxSize = 12

		// 3rd iteration
		// shoeSize[2] = 9
		// 9 > 12 NO

		// 4th iteration
		// shoeSize[3] = 10.5
		// 10.5 > 12 NO

		// 5th iteration
		// shoeSize[4] = 13
		// 13 > 12 YES - maxSize = 13

	}

}