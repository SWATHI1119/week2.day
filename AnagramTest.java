package week2.day1.assignments;
import java.util.Arrays;
public class AnagramTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text1 = "stops";
		String text2 = "poyss";
		char[] text1Array = text1.toCharArray();
		char[] text2Array = text2.toCharArray();
		System.out.println(text1Array);
		System.out.println(text2Array);
		if(text1Array.length == text2Array.length) {
		
			 Arrays.sort(text1Array);
			 Arrays.sort(text2Array);
			
		
			if(Arrays.equals(text1Array,text2Array)) {
				
				
				System.out.println("is anagram");
			}
			else {
				
				System.out.println("is not anagram");
			
		}
		}else {
			System.out.println("is not anagram");
			}
		}

}


