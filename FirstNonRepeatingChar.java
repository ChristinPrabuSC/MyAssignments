package assign.week2.day1;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		String s = "aabbeeffgh";

		for (int i = 0; i < s.length(); i++) {
			
				if (s.indexOf(s.charAt(i), s.indexOf(s.charAt(i)) + 1) == -1) {
				System.out.println("Index of first non-repeating character is " + i);
				break;
			} else if (i == (s.length() - 1)) {
				System.out.println("-1");
			} else {
				continue;
			}
		}

	}
}