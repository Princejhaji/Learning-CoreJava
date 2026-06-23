package javaLearning1;

public class countWord {
	static int countWords(String str) {
		String[] words = str.split(" ");
		return words.length;
	}
	
	public static void main(String[] arg) {
		String sentence = "My Name is Prince Jha";
		System.out.println(countWords(sentence));
	}
	

}
