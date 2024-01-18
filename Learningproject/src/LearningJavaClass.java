
public class LearningJavaClass {

	public static void main(String args[]) {
		String originalString = "First Second";
		String reversedString = reverseStringWithCapitalization(originalString);
		System.out.println(reversedString);
	}

	private static String reverseStringWithCapitalization(String input) {
		String[] words = input.split(" ");
		StringBuilder reversedStringBuilder = new StringBuilder();

		for (String word : words) {
			StringBuilder reversedWord = new StringBuilder(word).reverse();
			reversedWord.setCharAt(0, Character.toUpperCase(reversedWord.charAt(0)));
			reversedWord.setCharAt(word.length()-1,
					Character.toLowerCase(reversedWord.charAt(word.length()-1)));

			reversedStringBuilder.append(reversedWord).append(" ");
		}

		return reversedStringBuilder.toString().trim();
	}
}
