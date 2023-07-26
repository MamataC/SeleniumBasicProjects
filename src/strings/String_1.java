package strings;

public class String_1 {

	public void reverseString(String str) {

		String[] words = str.split(" ");
		String reversedString = "";
		
		for(int i=0;i<words.length;i++) {
			
			String word = words[i];
			String reverseword="";
			
			for(int j=word.length()-1;j>=0;j--) {
				
				reverseword=reverseword+word.charAt(j);
				
			}
			reversedString+=reverseword+" ";
		}
		System.out.println(str);
		System.out.println(reversedString);
	}

	public static void main(String[] args) {

		String_1 ob = new String_1();
		ob.reverseString("My name is Mamata");

	}

}
