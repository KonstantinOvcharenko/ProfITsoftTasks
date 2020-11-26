package ua.profitsoft.task_2;

public class StringRecursion {
	// vowel vocabulary
	private static String vowels = "AEIOUYaeiouy";

	public static String interviewRecursionTest(String line) {
		// return condition
		if (line.length() == 1)
			return "" + line.charAt(0);

		// save string from current context
		String current = String.valueOf(line.charAt(0));

		// get string from previous context by recursive call
		String previous = interviewRecursionTest(line.substring(1, line.length()));

		// check current and previous contexts like left and right part of string
		if (vowels.contains(current) || vowels.contains(String.valueOf(previous.charAt(0))))
			current += "*";

		// build result
		return current + previous;
	}
}