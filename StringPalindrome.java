package week2.day1.assignments;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stringName = "radar";
		String reverseString = "";
		char[] charArray = stringName.toCharArray();
		for(int i = charArray.length-1; i >=0 ;i--) {
		
			reverseString = reverseString + charArray[i];
		}
		
		System.out.println(reverseString);
		if(stringName.equalsIgnoreCase(reverseString)) {
			System.out.println("The given String " +stringName + " is palindrome");
		}else {
			System.out.println("The given String " +stringName + " is not palindrome");
		}

	}

}

