package strings;

public class StringReverseEachWord {

	public void reverseEachwordString(String str) {
		
		String[] words = str.split(" ");
		String ReversedString="";
		for(int i=0;i<words.length;i++) {
			
			String word = words[i];
			String reverseword="";
			
			for(int j=word.length()-1;j>=0;j--) {
				
				reverseword+=word.charAt(j);
				
			}
			ReversedString+=reverseword+" ";
			
		}
		
		System.out.println(str);
		System.out.println(ReversedString);
		
	}
	public static void main(String[] args) {
		
		StringReverseEachWord ob = new StringReverseEachWord();
		ob.reverseEachwordString("My name is Mamata");
	}

}
