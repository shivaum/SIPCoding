public class HW2JavaSol {
	public static void main(String[] args) {
		boolean x = true;
		x = !x;

		System.out.println("An example of using booleans is we can use them to store whether or not a player won a game!");

		char c = 'a';

		System.out.println("An example of using chars is we can use them to convert numbers to letters (you can look up ASCII if you're curious)");

		String s = "In class today, we went over the primitive types boolean and char.";
		System.out.println(s.indexOf("boolean and"));

		String newS = s.substring(0, 49) + s.substring(61, s.length());

		System.out.println(newS);

		String s2 = "We also went over how to use different functions for String.";
		String s3 = newS + " " +s2;
		System.out.println(s3);

		int len = s3.length();

		String s4 = s3.substring(0, len-1);

		System.out.println(s4);


	}
}