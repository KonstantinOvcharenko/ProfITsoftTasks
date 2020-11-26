package ua.profitsoft.task_3;

public class Encrypter {
	public static String encrypt(String line) {

		// check length of source string
		if (line.length() > 10)
			throw new UnsupportedOperationException("Too much symbols! Max number: 10");

		// get binary representation of source string
		String binaryString = bytesToBinaryString(line.getBytes());

		// set starting value as zero or one
		char currentSequence = binaryString.charAt(0);
		String result = currentSequence == '0' ? "00 0" : "0 0";

		for (int i = 1; i < binaryString.length(); i++) {

			// check changing of char sequence
			if (binaryString.charAt(i) != currentSequence) {

				// if true start new sequence
				currentSequence = binaryString.charAt(i);
				result += currentSequence == '0' ? " 00 0" : " 0 0";
			} else {

				// if false continue present sequence
				result += "0";
			}
		}
		return result;
	}

	// method returns binary representation of some_string.getBytes()
	private static String bytesToBinaryString(byte[] bytes) {

		StringBuilder string = new StringBuilder();

		for (byte b : bytes) {
			string.append(String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0'));
		}

		return String.valueOf(string);
	}
}
