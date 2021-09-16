package week2.day1.assignments;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		char[] charArray = test.toCharArray();

		int letter = 0, num = 0, specialCharacter = 0, space = 0;

		for (int i = 0; i < charArray.length; i++) {
			if (Character.isDigit(charArray[i])) {
				num++;

			} else if (Character.isLetter(charArray[i])) {
				letter++;

			} else if (Character.isSpaceChar(charArray[i])) {
				space++;

			} else {
				specialCharacter++;

			}
			
		}
		System.out.println("number: " + num);
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("specialCharcter: " + specialCharacter);
	}
}
