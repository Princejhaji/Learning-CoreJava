package javaLearning1;

public class reverseString {
	//reversing array by concating
	static String reverseStringConcat(String s) {
		String rev = "";
		for(int i=s.length()-1 ; i>=0 ; i--) {
			rev = rev+s.charAt(i);
		}
		return rev;
	}
	
	static String reverseStringTwoPointer(String s) {
		int start = 0;
		int end = s.length()-1;
		char[] arr = s.toCharArray();
		
		while(start <= end) {
			char temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
				}
		return new String(arr);
		
	}
	public static void main(String arg[]) {
		String name = "Prince";
		//System.out.println(reverseStringConcat(name));
		
		System.out.println(reverseStringTwoPointer(name));
	}
;
}
