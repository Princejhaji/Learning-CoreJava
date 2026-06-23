package javaLearning1;

public class PalindromeNumber {
	static boolean PalindromNumberCheck(int num) {
		int reverse = 0;
		int originalNumber = num;
		while(num != 0) {
			int lastDigit = num%10;
			reverse = (reverse*10 + lastDigit);
		    num = num / 10;
		}
		if(reverse == originalNumber) {
			return true;
		}
		
		return false;
	}
  
	public static void main(String[] arg) {
		System.out.print(PalindromNumberCheck(122));
	}
}
