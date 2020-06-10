import java.util.Arrays;

public class Class8 {
	public static void main(String[] args) {
		String[] words = {"a", "bb", "b", "ccc"};
		// System.out.println(wordsCount(words, 1));
		// System.out.println(repeatSeparator("Word", "X", 3));
		// System.out.println(sumDigits(343));
		// System.out.println(isPalindrome("Shivaum"));
		// String reverse = reverseString("Shivaum");
		// System.out.println(isPalindrome("Shivaum" + reverse));
		int[] nums = {2, 11, 13, 5};
		System.out.println(Arrays.toString(twoSum(nums, 7)));
	}

	// Given an array of strings, return the count of the number of strings 
	// with the given length.

	// wordsCount(["a", "bb", "b", "ccc"], 1) → 2
    // wordsCount(["a", "bb", "b", "ccc"], 3) → 1
    // wordsCount(["a", "bb", "b", "ccc"], 4) → 0

	public static int wordsCount(String[] words, int len) {
		int numWords = 0;
		// loop through words array
		for (String word: words) {
			// find all words with given length
			if (word.length() == len) {
				numWords += 1;
				// numWords = numWords + 1;
			}
		}
		return numWords;
	}

	// Given two strings, word, seperator return the string and separator with 
	// a count occurences of this word

	// repeatSeparator("Word", "X", 3) → "WordXWordXWord"
    // repeatSeparator("This", "And", 2) → "ThisAndThis"
    // repeatSeparator("This", "And", 1) → "This"

	public static String repeatSeparator(String word, String separator, int count) {
		String result = "";
		result += word;

		count -= 1;

		for (int i = 0; i < count; i++) {
			result += separator;
			result += word;
		}

		return result;
	}

	// Given a non-negative integer, return the sum of all digits in the integer
	// 126 -> 9 = 6 + 2 + 1
	// 49 -> 13 = 4 + 9

	// 343 % 10 = 3
	// 343 / 10 = 34

	public static int sumDigits(int n) {
		// base case
		if (n == 0) {
			return 0;
		}
		return ((n % 10) + sumDigits(n / 10));
	}

	// 343
	// 3 + sumDigits(34)
	//     4 + sumDigits(3)
	//         3 + sumDigits(0)
	//             0
	// 10

	// Checking if a word is a palindrome
	// radar - true
	// abcdcba - true
	// truck - false
	// level - true
	// racecar - true
	// deed - true

	public static boolean isPalindrome(String str) {
		int startIndex = 0;
		int endIndex = str.length() - 1;

		while (startIndex < endIndex) {
			if (str.charAt(startIndex) != str.charAt(endIndex)) {
				return false;
			}
			startIndex += 1;
			endIndex -= 1;
		}
		return true;
	}

	// take in a string and return the reverse of the string
	// reverseString("test") -> "tset"
    // reverseString("hello") -> "olleh"
    // reverseString("level") -> "level"

    public static String reverseString(String input) {
    	String reverse = "";
    	for (int i = input.length() - 1; i >= 0; i--) {
    		reverse += input.charAt(i);
    	}
    	return reverse;
    }

    // hello
    // input.length() = 5
    // i = 4
    // input.charAt(4) = 'o'
    // i = 3
    // input.charAt(3) = 'l'
    // i = 2
    // input.charAt(2) = 'l'
    // i = 1
    // input.charAt(1) = 'e'
    // i = 0
    // input.charAt(0) = 'h'
    // i = -1

    // Given an array of integers, return indices of the two numbers 
    // such that they add up to a specific target.
    // You may assume that each input would have exactly one solution, 
    // and you may not use the same element twice.
    // INTERVIEW PROBLEM

    // Given nums = [2, 7, 11, 15], target = 9,
    // Because nums[0] + nums[1] = 2 + 7 = 9
    // return [0, 1]

    public static int[] twoSum(int[] nums, int target) {
    	int[] result = new int[2];
    	for (int i = 0; i < nums.length; i++) {
    		for (int j = i + 1; j < nums.length; j++) {
    			if (nums[i] + nums[j] == target) {
    				result[0] = i;
    				result[1] = j;
    				break;
    			}
    		}
    	}
    	return result;
    }


}