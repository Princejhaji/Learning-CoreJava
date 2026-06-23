package javaLearning1;

public class checkPalindromeString{
	
	static boolean checkPalindromeTwoPointer(String s) {
		int start = 0;
		int end = s.length()-1;
		char[] arr = s.toCharArray();		
		while(start <= end) {
			if(arr[start] == arr[end]) {
				start++;
				end--;
			}
			else {
				return false;
			}
		}
		return true;
	}
	
    public static void main(String[] arg) {
    	String str = "racecar";
    	System.out.println(checkPalindromeTwoPointer(str));
    }
}
