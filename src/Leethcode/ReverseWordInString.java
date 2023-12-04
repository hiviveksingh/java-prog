package Leethcode;

public class ReverseWordInString {

	public static void main(String[] args) {

		System.out.println(" Output...."+ReverseWordInString.reverseWords("Sky       is                  blue  little"));

	}

	public static String reverseWords(String s) {
		// Trim the input string to remove leading and trailing spaces
		String[] str = s.trim().split("\\s+");

		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < str.length; i++) {
			sb.append(str[str.length - i - 1]);
			sb.append(" ");
			System.out.println(sb);
		}
		return sb.toString();
	}

}
